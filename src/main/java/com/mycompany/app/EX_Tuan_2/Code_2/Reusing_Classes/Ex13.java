package com.mycompany.app.EX_Tuan_2.Code_2.Reusing_Classes;

class Furniture{
	int i;
	void build(int i){
		System.out.println("int " + i);
	}
	void build(char c){
		System.out.println("char " + c);
	}
	void build(float f){
		System.out.println("float " + f);
	}
}

public class Ex13 extends Furniture {
	void build(String ss){
		System.out.println("string " + ss);
	}
	public static void main(String[] args) {
		Ex13 ex13 = new Ex13();
		ex13.build(4);
		ex13.build('c');
		ex13.build(3.14f);
		ex13.build("Lol");
	}
}
