import java.util.ArrayList;

public class Store {

    static ArrayList<Product> products = new ArrayList<>();

    public static void addProduct(Product product) {
        products.add(product);
    }

    public static void showProducts() {
        for (Product product : products) {
            System.out.println("Товар: " + product.name + ", Ціна: " + product.price);
        }
    }
}
