package com.mycompany.app.EX_Tuan_2.Code_1;

public class Recursion {
    
    Recursion(){};
    Recursion(int number){
}

public static int Recursion(int num) {
    if (num <= 0) {
        return 1;
    } else {
        return num * Recursion(num - 1);
    }
}

public static void main(String[] args) {
    int number = 10;
    int result = Recursion(number);
    System.out.println( number + "!" + " la " + result);
}


}


