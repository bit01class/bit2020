-- if문
declare
  a number :=0;
begin
  if a>0 then
	dbms_output.put_line('>0');
  elsif a=0 then
	dbms_output.put_line('=0');
  else
	dbms_output.put_line('<0');
  end if;
end;
/