echo "[INFO] stop the application."
source /etc/profile
cd /opt/ruoyi

ps -ef|grep java|grep -v grep|awk '{print $2}'|xargs kill