#!/bin/sh

script_name=$1


function help()
{
    echo "Usage: ./exec.sh [script_name]"
    echo "script_name list :"
    echo "  (1) up          :   build and up docker environment"
    echo "  (2) init/db     :   init database"
    echo "  (3) cln/clean   :   mvn clean"
    echo "  (4) pkg/package :   mvn package"
    echo "  (5) run/start   :   run the application"
    echo "  (6) stop        :   stop the application"
    echo "  (7) down        :   stop environment"
    echo "  (*) shell/bash  :   switch to docker environment (container shell)"
}


if [ -z "${script_name}" ] ; then
    help

elif [ "$script_name"x -eq "up"x ] ; then
    docker-compose up -d

elif [ "$script_name"x -eq "init"x ] || [ "$script_name"x -eq "db"x ] ; then
    docker exec -u mysql ACCOUNT_MGR /bin/bash -c "mysql -uroot -p123456 -e 'source /var/sql/init.sql'"
    docker exec -u mysql ACCOUNT_MGR /bin/bash -c "mysql -uroot -p123456 -e 'source /opt/ruoyi/sql/ry_20201214.sql'"
    docker exec -u mysql ACCOUNT_MGR /bin/bash -c "mysql -uroot -p123456 -e 'source /opt/ruoyi/sql/quartz.sql'"
    docker exec -u mysql ACCOUNT_MGR /bin/bash -c "mysql -uroot -p123456 -e 'source /opt/ruoyi/sql/am_backend.sql'"
    docker exec -u mysql ACCOUNT_MGR /bin/bash -c "mysql -uroot -p123456 -e 'source /opt/ruoyi/sql/am_frontend.sql'"

elif [ "$script_name"x -eq "cln"x ] || [ "$script_name"x -eq "clean"x ] ; then
    docker exec -u root ACCOUNT_MGR /bin/bash -c "/run/ruoyi/bin/clean.sh"

elif [ "$script_name"x -eq "pkg"x ] || [ "$script_name"x -eq "package"x ] ; then
    docker exec -u root ACCOUNT_MGR /bin/bash -c "/run/ruoyi/bin/package.sh"

elif [ "$script_name"x -eq "run"x ] || [ "$script_name"x -eq "start"x ] ; then
    docker exec -u root ACCOUNT_MGR /bin/bash -c "/run/ruoyi/bin/run.sh"

elif [ "$script_name"x -eq "stop"x ] ; then
    docker exec -u root ACCOUNT_MGR /bin/bash -c "/run/ruoyi/bin/stop.sh"

elif [ "$script_name"x -eq "down"x ] ; then
    docker-compose down

elif [ "$script_name"x -eq "shell"x ] || [ "$script_name"x -eq "bash"x ] ; then
    docker exec -it -u root ACCOUNT_MGR /bin/bash

else
    help
fi

