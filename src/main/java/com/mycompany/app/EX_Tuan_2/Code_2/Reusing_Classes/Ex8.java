package com.mycompany.app.EX_Tuan_2.Code_2.Reusing_Classes;

class Chinh{
	Chinh(String s){
		System.out.println("Nv " + s); 
	}
}

class Phu extends Chinh{
	Phu(){
		super("empty");
	}
	Phu(String s){
		super(s);
	}
}

public class Ex8 {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
        Phu m = new Phu();
		@SuppressWarnings("unused")
        Phu n = new Phu("phu");
	}
}
