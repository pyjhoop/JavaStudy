package ch11.arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListEx1 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		list1.add(5);
		list1.add(4);
		list1.add(2);
		list1.add(0);
		list1.add(1);
		list1.add(3);
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		System.out.println(list1);
		System.out.println(list2);
		
		Collections.sort(list1);
		Collections.sort(list2);
		System.out.println(list1);
		System.out.println(list2);
		System.out.println("list1.contatinsAll(list2) : "+ list1.containsAll(list2));
		
		list2.add("B");
		list2.add("c");
		list2.add(3,"a");
		print(list1,list2);
		
		//list1과 list2사이의 공통적인 부분 뺴고 나머지 다 삭제한다.
		System.out.println("list1.retainAll(list2) : "+ list1.retainAll(list2));
		//현재 list1에 변화가 일어났기에 true가 반환된다.
		print(list1,list2);
		
		//list2에서 list1에 포함된 값들 삭제
		for(int i = list2.size()-1; i>=0; i--) {
			if(list1.contains(list2.get(i))) {
				list2.remove(i);
			}
		}
		
		print(list1,list2);
	}
	
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 : "+list1);
		System.out.println("list2 : "+list2);
		System.out.println();
		
	}
}
