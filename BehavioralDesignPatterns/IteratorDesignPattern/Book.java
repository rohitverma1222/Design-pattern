package BehavioralDesignPatterns.IteratorDesignPattern;

public class Book {
    private String Name;

    public Book(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("Name='").append(Name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
