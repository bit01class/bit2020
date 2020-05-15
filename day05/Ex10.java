// <- 주석
// 한줄주석
/* 시작
	~
	다중 주석
	~
끝 */

class Ex10{
// 클래스의 선언은 class 클래스명{ 코드;}
// 클래스명 명명규칙
// 첫글자 - 영문대문자
// 띄어쓰기,특수문자 불가 (예외 _$)
// 단어와 단어 조합은 다음단어 첫글자를 대문자로

	public static void main(String[] args){
		System.out.println('#');
		System.out.println("문자열");
		System.out.println('문'+'자'+'열');
		System.out.println("문\t자\n열");
		System.out.println("1.문"+'\t'+'자');
		System.out.println("2.문"+'\u0009'+'자');
		System.out.println("3.문"+(char)9+'자');
		System.out.println("4.문"+'	'+'자');
		System.out.println("1.첫번째문장입니다");
		System.out.println("1.두번째문장입니다");
		
		System.out.println("2.첫문장입니다\n2.두번째문장입니다");
	
		System.out.println("3.첫문장입니다\n"+
				"3.두번째문장입니다");
		// path=C:\java\jdk
		System.out.println("path=C:\\java\\jdk");

	}

}






