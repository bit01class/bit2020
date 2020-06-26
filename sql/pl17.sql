create or replace trigger tri01
before insert or update or delete on dept
begin
	dbms_output.put_line('insert event');
end;
/