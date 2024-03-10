package com.mycompany.app.EX_Tuan_2.Code_2.Reusing_Classes;

class Final {
	@SuppressWarnings("unused")
    private final void f() { System.out.println("Final.f"); }
	@SuppressWarnings("unused")
    private void g() { System.out.println("Final.g"); }
}
	
class OP1 extends Final {
	@SuppressWarnings("unused")
    private final void f() {
		System.out.println("OP1.f");
	}
	@SuppressWarnings("unused")
    private void g() {
		System.out.println("OP1.g");
	} 
}
class OP2 extends OP1 {
	public final void f() {
		System.out.println("OP2.f");
	}
	public void g() {
		System.out.println("OP2.g");
	}
}
class FinalOverridingIllusion {

} 
public class Ex20 {
	@SuppressWarnings("unused")
    public static void main(String[] args) {
		OP2 op2 = new OP2();
		op2.f();
		op2.g();
		OP1 op = op2;
		Final wf = op2;
	}
}
