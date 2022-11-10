package copy.part02.run;

import copy.part02.controller.ElectronicShop1;
import copy.part02.model.vo.Desktop;
import copy.part02.model.vo.NoteBook;
import copy.part02.model.vo.Tablet;

// -------------- 다형성 적용 안했을때 ---------------------

public class Eelc_Run {

	public static void main(String[] args) {

		
		ElectronicShop1 es = new ElectronicShop1();
		
		es.insert(new Desktop("삼성","데땁",1200000,"그래퓍"));
		
		es.insert(new NoteBook("엘쥐", "그램", 555000, 4));
		
		es.insert(new Tablet("애플", "아이패드", 100, false));
		
		
		
		Desktop d = es.selectDesktop();
		NoteBook n = es.selectNoteBook();
		Tablet t = es.selectTablet();
		
		System.out.println(es.selectDesktop());
		System.out.println(d);
		// 두개 같은 코드
		
		System.out.println(d/*.toString()*/);
		System.out.println(n);
		System.out.println(t);
		
		
		
		
		
	}

}
