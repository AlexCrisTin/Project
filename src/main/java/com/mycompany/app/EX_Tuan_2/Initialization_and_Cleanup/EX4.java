package com.mycompany.app.EX_Tuan_2.Initialization_and_Cleanup;

public class EX4 {
    public EX4() {
            System.out.println("This is a message");
        }
public EX4(String message) {
            System.out.println("Overloaded " + message);
        }
public static void main(String[] args) {
            EX4 message = new EX4();
            EX4 overload = new EX4("is coming");
        }
    }
    
    

