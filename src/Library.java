import java.util.ArrayList;

public class Library {

    static ArrayList<Book> books = new ArrayList<>();

    public static void addBook(Book book) {
        books.add(book);
    }

    public static void showBooks() {
        for (Book book : books) {
            System.out.println("Назва: " + book.name + ", Автор: " + book.author + ", Сторінки: " + book.pages);
        }
    }
}
