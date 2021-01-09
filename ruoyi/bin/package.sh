echo "[INFO] build the project for generating wars/jars."
source /etc/profile
cd /opt/ruoyi

mvn clean package -Dmaven.test.skip=true