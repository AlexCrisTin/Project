package com.mycompany.app.EX_Tuan_2.Code_2.Reusing_Classess;

class Mot {
	Mot() { System.out.println("1"); }
}

class Hai extends Mot {
	Hai() { System.out.println("2"); }
}

class Ba extends Hai {
	Ba() {
		System.out.println("3"); 
		Mot z = new Mot();
	}
}

public class Ex4 {
	public static void main(String[] args) {
		Ba x = new Ba();
    }
}