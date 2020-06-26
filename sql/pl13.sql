declare
  v_deptno dept.deptno%type;
  v_dname dept.dname%type;
  v_loc dept.loc%type;
  cursor cur is (select * from dept);
begin
  open cur;
  loop
  fetch cur into v_deptno,v_dname,v_loc;
  exit when cur%NOTFOUND;
	dbms_output.put_line(v_dname);
	dbms_output.put_line(v_loc);
  end loop;
  close cur;
end;
/



