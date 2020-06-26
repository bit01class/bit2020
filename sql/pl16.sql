create or replace function func01
-- (num1 number,num2 number,num3 number)
return number
is
-- 선언부
    cnt number;
begin
-- 실행부
--   return num1+num2+num3;
    insert into dept values (60,'test','test');
    select count(*) into cnt from dept;
    return cnt;
end;
/





