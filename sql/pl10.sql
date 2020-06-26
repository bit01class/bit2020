declare
    type arr_empno is table of emp.empno%type
	index by binary_integer;
--    v_ename emp.ename%type;
    type arr_ename is table of emp.ename%type
	index by binary_integer;
    v_empno arr_empno;
    v_ename arr_ename;
    cnt integer :=0;
begin
    v_empno(cnt) :=7369; cnt :=cnt+1;
    v_empno(cnt) :=7788; cnt :=cnt+1;
    v_empno(cnt) :=7839;
    for i in 0..cnt loop
    select ename into v_ename(i) from emp 
		where empno=v_empno(i);
    end loop;
    for i in reverse 0..cnt loop
    dbms_output.put_line(v_ename(i));
    end loop;
end;
/