package com.mycompany.app.EX_Tuan_2.Code_2.Reusing_Classes;

class A{
	A(){
		System.out.println("Class A");
	}
}
class Bs{
	final A c;
	Bs(){
		c = new A();
		System.out.println("   ");
	}
	Bs(String s){
		c = new A();
		System.out.println("   " + s);
	}
}
public class Ex19 {
	public static void main(String[] args){
		@SuppressWarnings("unused")
        Bs b = new Bs();
		@SuppressWarnings("unused")
        Bs bb = new Bs("hello");
    }
}