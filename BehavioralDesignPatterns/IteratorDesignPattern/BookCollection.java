package BehavioralDesignPatterns.IteratorDesignPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookCollection {

    List<Book> books=new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }
    public List<Book> getBooks()
    {
        return books;
    }

    public Iterator<Book> creatIterator(){
        return new BookIterator(books);
    }

//we change the arraylist to tree then we have change this class implementation as well.
    private class BookIterator implements Iterator<Book>{
        private List<Book> bookList;

        private int position=0;

        public BookIterator(List<Book> bookList) {
            this.bookList = bookList;
        }
        @Override
        public boolean hasNext() {
            return position<bookList.size();
        }

        @Override
        public Book next() {
            return bookList.get(position++);
        }
    }
}
