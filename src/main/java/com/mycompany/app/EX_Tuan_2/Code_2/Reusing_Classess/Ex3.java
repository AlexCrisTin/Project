package com.mycompany.app.EX_Tuan_2.Code_2.Reusing_Classess;

class Art {
	Art() { System.out.println("Art constructor"); }
}

class Drawing extends Art {
	Drawing() { System.out.println("Drawing constructor"); }
}

class Cartoon extends Drawing {
    
}
@SuppressWarnings("unused")
public class Ex3 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
		Cartoon x = new Cartoon();
    }
}
