#/bin/bash
source ./db.conf

if [ $# -ne 0 ];then
	if [ `echo $1|wc -L` -eq 8 ];then
        date=$1
    else
        echo "Command error,Usage:sh start.sh YYYYMMDD"
        exit 1
    fi
else
    date=`date +%Y%m%d -d "-1 day"`
fi

hive --hivevar date="'${date}'" -f rpt_wt_user_activeoutline.hql

sh sqoop.sh "'${date}'"


