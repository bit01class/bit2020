declare
    type arr_ename 
	is table of emp.ename%type 
	index by binary_integer;
    v_empno emp.empno%type;
    v_ename emp.ename%type;
    v_enames arr_ename;
begin
    v_empno :=7369;	--7369,7788,7839
    select ename into v_ename from emp 
		where empno=v_empno;
    v_enames(0) :=v_ename;
    v_empno :=7788;	--7369,7788,7839
    select ename into v_ename from emp 
		where empno=v_empno;
    v_enames(1) :=v_ename;
    v_empno :=7839;	--7369,7788,7839
    select ename into v_ename from emp 
		where empno=v_empno;
    v_enames(2) :=v_ename;
    dbms_output.put_line(v_enames(0));
    dbms_output.put_line(v_enames(1));
    dbms_output.put_line(v_enames(2));
end;
/