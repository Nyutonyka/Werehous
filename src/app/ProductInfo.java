package app;

public class ProductInfo {
    static String name;
    static double weight;
    static Product product;

    public static void main(String[] args) {
        handleData();
    }

    static private void handleData() {
        product = new Product(name, weight);
        name = product.getName();
    }
}
