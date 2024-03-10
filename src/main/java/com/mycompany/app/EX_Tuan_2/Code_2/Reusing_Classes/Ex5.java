package com.mycompany.app.EX_Tuan_2.Code_2.Reusing_Classes;

class Abc{
	Abc(){ System.out.println("Abc"); } 
}

class B{
	B(){ System.out.println("B"); } 
}

class C extends Abc{                  
	B b = new B();                  
}
@SuppressWarnings("unused")
public class Ex5 {
	
	public static void main(String[] args) {
        C c = new C();
    }
}
