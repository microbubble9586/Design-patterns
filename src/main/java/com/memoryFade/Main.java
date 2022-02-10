package src.main.java.com.memoryFade;


public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("a"));
        bookShelf.appendBook(new Book("2"));
        bookShelf.appendBook(new Book("3"));
        bookShelf.appendBook(new Book("d"));
        Iterator iterator = bookShelf.iterator();
        while (iterator.hashNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }
    }
}
