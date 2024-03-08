package com.mycompany.app.EX_Tuan_2.Code_2.Reusing_Classess;

class A{
	A(){ System.out.println("A"); } 
}

class B{
	B(){ System.out.println("B"); } 
}

class C extends A{                  
	B b = new B();                  
}

public class Ex5 {
	public static void main(String[] args) {
		C c = new C();

