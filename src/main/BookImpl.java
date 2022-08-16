package main;

import data.Book;

public class BookImpl {
    public static void main(String[] args) {
        Book book=new Book();
        book.setTittle("ABCD");
        book.setAuthorName("XYZ");
        book.setIsbnNumber(12345674);
        book.setYearOfPublishing(2000);

        System.out.println("book.getTittle() = " + book.getTittle());
        System.out.println("book.getAuthorName() = " + book.getAuthorName());
        System.out.println("book.getIsbnNumber() = " + book.getIsbnNumber());
        System.out.println("book.getYearOfPublishing() = " + book.getYearOfPublishing());

    }
}
