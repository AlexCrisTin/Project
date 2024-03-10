package com.mycompany.app.EX_Tuan_2.Code_2.Reusing_Classes;

class Game {
	Game(int i) {
		System.out.println("Game constructor");
	}
}

class BoardGame extends Game {
	BoardGame(int i) {
		
		super(i);		
		System.out.println("BoardGame constructor");
	}
}

class Chess extends BoardGame {
	Chess() {
		super(11);
		System.out.println("Chess constructor");
	}
} 

public class Ex6{
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Chess x = new Chess();
		}
}