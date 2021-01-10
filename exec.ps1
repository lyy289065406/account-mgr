param([string]$script_name="")

if(!$script_name) {
    Write-Host "Usage: ./exec.ps1 [script_name]"
    Write-Host "script_name list :"
    Write-Host "  (1) up          :   build and up docker environment"
    Write-Host "  (2) init        :   init database"
    Write-Host "  (3) cln/clean   :   mvn clean"
    Write-Host "  (4) pkg/package :   mvn package"
    Write-Host "  (5) run/start   :   run the application"
    Write-Host "  (6) stop        :   stop the application"
    Write-Host "  (7) down        :   stop environment"
    Write-Host "  (*) shell/bash  :   switch to docker environment (container shell)"

} elseif($script_name -eq "up") {
    docker-compose up -d

} elseif($script_name -eq "init") {
    docker exec -u mysql ACCOUNT_MGR /bin/bash -c "mysql -uroot -p123456 -e 'source /var/sql/init.sql'"
    docker exec -u mysql ACCOUNT_MGR /bin/bash -c "mysql -uroot -p123456 -e 'source /opt/ruoyi/sql/ry_20201214.sql'"
    docker exec -u mysql ACCOUNT_MGR /bin/bash -c "mysql -uroot -p123456 -e 'source /opt/ruoyi/sql/quartz.sql'"
    docker exec -u mysql ACCOUNT_MGR /bin/bash -c "mysql -uroot -p123456 -e 'source /var/sql/am.sql'"

} elseif($script_name -eq "cln" -Or $script_name -eq "clean") {
    docker exec -u root ACCOUNT_MGR /bin/bash -c "/run/ruoyi/clean.sh"

} elseif($script_name -eq "pkg" -Or $script_name -eq "package") {
    docker exec -u root ACCOUNT_MGR /bin/bash -c "/run/ruoyi/package.sh"

} elseif($script_name -eq "run" -Or $script_name -eq "start") {
    docker exec -u root ACCOUNT_MGR /bin/bash -c "/run/ruoyi/run.sh"

} elseif($script_name -eq "stop") {
    docker exec -u root ACCOUNT_MGR /bin/bash -c "/run/ruoyi/stop.sh"

} elseif($script_name -eq "down") {
    docker-compose down

} elseif($script_name -eq "shell" -Or $script_name -eq "bash") {
    docker exec -it -u root ACCOUNT_MGR /bin/bash
}

