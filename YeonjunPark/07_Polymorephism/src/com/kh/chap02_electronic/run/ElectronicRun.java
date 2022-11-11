package com.kh.chap02_electronic.run;

import com.kh.chap02_electronic.controller.ElectronicShop;
import com.kh.chap02_electronic.controller.ElectronicShop1;
import com.kh.chap02_electronic.model.vo.Desktop;
import com.kh.chap02_electronic.model.vo.NoteBook;
import com.kh.chap02_electronic.model.vo.Tablet;

public class ElectronicRun {
	public static void main(String[] args) {
//		Desktop d = new Desktop("삼성", "대땁", 1300000, "3080");
//		
//		NoteBook n = new NoteBook("엘지", "그램", 1300000, 3);
//		
//		Tablet t = new Tablet("애플", "아이패드", 800000, false);
//		
//		ElectronicShop1 ep = new ElectronicShop1();
//		ep.insert(d);
//		ep.insert(n);
//		ep.insert(t);
//		
//		System.out.println(ep.selectDesktop());
//		System.out.println(ep.selectNoteBool());
//		System.out.println(ep.selectTablet());
		
		ElectronicShop es = new ElectronicShop();
		//여기에서 insert메서드를 이용해 배열에 값을 넣을거야
		es.insert(new Desktop("삼성", "대땁", 1200000, "1080"));
		es.insert(new Tablet("애플", "아이패드", 800000, false));
		es.insert(new NoteBook("LG", "그램", 1200000, 4));
		
		//셀렉하는 메서드가 필요해
		Desktop d = (Desktop)es.select(0);
		Tablet t = (Tablet)es.select(1);
		NoteBook n = (NoteBook)es.select(2);
		System.out.println(d);
		System.out.println(t);
		System.out.println(n);
		
}
}
