declare
  cnt number :=0;
  msg varchar2(50) :='*';
begin
  loop
	dbms_output.put_line(msg);
	msg :=msg||'*';
	EXIT when cnt=5;
	/*
	if cnt=5 then
		exit;
	end if;
	*/
	cnt:=cnt+1;
  end loop;
end;
/