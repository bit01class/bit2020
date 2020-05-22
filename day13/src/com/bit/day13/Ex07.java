package com.bit.day13;

public class Ex07 {
	static Ex07 ex=new Ex07();
	
	public void func01(){}

	public static void main(String[] args) {
		long begin=System.currentTimeMillis();
		System.out.println("출력");
		//System.exit(1);
		
		int[] origin={1,3,5,7,9};
		int[] dest=new int[5];
		
//		for(int i=0; i<origin.length; i++){
//			dest[i]=origin[i];
//		}
//		System.arraycopy(origin, 0, dest, 0, 5);
		System.arraycopy(origin, 1, dest, 1, 3);
		
		for(int i=0; i<dest.length; i++){
			System.out.println(dest[i]);
		}
		String msg="";
		for(int i=0; i<10000; i++){
			msg+=i;
		}
		long end=System.currentTimeMillis();
		System.out.println("main 수행시간 :"+(end-begin)+"ms");
	}
}

















