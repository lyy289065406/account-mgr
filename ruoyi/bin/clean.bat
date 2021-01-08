@echo off
echo.
echo [INFO] clean old packages.
echo.

%~d0
cd %~dp0

cd ..
call mvn clean

pause