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

elif [ "$script_name"x = "up"x ] ; then
    docker-compose up -d

elif [ "$script_name"x = "init"x ] || [ "$script_name"x = "db"x ] ; then
    docker exec -u mysql ACCOUNT_MGR /bin/bash -c "mysql -uroot -p123456 -e 'source /var/sql/init.sql'"
    docker exec -u mysql ACCOUNT_MGR /bin/bash -c "mysql -uroot -p123456 -e 'source /opt/ruoyi/sql/ry_20201214.sql'"
    docker exec -u mysql ACCOUNT_MGR /bin/bash -c "mysql -uroot -p123456 -e 'source /opt/ruoyi/sql/quartz.sql'"
    docker exec -u mysql ACCOUNT_MGR /bin/bash -c "mysql -uroot -p123456 -e 'source /opt/ruoyi/sql/am_backend.sql'"
    docker exec -u mysql ACCOUNT_MGR /bin/bash -c "mysql -uroot -p123456 -e 'source /opt/ruoyi/sql/am_frontend.sql'"

elif [ "$script_name"x = "cln"x ] || [ "$script_name"x = "clean"x ] ; then
    docker exec -u root ACCOUNT_MGR /bin/bash -c "/run/ruoyi/bin/clean.sh"

elif [ "$script_name"x = "pkg"x ] || [ "$script_name"x = "package"x ] ; then
    docker exec -u root ACCOUNT_MGR /bin/bash -c "/run/ruoyi/bin/package.sh"

elif [ "$script_name"x = "run"x ] || [ "$script_name"x = "start"x ] ; then
    docker exec -u root ACCOUNT_MGR /bin/bash -c "/run/ruoyi/bin/run.sh"

elif [ "$script_name"x = "stop"x ] ; then
    docker exec -u root ACCOUNT_MGR /bin/bash -c "/run/ruoyi/bin/stop.sh"

elif [ "$script_name"x = "down"x ] ; then
    docker-compose down

elif [ "$script_name"x = "shell"x ] || [ "$script_name"x = "bash"x ] ; then
    docker exec -it -u root ACCOUNT_MGR /bin/bash

else
    help
fi

