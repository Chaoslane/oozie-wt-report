use kfc_trk;
set hive.exec.reducers.max=30;
set mapreduce.output.fileoutputformat.compress=true;
set hive.merge.mapfiles = true; 
set hive.merge.mapredfiles = true; 
set hive.merge.size.per.task = 256000000; 
set hive.merge.smallfiles.avgsize=16000000; 

truncate table rpt_wt_user_activeoutline;

insert overwrite table rpt_wt_user_activeoutline
select a.pt
,a.spreadid
,COUNT(DISTINCT (CASE WHEN a.brand_new_user = 0 THEN a.device_id END))
,count(distinct a.device_id)
,b.total
,CONCAT (ROUND(COUNT(DISTINCT (CASE WHEN a.brand_new_user = 0 THEN a.device_id END))/count(distinct a.device_id)*100,2),'%')
,ROUND(SUM(a.session_duration)/count(distinct a.device_id),2)
from rst_superapp_log a 
left join 
(select spreadid,count(distinct device_id) as total from rst_superapp_log where pt <= ${date} group by spreadid) b
on a.spreadid=b.spreadid
 where a.data_source = 1 and a.pt = ${date} group by a.pt,a.spreadid,b.total;
