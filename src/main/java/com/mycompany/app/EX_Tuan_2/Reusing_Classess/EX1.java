package com.mycompany.app.EX_Tuan_2.Reusing_Classess;

class Simple{
	void alloy(){
		System.out.println(" ");
	}
}
public class Ex1 {
	 Simple smpl;
	void useSimple(){
		smpl = new Simple();
		smpl.alloy();
	}
	public static void main(String[] args){
		Ex1 ex1 = new Ex1();
		ex1.useSimple();
	}
}