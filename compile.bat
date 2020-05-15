@echo off

rem 변수에클래스명입력받기
echo dir?
set /p dirname=
echo 클래스명?
set /p name=
echo ------------------------------
echo 결과:

rem 컴파일명령어 실행
javac -d . -encoding utf8 %dirname%\%name%.java
java com.bit.%dirname%.%name%
echo ------------------------------

