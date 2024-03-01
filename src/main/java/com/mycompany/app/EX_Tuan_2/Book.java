package com.mycompany.app.EX_Tuan_2;

public class Book {
        static String title;
        static String author;
        static int page;
       
        public Book(String t, String a, int p){
            title = t;
            author = a;
            page = p;
        }public static void main(String[] args) {
        Book usefullBook = new Book("The Begin", "Mag", 69);
        System.out.println("Title: " + Book.title + "\n" + "Author: " + Book.author + "\n" + "Page: " + Book.page);
        
    }
}
