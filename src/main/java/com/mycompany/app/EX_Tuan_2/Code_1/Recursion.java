package com.mycompany.app.EX_Tuan_2.Code_1;

public class Recursion {
    
    public Recursion(){};
    Recursion(int number){
}

public static int Recursio(int num) {
    if (num <= 0) {
        return 1;
    } else {
        return num * Recursio(num - 1);
    }
}

public void main(String[] args) {
    int number = 10;
    int result = Recursio(number);
    System.out.println( number + "!" + " la " + result);
}


}


