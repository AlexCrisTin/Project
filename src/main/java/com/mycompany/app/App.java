package com.mycompany.app;

import com.mycompany.app.EX_Tuan_2.Code_1.*;
public class App {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("******Book******");
        Book temp = new Book(null, null, 0);
        temp.main(args);
        
        System.out.println("******Time******");
        Time t  = new Time();
        t.main(args);

        System.out.println("******Recursion******");
        Recursion r  = new Recursion();
        r.main(args);

        System.out.println("******NameNumber******");
        NameNumber n  = new NameNumber();
        n.main(args);

    }
}
