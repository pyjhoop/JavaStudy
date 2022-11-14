package com.kh.chap02_string.controller;

public class A_StringPoolTest {
	
	public void method1() {
		//문자열 생성 방법 2가지에 대해 알아보자.
		
		//1. 생성자를 통한 문자열 생성
		String str1 = new String("hello");
		String str2 = new String("hello");//매개변수 생성자.
		
		//레퍼런스를 출력해보면 toString이 오버라이딩 되어서 실제값 출력.
		System.out.println(str1.toString());
		System.out.println(str2);
		
		//동등비교를 해보자.
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		//equals가 String 클래스에 오버라이딩 된것을 알 수 있다.
		//원래 Object에 있는 equals는 스택메모리에 있는 실제값 비교함.
		
		//hashcode로 주소를 알아내 보자.
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		//같은값이 나와 왜? String의 hashcode는 문자열을 10진수로 표현하기 때문이다.
		//이를 통해 String클래스에 hashCode가 오버라이딩 된것을 알수 있음.
		
		//실제 주소를 알기 위해선 System.identityHashCode 사용하면됨.
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str1));
		
	}
	
	public void method2() {
		//2. 두번째 방법. 문자열을 리터럴 값으로 생성하는 것.
		String str1 = "hello";
		String str2 = "hello";
		//이 경우 StringPool에 값이 저장된다.
		//StringPool도 힙영역이기에 hello가 StringPool에 저장되면 주소를 갖는다.
		//str2의 값도 StringPool에 저장하려는데 이미 Pool에는 hello가 존재함.
		//그러기에 str2도 str1과 같은 주소를 참조한다.
		//그러기에 두개의 주소는 동일하다.
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		//두 주소가 같은 것을 볼 수 있다.
		
		//그럼 str2의 값을 변경하면 str1과 같은 주소를 참조하니 
		// str1도 값이 변경될까?
		str2 = "bye";
		System.out.println(str1);
		System.out.println(str2);
		//변경이 안됐어 왜?
		
		//String클래스는 불변클래스(변하지 않는 클래스다)
		//불변이라고 값을 못 바꾼다는 것이 아니라.
		// 변경이 가능하나 String Pool에 새로운 공간을 만들어서 새로운 값을 저장 후
		// 기존에 참조한 문자열을 가비지컬렉터가 알아서 없애준다.
		
		//그럼 str2의 bye값과 str2의 hello주소를 비교해보자.
		System.out.println(System.identityHashCode(str2));
		str2 = "hello!!";
		System.out.println(System.identityHashCode(str2));
		//주소가 바뀌었다. -> 새로운 메모리를 생성하고 기존것을 버렸다.
	}
}
