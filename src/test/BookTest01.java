package test;

import domain.Book;

public class BookTest01 {
    public static void main(String[] args) {
        System.out.println("Welcome to library!");
        Book book1 = new Book();
        book1.title = "Head First Java";
        book1.edition = 2;
        book1.year = 2005;
        book1.subject = "Programming";
        System.out.println("-------- Book 1 --------");
        System.out.println("Title: "+book1.title);
        System.out.println("Edition: "+book1.edition);
        System.out.println("Year: "+book1.year);
        System.out.println("Subject: "+book1.subject);
        System.out.println("------------------------");
    }
}
