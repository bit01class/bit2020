declare
	cnt INTEGER :=0;
begin
	WHILE cnt<5 LOOP
	dbms_output.put_line('cnt='||cnt);
	cnt :=cnt+1;
	END LOOP;
end;
/