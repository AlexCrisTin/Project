package com.mycompany.app.EX_Tuan_2.Code_1;

public class NameNumber {
    private String lastName;
    private String telNumber;

    NameNumber() {
    }

    // set name and number to NameNumber
    public NameNumber(String name, String num) {
        this.lastName = name;
        this.telNumber = num;
    }

    // get Lastname
    public String getLastName() {
        return lastName;
    }

    // get String of "tel number"
    public String getTelNumber() {
        return telNumber;
    }
public static void main(String[] args) {
    NNCollection collection = new NNCollection();
    NameNumber n = new NameNumber();

    System.out.println(collection);
    System.out.println(n);
}
   
}
