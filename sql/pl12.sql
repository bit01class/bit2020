declare
    v_row dept%rowtype;
    cursor cur is (select * from dept);
begin
    for v_row in cur loop
	if cur%FOUND then
	dbms_output.put_line('continue..');
	elsif cur%NOTFOUND then
	dbms_output.put_line('stop...');
	end if;
	dbms_output.put_line(cur%ROWCOUNT);
	dbms_output.put_line(v_row.deptno
	||' '||v_row.dname||' '||v_row.loc);
    end loop;
end;
/