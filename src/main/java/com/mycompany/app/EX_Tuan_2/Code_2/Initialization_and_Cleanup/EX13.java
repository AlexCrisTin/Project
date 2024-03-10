package com.mycompany.app.EX_Tuan_2.Code_2.Initialization_and_Cleanup;



class Cup {
    Cup(int count) {
    System.err.println("Cup(" + count + ")");
    }
    void f(int count) {
    System.out.println("f(" + count + ")");
    }
   }
   class Cups {
    static Cup cup1;
    static Cup cup2;
    static {
    cup1 = new Cup(1);
    cup2 = new Cup(2);
    }
    Cups() {
    System.out.println("Cups()");
    }
   }
   public class EX13 {
    public static void main(String[] args) {
    System.out.println("Inside main()");
    Cups.cup1.f(99); 
    }
   }