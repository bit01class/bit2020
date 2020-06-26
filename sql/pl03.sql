declare
  v_loc dept.loc%type;
  v_name dept.dname%type;
  v_row dept%rowtype;
begin
--  select dname,loc into v_name,v_loc
  select dname,loc into v_row.dname,v_row.loc 
			from dept where deptno=10;
  dbms_output.put_line('dname:'|| v_row.dname);
  dbms_output.put_line('loc:'|| v_row.loc);
end;
/

