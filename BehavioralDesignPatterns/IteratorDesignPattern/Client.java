package BehavioralDesignPatterns.IteratorDesignPattern;

import java.util.Iterator;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        BookCollection books=new BookCollection();
        books.addBook(new Book("Book 1"));
        books.addBook(new Book("Book 2"));
        books.addBook(new Book("Book 3"));
//
//        for(Book book:books.getBooks())
//        {
//            System.out.println(book);
//        }
        Iterator<Book> bookIterator=books.creatIterator();
        while(bookIterator.hasNext())
        {
            System.out.println(bookIterator.next());
        }


    }
}
