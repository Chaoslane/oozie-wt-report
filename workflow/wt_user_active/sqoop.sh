#! /bin/bash
source ./db.conf
date=$1

sqoop export --connect ${pgjdbc} --username ${pgusername} --password ${pgpassword} --table tmp_wt_user_activeoutline --export-dir /user/hive/warehouse/kfc_trk.db/rpt_wt_user_activeoutline --input-fields-terminated-by "\t" --input-lines-terminated-by "\n" --input-null-string "\\\\N" --input-null-non-string "\\\\N"

if [ $? -eq 0 ];then
  echo "DELETE FROM rpt_wt_user_activeoutline WHERE dt =:date;INSERT INTO rpt_wt_user_activeoutline SELECT * FROM tmp_wt_user_activeoutline WHERE dt=:date;truncate tmp_wt_user_activeoutline;" > rollback
  psql -h ${pghost} -p ${pgport} -U "${pgusername}" ${pgdatabase} -v date=${date} -f rollback
fi
