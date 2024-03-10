package com.mycompany.app.EX_Tuan_2.Code_2.Reusing_Classes;

class Loader{
	static int i = printInit("Loader.i init");
	static int printInit(String s){
		System.out.println(s);
		return 1;
	}
	Loader(){
		System.out.println("Loader constructor");
	}
}
class Loader2 extends Loader{
	static int j = printInit("Loader2.j init");
	Loader2(){
		System.out.println("Loader2 constructor");
	}
}
public class Ex23 {
	@SuppressWarnings("unused")
    public static void main(String[] args) {
		Loader2.j = 1;
		Loader2 ldr = new Loader2(); 
	}
}
