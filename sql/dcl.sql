-- DCL(ROLE, GRANT, REVOKE)
-- create tablespace [테이블 스페이스명] 
--	datafile 'c:\~~~경로\파일명.dbf' size 000m;
-- CREATE USER [계정] 
--	IDENTIFIED BY [비밀번호:숫자일땐 ""] 
--	default tablespace [테이블 스페이스명];
-- ALTER USER [계정] QUOTA 000M ON [테이블 스페이스명];
-- GRANT privilege_name, … TO [계정];
-- revoke [권한 또는 롤] from [계정];