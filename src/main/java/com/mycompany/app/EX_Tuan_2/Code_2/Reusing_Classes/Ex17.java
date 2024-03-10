package com.mycompany.app.EX_Tuan_2.Code_2.Reusing_Classes;

class Amphibian{
	static void gobed(Amphibian a){
		System.out.println("Jump!");
	}
	void sleep(){
		System.out.println("Squeek!");
	}
}

class Frog2 extends Amphibian{
	static void gobed(Amphibian a){
		System.out.println("Frog gobed!");
	}
	void sleep(){
		System.out.println("Frog sleep!");
	}
}

public class Ex17 {
	@SuppressWarnings("static-access")
    public static void main(String[] args){
		Frog2 f = new Frog2();
		Amphibian.gobed(f);
		f.gobed(f);
		f.sleep();
	}
}
