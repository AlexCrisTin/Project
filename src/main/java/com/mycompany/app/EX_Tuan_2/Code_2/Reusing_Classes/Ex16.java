package com.mycompany.app.EX_Tuan_2.Code_2.Reusing_Classes;

class Amphibia{
	static void jump(Amphibia a){
		System.out.println("Jump!");
	}
	void slip(){
		System.out.println("Squeek!");
	}
}

class Frog extends Amphibia{
	
}

public class Ex16 {
	public static void main(String[] args){
		Frog f = new Frog();
		Amphibia.jump(f);  //Upcasting
		f.slip
();
	}
}