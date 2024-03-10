package com.mycompany.app.EX_Tuan_2.Code_2.Reusing_Classes;

class Cleanser {
	private String s = "Cleanser";
	public void append(String a) { s += a; }
	public void dilute() { append(" dilute()"); }
	public void apply() { append(" apply()"); }
	public void scrub() { append(" scrub()"); }
	public String toString() { return s; }
}

class Detergent{
	public void foam() { append(" foam()"); }
	Cleanser cleanser = new Cleanser();
	public void append(String a){   
		cleanser.append(a);
	}
	public void dilute(){
		cleanser.dilute();
	}
	public void apply(){
		cleanser.apply();
	}
	public void scrub(){
		append(" Detergent.scrub()");
		cleanser.scrub();
	}
	public String toString(){   
		return cleanser.toString();
	}								
} 

public class Ex11{
	public static void main(String[] args) {
		Detergent x = new Detergent();
		x.dilute();
		x.apply();		
		x.scrub();
		x.foam();
		System.out.println(x);
	}
}
