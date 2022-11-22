package controller;

public class ClassController {

	// - C Controller : 사용자의 요청(추가 / 삭체 / 정리) 처리해주는 클래스 (출력문 쓰지않음)

	public class 클래스명Controller {
		
		private ArrayList<클래스명 / 제네릭 안해도됨> 객체명  = new ArrayList<클래스명>();
		
		private ArrayList<Music> list = new ArrayList<Music>();
	

		{//초기화 블럭 생략가능 , 하게되면 기본값으로 가지고있다 생각하면 됨
			list.add(new Music("Attention", "뉴진스"));
			list.add(new Music("새삥", "지코"));
			list.add(new Music("새삥 말고 헌팅", "쥐아코"));
			list.add(new Music("아이 예뻐", "루다"));
		}
		
	}

	이렇게 메소드명 (매개변수값) view클래스에 사용될 메소드 작성하면 된다

	
	
	
	public void insertMusic(String title, String artist) {

		list.add(new Music(title, artist));

	}// insertMusic end

	
	

	
	public ArrayList<Music> searchMusic(int menu, String keyword) {

		ArrayList<Music> searchList = new ArrayList<Music>();

		if (menu == 1) { // 제목으로 검색
			for (Music m : list) {
				if (m.getTitle().contains(keyword)) {
					searchList.add(m);
				}
			}

		} else { // 가수명으로 검색
			for (Music m : list) {
				if (m.getArtist().contains(keyword)) {
					searchList.add(m);
				}
			}
		}

		return searchList;
	}// searchMusic end

	
	

	public int deleteMusic(String title) {
		
		int result=0;
		
		for(int i=0; i<list.size();i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.remove(i);
				break;
			}
		}
		return result;
	}
	
	
	
	
	/*
	 * 최종정리
	 * 
	 * deleteMusic / updateMusic + insertMusic 는 자료형을 int로 짜는 경우가 많다 --> @개가
	 * 수정됐습니다 @개가 삭제됐습니다 등 결과값을 던질려고
	 * 
	 * 
	 * selectMusic / searchMusic 조회는 대부분 자료형은 ArrayList 타입 --> 검색한거 촤르르륵 다 출력해야되니까
	 * 
	 */

}// controller end
