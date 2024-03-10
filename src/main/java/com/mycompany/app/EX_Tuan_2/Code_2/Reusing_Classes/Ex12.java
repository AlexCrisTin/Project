package com.mycompany.app.EX_Tuan_2.Code_2.Reusing_Classes;

class B1{
	B1(){
		System.out.println("A1"); 
	}
	void dispose(){
		System.out.println("A1.dispose");
	}
}
 class B2{
	B2(){
		System.out.println("A2"); 
	}
	void dispose(){
		System.out.println("A2.dispose");
	}
}
class B3{
	B3(){
		System.out.println("A3"); 
	}
	void dispose(){
		System.out.println("A3.dispose");
	}
}
class Rootx{
	private B1 A;
	private B2 B;
	private B3 C;
	Rootx(){
		System.out.println("Rootx");
		A = new B1();
		B = new B2();
		C = new B3();
	}
	void dispose(){
		System.out.println("Rootx.dispose");
		C.dispose();
		B.dispose();
		A.dispose();
	}
}class Stemx extends Rootx{
	private B1 AA;
	private B2 BB;
	private B3 CC;
	public Stemx(){
		AA = new B1();
		BB = new B2();
		CC = new B3();
	}
	public void dispose(){
		System.out.println("Stemx.dispose");
		CC.dispose();
		BB.dispose();
		AA.dispose();
		super.dispose();
	}
}
public class Ex12 {
	public static void main(String[] args) {
		Stemx s = new Stemx();
		try {
		}
		finally{
		s.dispose();	
		}
	}
}
