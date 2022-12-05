package com.practice.run;

import com.practice.controller.Bank;
import com.practice.view.BankApp;

public class BankRun {

	public static void main(String[] args) {
		BankApp ba = new BankApp();
		Bank b = new Bank();
//		b.fileRead();
	
		
		ba.printView();
	}

}
