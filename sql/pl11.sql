declare
   v_row dept%rowtype;
begin
   select * into v_row from dept 
			where deptno=10;
   dbms_output.put_line(v_row.dname);
   dbms_output.put_line(v_row.loc);
   dbms_output.put_line(v_row.deptno);
end;
/