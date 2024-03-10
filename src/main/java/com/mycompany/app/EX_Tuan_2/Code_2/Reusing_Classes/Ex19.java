package com.mycompany.app.EX_Tuan_2.Code_2.Reusing_Classes;

class A{
	A(){
		System.out.println("Class A");
	}
}
class C{
	final A c;
	C(){
		c = new A();
		System.out.println("   ");
	}
	C(String s){
		c = new A();
		System.out.println("   " + s);
	}
}
public class Ex19 {
	public static void main(String[] args){
		@SuppressWarnings("unused")
        C b = new C();
		@SuppressWarnings("unused")
        C bb = new C("hello");
    }
}