select ename, decode(deptno,
	10,'accounting',
	20,'research',
	30,'sales',
	40,'operations') from emp;
