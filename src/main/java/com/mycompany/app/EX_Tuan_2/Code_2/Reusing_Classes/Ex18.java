package com.mycompany.app.EX_Tuan_2.Code_2.Reusing_Classes;

public class Ex18 {
	static final int a = 1;
	final int b = 2;
	public static void main(String[] args){
		System.out.println(a);
		Ex18 ex18 = new Ex18();
		System.out.println(ex18.b);
    }
}
