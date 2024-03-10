package com.mycompany.app.EX_Tuan_2.Code_2.Reusing_Classes;

class A1{
	A1(){
		System.out.println("A1"); 
	}
	void dispose(){
		System.out.println("A1.dispose");
	}
}
 class A2{
	A2(){
		System.out.println("A2"); 
	}
	void dispose(){
		System.out.println("A2.dispose");
	}
}
class A3{
	A3(){
		System.out.println("A3"); 
	}
	void dispose(){
		System.out.println("A3.dispose");
	}
}
class Rootx{
	private A1 A;
	private A2 B;
	private A3 C;
	Rootx(){
		System.out.println("Rootx");
		A = new A1();
		B = new A2();
		C = new A3();
	}
	void dispose(){
		System.out.println("Rootx.dispose");
		C.dispose();
		B.dispose();
		A.dispose();
	}
}class Stemx extends Rootx{
	private A1 AA;
	private A2 BB;
	private A3 CC;
	public Stemx(){
		AA = new A1();
		BB = new A2();
		CC = new A3();
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
