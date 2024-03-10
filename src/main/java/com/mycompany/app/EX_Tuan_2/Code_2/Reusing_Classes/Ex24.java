package com.mycompany.app.EX_Tuan_2.Code_2.Reusing_Classes;

class Insect {
	private int i = 9;
	protected int j;
	Insect() {
		System.out.println("i = " + i + ", j = " + j);
		j = 39;
	}
	@SuppressWarnings("unused")
    private static int x1 =
			printInit("static Insect.x1 complete");
	static int printInit(String s) {
		System.out.println(s);
		return 47;
	}
}
class Beetle extends Insect {
	private int k = printInit("Beetle.k complete");
	public Beetle() {
		System.out.println("k = " + k);
		System.out.println("j = " + j);
	}
	@SuppressWarnings("unused")
    private static int x2 =
			printInit("static Beetle.x2 complete");
}
class Coleoptera extends Beetle{
	private int l = printInit("Coleoptera.l complete");
	public Coleoptera() {
		System.out.println("j = " + j);
		System.out.println("l = " + l);
	}
	@SuppressWarnings("unused")
    private static int x3 =
			printInit("static Coleoptera.x3 complete");
}
public class Ex24 {
	@SuppressWarnings("unused")
    public static void main(String[] args) {
		Coleoptera c = new Coleoptera();
	}
}
