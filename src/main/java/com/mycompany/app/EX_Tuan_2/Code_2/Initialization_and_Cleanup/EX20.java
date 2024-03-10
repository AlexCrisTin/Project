package com.mycompany.app.EX_Tuan_2.Code_2.Initialization_and_Cleanup;

public class EX20 {
    public static void main(String... args) {
        System.out.println("Received " + args.length + " command-line arguments:");
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
