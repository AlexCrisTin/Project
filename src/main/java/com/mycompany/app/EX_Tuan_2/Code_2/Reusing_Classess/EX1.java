package com.mycompany.app.EX_Tuan_2.Code_2.Reusing_Classess;

class Simple{
	void alloy(){
		System.out.println(" ");
	}
}
public class EX1 {
	 Simple smpl;
	void useSimple(){
		smpl = new Simple();
		smpl.alloy();
	}
	public static void main(String[] args){
		EX1 ex1 = new EX1();
		ex1.useSimple();
	}
}