package com.bit.day20;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Ex06 {

	public static void main(String[] args) {
		// �ζ� ��ȣ ������(ver 0.1.0)
		// ���ʽ� ��ȣ���� ����Ͻÿ�
		
		java.util.Set lotto=new java.util.HashSet();
		java.util.Random ran=new Random();
		while(lotto.size()<7){
			lotto.add(ran.nextInt(45)+1);
		}
		
		Iterator note = lotto.iterator();
		while(note.hasNext()){
			System.out.print(note.next()+" ");
		}
		System.out.println();
		java.util.List list=new ArrayList(lotto);
		
		for(int i=0; i<list.size(); i++){
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		List list2 = list.subList(0, 6);
		list2.sort(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				return (int)o1-(int)o2;
			}
		});
		list2.add(list.get(6));
		
		for(int i=0; i<list2.size(); i++){
			System.out.print(list2.get(i)+" ");
		}
	}

}














