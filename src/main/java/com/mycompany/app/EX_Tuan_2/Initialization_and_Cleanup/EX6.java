package com.mycompany.app.EX_Tuan_2.Initialization_and_Cleanup;

public class EX6 {
    public void bark(int time) {
        for (int i = 0; i < time; i++) {
            System.out.println("Gau");
        }
    }
public void bark(boolean loud, int time) {
        if (loud) {
            System.out.println("GAU");
        } else {
            System.out.println("gau");
        }
    }
    public void see(boolean people){
        if(people){
            System.out.println("GAUGAUGAUGAUGAU");
        } else{
            System.out.println("Slient");
        }
    }
public void bark(char kind) {
        switch (kind) {
            case 'H':
                System.out.println("HUUUUUUUUUU");
                break;
            case 'U':
                System.out.println("UUUUUUUUUU");
                break;
            case 'R':
                System.out.println("ROOOOORRRG");
                break;
            default:
                System.out.println("Silent");
                break;
        }
    }
    public static void main(String[] args) {
        EX6 myDog = new EX6();

        myDog.bark(3);
        myDog.bark(true, 2);
        myDog.bark('U');
        myDog.see(true);
    }
}
