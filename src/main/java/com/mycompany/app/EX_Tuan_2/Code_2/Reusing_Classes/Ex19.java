package com.mycompany.app.EX_Tuan_2.Code_2.Reusing_Classes;

class A{
	A(){
		System.out.println("Class A");
	}
}
class A1{
	final A c;
	A1(){
		c = new A();
		System.out.println("   ");
	}
	A1(String s){
		c = new A();
		System.out.println("   " + s);
	}
}
public class Ex19 {
	public static void main(String[] args){
		@SuppressWarnings("unused")
        A1 b = new A1();
		@SuppressWarnings("unused")
        A1 bb = new A1("hello");
    }
}