package com.mycompany.app.EX;

public class bt8 {
    public static void main(String[] args) {
        for(int i = 0; i <= 3; i++){
            switch(i){
                case 1: System.out.println("A");
                break;
                case 2: System.out.println("B");
                break;
                case 3: System.out.println("C");
                break;
                case 4: System.out.println("D");
                break;
                default:
                System.out.println("Nah");
                break;
            }
        }
    }
}
/*  Nếu mà bỏ break đi thì case 1 nó vẫn hoạt động bình thường cho đến khi đến case 2 bắt đầu lỗi lặp lại và đến case 3, case 4,...
cũng lặp lại*/