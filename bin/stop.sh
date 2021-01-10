echo "[INFO] stop the application."
source /root/.bashrc
cd /opt/ruoyi

ps -ef|grep java|grep -v grep|awk '{print $2}'|xargs kill