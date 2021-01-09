source /etc/profile
cd ..
java -jar -Xms256m -Xmx1024m -XX:MetaspaceSize=128m -XX:MaxMetaspaceSize=512m ruoyi-admin/target/ruoyi-admin.jar