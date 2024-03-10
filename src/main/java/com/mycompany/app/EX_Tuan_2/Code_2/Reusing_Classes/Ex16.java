package com.mycompany.app.EX_Tuan_2.Code_2.Reusing_Classes;

class Amphibian{
	static void jump(Amphibian a){
		System.out.println("Jump!");
	}
	void slip(){
		System.out.println("Squeek!");
	}
}

class Frog extends Amphibian{
	
}

public class Ex16 {
	public static void main(String[] args){
		Frog f = new Frog();
		Amphibian.jump(f);  //Upcasting
		f.slip
();
	}
}