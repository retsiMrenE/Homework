
public class Main {
    public static void main(String[] args) {
        // Книга та бібліотека
        Book book1 = new Book("Війна та мир", "Лев Толстой", 1225);
        Book book2 = new Book("Шерлок Холмс", "Артур Конан Дойл", 320);
        Book book3 = new Book("Гаррі Поттер та філософський камінь", "Джоан Роулінг", 336);

        Library.addBook(book1);
        Library.addBook(book2);
        Library.addBook(book3);

        Library.showBooks();

        // Магазин та товари
        Product product1 = new Product("Морозиво", 40);
        Product product2 = new Product("Хліб", 30);
        Product product3 = new Product("Пляшка води", 60);

        Store.addProduct(product1);
        Store.addProduct(product2);
        Store.addProduct(product3);

        Store.showProducts();
    }
}