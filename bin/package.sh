echo "[INFO] build the project for generating wars/jars."
source /root/.bashrc
cd /opt/ruoyi

mvn clean package -Dmaven.test.skip=true