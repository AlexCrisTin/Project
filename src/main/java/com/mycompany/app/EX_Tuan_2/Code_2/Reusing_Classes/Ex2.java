package com.mycompany.app.EX_Tuan_2.Code_2.Reusing_Classes;

class Clean {
	private String s = "Cleanser";
	public void append(String a) { s += a; }
	public void dilute() { append(" dilute()"); }
	public void apply() { append(" apply()"); }
	public void scrub() { append(" scrub()"); }
	public String toString() { return s; }
	public static void main(String[] args) {
		Clean x = new Clean();
		x.dilute(); x.apply(); x.scrub();
		System.out.println(x);
	}
	
}

class Detergen extends Clean {
	public void scrub() {
		append(" Detergent.scrub()");
		super.scrub(); 
	}
	public void foam() { append(" foam()"); }
	public static void main(String[] args) {
	Detergen x = new Detergen();
	x.dilute();
	x.apply();
	x.scrub();
	x.foam();
	System.out.println(x);
	System.out.println("Testing base class:");
	Clean.main(args);
	} 

} 

public class Ex2 extends Detergen {
	public void scrub(){
		append(" Exercise2.scrub()");
		super.scrub(); // Call Detergent-class version
	}
	public void sterilize(){ append(" sterilize()"); }
	public static void main(String[] args) {
		Ex2 x = new Ex2();
		x.dilute();
		x.apply();		
		x.scrub();
		x.foam();
		x.sterilize();
		System.out.println(x);
		System.out.println("Testing base class:");
		Detergen.main(args);
	}
}

