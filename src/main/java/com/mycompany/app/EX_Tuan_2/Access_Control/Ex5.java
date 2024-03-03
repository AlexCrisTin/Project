package com.mycompany.app.EX_Tuan_2.Access_Control;

public class Ex5 {
    public int a;
    private int b;
    protected int c;
    int d;
    public void a() {}
    private void b() {}
    protected void c() {}
    void d() {}
    public static void main() {
        Ex5 ex5 = new Ex5();
        System.out.println(ex5.a);
        System.out.println(ex5.b);
        System.out.println(ex5.c);
        System.out.println(ex5.d);
        ex5.a();
        ex5.b();
        ex5.c();
        ex5.d();
}
}

