package com.mycompany.app.EX_Tuan_2.Code_2.Reusing_Classes;

class Aa{
	Aa(int i){ System.out.println("Aa " + i); } 
}

class Bb{
	Bb(int i){ System.out.println("Bb " + i); } 
}

class Cc extends Aa{
	Cc(int i){
		super(i);
		@SuppressWarnings("unused")
        Bb b = new Bb(i);
	}                
}

public class Ex7 {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
        Cc c = new Cc(5);	            
	}
}