declare
	v_row dept%rowtype;
	cur sys_refcursor;
begin
	open cur for select * from dept;
	loop
	  fetch cur into v_row;
	  exit when cur%notfound;
	  dbms_output.put_line(
		v_row.dname||v_row.loc);
	end loop;
	close cur;
end;
/