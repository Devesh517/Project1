@echo off
javac face3.java
if errorlevel 1 (
    echo Compilation failed. Please check your code.
    pause
    exit /b
)
java face3
pause