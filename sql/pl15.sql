/*
SQL> declare
  2  result number;
  3  begin
  4  proc01(4,result);
  5  dbms_output.put_line(result);
  6  end;
  7  /
*/
create or replace procedure proc01
(num in number,num2 out number)
is
-- 선언부
begin
-- 실행부
   num2 :=1000+num;
   dbms_output.put_line('Hello world'||num);
end;
/