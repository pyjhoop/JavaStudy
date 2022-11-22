package view;


	// - V View   :  화면을 담당하는 역할 (출력문, 입력문)
	

/**
 * @author 이혜민 (Alt+Shift+j)
 * @since 2022.11.22
 */

	

	public class ClassMenu {	
	
        // 스캐너랑 컨트롤러 선언은 
		//젤 큰 전역변수지역에 선언해야 모든 메소드가 사용할수있다
		
		
		Scanner sc = new Scanner(System.in); 

		MusicController mc = new MusicController();

		
		
		
		// 메인화면 : 프로그램 실행시 처음 보여주는 화면
		public void mainMenu() { // mainMenu

			while (true) { // while

				System.out.println("\n=== Welcome ==== 별밤 ====");
				System.out.println("1. 새로운 곡 추가");
				System.out.println("2. 곡 전체 조회");
				System.out.println("3. 특정곡 삭제");
				System.out.println("4. 특정곡 검색");
				System.out.println("5. 특정곡 수정");
				System.out.println("0. 프로그램 종료");

				System.out.print(">> 매뉴 선택 : ");

				int menu = 9; // *1* int menu = 0; 하게되면 타고 내려가서 프로그램 종료됨
				try {
					menu = sc.nextInt();
				} catch (InputMismatchException e) {

				}

				sc.nextLine();

				switch (menu) {
				case 1:
					insertMusic(); // 메뉴선택 번호와 연관지어 생각한 후 메소드명 짓고 그이후에 작성ok
					break;
				case 2:
					selectMusic();
					break;
				case 3:
					deleteMusic();
					break;
				case 4:
					searchMusic();
					break;
				case 5:
					updateMusic();
					break;
				case 0:
					System.out.println("-----------------------------------");
					System.out.println("프로그램 종료합니다. 이용해주셔서 감사합니다");
					return;
				case 9: // *1* break;를 생략하며 default까지 흘러가게함
				default:
					System.out.println("잘못 입력했습니다");
					break;

				}// switch

			} // while end

		}// mainMenu end

		
		
//-------------------------------------------------------------------
	
		
		// 메인이 끝나고 필요한 메소드들안에 출력문 작성뒤 여기서 구현해야할 메소드들
		// 컨드롤러에 작성하러 가면 됨
		
		
		
		/**
		 * 1. 새로운 곡 추가하는 서브화면
		 */
		public void insertMusic() {

			System.out.println("\n=== 새로운 곡 추가 ===");

			System.out.print("제목 입력 : ");
			String title = sc.nextLine();
			System.out.print("가수 입력 : ");
			String artist = sc.nextLine();

			// 추가하고싶은 메소드랑 매개변수 먼저 쓰고 컨트롤러에 구현
			mc.insertMusic(title, artist);
			System.out.println("성공적으로 곡이 추가되었습니다");

		} // insertMusic end

		
		/**
		 * 3. 특정 곡 삭제시켜주는 서브 화면
		 */
		public void deleteMusic() {

			System.out.println("\n=== 특정 곡 삭제 ===");

			System.out.print("삭제하고자 하는 곡명 : ");
			String title = sc.nextLine();

//			mc.deleteMusic(title)

			int result = mc.deleteMusic(title);

			if (result == 1) {
				System.out.println("성공적으로 삭제했습니다");
			} else {
				System.out.println("삭제할 곡을 찾지 못했습니다");
			}

		}// deleteMusic end
		
		
		
	
	
}
