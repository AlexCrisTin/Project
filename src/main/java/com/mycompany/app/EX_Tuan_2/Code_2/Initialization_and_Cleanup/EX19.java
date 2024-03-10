package com.mycompany.app.EX_Tuan_2.Code_2.Initialization_and_Cleanup;

public class EX19 {
    void print(String... numbers) {
        System.out.println("Received " + numbers.length + " numbers:");
        for (String s : numbers) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        EX19 example = new EX19();
        example.print("1", "2", "3");

        String[] spell = {"one", "two", "three"};
        example.print(spell);
    }
}
