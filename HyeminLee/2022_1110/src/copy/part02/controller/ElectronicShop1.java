package copy.part02.controller;

import copy.part02.model.vo.Desktop;
import copy.part02.model.vo.NoteBook;
import copy.part02.model.vo.Tablet;

public class ElectronicShop1 {
	
	private Desktop desk;
	private NoteBook note;
	private Tablet tab;
	
	
	
	public void insert (Desktop d) { // Desktop d = new Desktop(brand, name, price, graphic);
		desk = d;					// 이렇게 입력된 d가 필드선언된 desk에 들어감
	}
	
	public void insert (NoteBook n) {
		note = n;
	}
	
	public void insert (Tablet t) {
		tab = t;
	}
	
	
	
	public Desktop selectDesktop() {
		return desk;
	}
	
	public NoteBook selectNoteBook() {
		return note;
	}
	
	public Tablet selectTablet() {
		return tab;
	}
	
	
	
	
	
	

}
