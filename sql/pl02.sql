declare
-- 변수 선언부
	v_num1 number(4) :=1;
	v_num2 number;
	v_num3 ex01.num1%type;
begin
	v_num2 :=1111;
	v_num3 :=12;
	dbms_output.put_line(v_num1);
	dbms_output.put_line(v_num2);
--	insert into ex01 values (v_num1,v_num2);
	select num2 into v_num3 from ex01 where num1=v_num1;
	dbms_output.put_line(v_num3);
end;
/



