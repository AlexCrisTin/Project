package com.mycompany.app.EX_Tuan_2.Code_2.Reusing_Classes;

class Task1{
	Task1(){
		System.out.println("Task1"); 
	}
}
class Task2{
	Task2(){
		System.out.println("Task2"); 
	}
}
class Task3{
	Task3(){
		System.out.println("Task3"); 
	}
}
class Nonsus{
	Nonsus(){
		System.out.println("thu tu lam bai");
		@SuppressWarnings("unused")
		Task1 a = new Task1();
		@SuppressWarnings("unused")
		Task2 b = new Task2();
		@SuppressWarnings("unused")
		Task3 c = new Task3();
	}
}
class Sus extends Nonsus{
	Sus(){
		@SuppressWarnings("unused")
		Task1 a1 = new Task1();
		@SuppressWarnings("unused")
		Task2 b2 = new Task2();
		@SuppressWarnings("unused")
		Task3 c3 = new Task3();
	}
}
public class Ex9 {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Sus s = new Sus();
	}
}
