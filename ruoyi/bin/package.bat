@echo off
echo.
echo [INFO] build the project for generating wars/jars.
echo.

%~d0
cd %~dp0

cd ..
call mvn clean package -Dmaven.test.skip=true

pause