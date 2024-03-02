package com.mycompany.app.EX_Tuan_2.Code_1;

public class Book {

        String title;
        String author;
        int page;
       
        public Book(String t, String a, int p){
            title = t;
            author = a;
            page = p;
        }public static void main(String[] args) {
        Book usefullBook = new Book("The Begin", "Mag", 69);
        System.out.println("Title: " + usefullBook.title + "\n" + "Author: " + usefullBook.author+ "\n" + "Page: " + usefullBook.page);
        
    }
}
