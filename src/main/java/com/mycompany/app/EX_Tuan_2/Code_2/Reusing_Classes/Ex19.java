package com.mycompany.app.EX_Tuan_2.Code_2.Reusing_Classes;

class A{
	A(){
		System.out.println("Class A");
	}
}
class B{
	final A c;
	B(){
		c = new A();
		System.out.println("   ");
	}
	B(String s){
		c = new A();
		System.out.println("   " + s);
	}
}
public class Ex19 {
	public static void main(String[] args){
		@SuppressWarnings("unused")
        B b = new B();
		@SuppressWarnings("unused")
        B bb = new B("hello");
    }
}