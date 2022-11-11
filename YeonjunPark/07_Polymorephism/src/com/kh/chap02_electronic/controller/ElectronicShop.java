package com.kh.chap02_electronic.controller;

import com.kh.chap02_electronic.model.vo.Electronic;

public class ElectronicShop {
	Electronic[] arr = new Electronic[3];
	int count = 0;
	
	public void insert(Electronic any) {
		arr[count++] = any;
	}
	
	public Electronic select(int index) {
		return arr[index];
	}
	
}
