package com.mycompany.app.EX_Tuan_2.Code_2.Reusing_Classes;

class A1{
	A1(int i){
		System.out.println("A1"); 
	}
}
class A2{
	A2(int i){
		System.out.println("A2"); 
	}
}
class A3{
	A3(int i){
		System.out.println("A3"); 
	}
}
class Root1{
	Root1(int i){
		System.out.println("Root1");
		@SuppressWarnings("unused")
        A1 A1 = new A1(i);
        @SuppressWarnings("unused")
		A2 A2 = new A2(i);
        @SuppressWarnings("unused")
		A3 A3 = new A3(i);
	}
}
class Stem1 extends Root1{
	Stem1(int i){
		super(i);
        @SuppressWarnings("unused")
		A1 A1 = new A1(i);
        @SuppressWarnings("unused")
		A2 A2 = new A2(i);
        @SuppressWarnings("unused")
		A3 A3 = new A3(i);
	}
}
public class Ex10 {
	public static void main(String[] args) {
        @SuppressWarnings("unused")
		Stem1 s = new Stem1(5);
	}
}
