package com.kh.chap02_electronic.run;

import com.kh.chap02_electronic.controller.ElectronicShop1;
import com.kh.chap02_electronic.model.vo.Desktop;
import com.kh.chap02_electronic.model.vo.NoteBook;
import com.kh.chap02_electronic.model.vo.Tablet;

public class ElectronicRun {
	public static void main(String[] args) {
		Desktop d = new Desktop("삼성", "대땁", 1300000, "3080");
		
		NoteBook n = new NoteBook("엘지", "그램", 1300000, 3);
		
		Tablet t = new Tablet("애플", "아이패드", 800000, false);
		
		ElectronicShop1 ep = new ElectronicShop1();
		ep.insert(d);
		ep.insert(n);
		ep.insert(t);
		
		System.out.println(ep.selectDesktop());
		System.out.println(ep.selectNoteBool());
		System.out.println(ep.selectTablet());
}
}
