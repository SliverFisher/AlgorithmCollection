#!/bin/bash
cur_time=$(date '+%Y-%m-%d')
echo "current time: is $cur_time"
cur_folder_path="/db_backup/$cur_time"
sevendays_time=$(date -d -15days '+%Y-%m-%d')
last_folder_path="/db_backup/$sevendays_time"

mkdir -p /db_backup/$cur_time
rm -rf /db_backup/$sevendays_time
rm -rf /db_backup/$sevendays_time.tar.gz

echo "Starting Backup PostgreSQL ..."
pg_dump  -h localhost -U dbadmin hzfa   > "/db_backup/$cur_time/db.dmp"

tar zcvf "/db_backup/$cur_time.tar.gz" "$cur_folder_path/db.dmp"
echo "Remove temp file ..."
rm -rf "$cur_folder_path/*.dmp"
echo "Finish Backup ..."
echo "finish upload to remote machine"