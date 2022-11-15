package com.kh.exception.run;

import com.kh.exception.controller.A_UncheckedException;
import com.kh.exception.controller.B_CheckedException;

public class Run {
	public static void main(String[] args) {
		A_UncheckedException a = new A_UncheckedException();
//		a.method1();
//		a.method2();
//		a.method3();
		B_CheckedException b = new B_CheckedException();
		b.method1();
	}
}
