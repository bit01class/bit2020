@echo off

rem ������Ŭ�������Է¹ޱ�
echo dir?
set /p dirname=
echo Ŭ������?
set /p name=
echo ------------------------------
echo ���:

rem �����ϸ�ɾ� ����
javac -d . -encoding utf8 %dirname%\%name%.java
java com.bit.%dirname%.%name%
echo ------------------------------

