param([string]$script_name="")

if(!$script_name) {
    Write-Host "Usage: ./exec.ps1 [script_name]"
    Write-Host "script_name list :"
    Write-Host "  (1) init        :   init environment"
    Write-Host "  (2) cln/clean   :   mvn clean"
    Write-Host "  (3) pkg/package :   mvn package"
    Write-Host "  (4) run/start   :   run the application"
    Write-Host "  (5) stop        :   stop the application"
    Write-Host "  (6) down        :   stop environment"

} elseif($script_name -eq "init") {
    docker-compose up -d

} elseif($script_name -eq "cln" -Or $script_name -eq "clean") {
    docker exec -u root AM_RUOYI /bin/bash -c "/opt/ruoyi/bin/clean.sh"

} elseif($script_name -eq "pkg" -Or $script_name -eq "package") {
    docker exec -u root AM_RUOYI /bin/bash -c "/opt/ruoyi/bin/package.sh"

} elseif($script_name -eq "run" -Or $script_name -eq "start") {
    docker exec -u root AM_RUOYI /bin/bash -c "/opt/ruoyi/bin/run.sh"

} elseif($script_name -eq "stop") {
    docker exec -u root AM_RUOYI /bin/bash -c "/opt/ruoyi/bin/stop.sh"

} elseif($script_name -eq "down") {
    docker-compose down
}

