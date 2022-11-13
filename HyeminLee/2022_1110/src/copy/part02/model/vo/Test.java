package copy.part02.model.vo;

// 인터페이스, 클래스 구현&상속 알아보기  -- 순서는 역순으로 보면 이해쉬움

public abstract class Test {

	public static void main(String[] args) {

		
				//최종 자식클래스 test2 객체를 생성해서 모든 메소드 호출 가능여부? 전부 다 됨
			      Test2 a = new Test2();
			      a.hi();
			      a.hellow();
			      a.howAreYou();
			      
//			      출력 : 
//			    	  hi
//			    	  hellow
//			    	  howAreyou
			      
			   }
			   
			}


			// 인터페이스 1,2,3을 구현하는데 1,2만 일부완성 --> abstract
			// 다 구현한게 아니므로 에러발생 방법 1) abstract 붙이기
			abstract class Test1 implements A,B,C{
			   public void hi() {
			      System.out.println("hi");
			   }
			   
			   public void hellow() {
			      System.out.println("hellow");
			   }

			   
			   
//			방법 2) -- 메소드 오버라이딩해~
//			@Override
//			public void howAreYou() {
//				
//			}
			   
			}

			
			// 클래스 test1을 상속받는 test2에서 인터페이스3을 구현완성함
			// 인터페이스 추상메소드가 다 완성되어 abstract 없음
			class Test2 extends Test1{
			   public void howAreYou() {
			      System.out.println("howAreyou");
			   }
			}

			
			
			// 인터페이스 1
			interface A{ 
			   
			   void hi();
			}

			
			//인터페이스2
			interface B{ 
			   void hellow();
			}

			
			//인터페이스3
			interface C{
			   void howAreYou();
			}
		
		
		
		
		
		
	


