package app;

import java.util.Scanner;

public class ProductInfo {
    static String name;
    static double weight;
    static int quantity;
    static Product product;
    static double totalWeight;
    static String totalWeightRounded;
    static private final String MEASURE = "кг";

    public static void main(String[] args) {
        doInputs();
        showInfo(handleData());
    }

    static private void doInputs() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Наименование товара: ");
        name = scanner.nextLine();
        System.out.print("Вес товара" + " (" + MEASURE + "): ");
        weight = scanner.nextDouble();
        System.out.print("Количество товара (шт.): ");
        quantity = scanner.nextInt();
        scanner.close();
    }

    static private String handleData() {
        product = new Product(name, weight);
        name = product.getName();
        totalWeight = getTotalWeight(product.getWeight(), quantity);
        totalWeightRounded = getTotalWeightRounded(totalWeight);
        return "------------------------\n" +
                "Общий вес товара " + name + " (" + MEASURE + "): "
                + totalWeightRounded;
    }

    static private double getTotalWeight(double weight, int quantity) {
        return weight * quantity;
    }

    static private String getTotalWeightRounded(double totalWeight) {
        return Rounder.roundWeight(totalWeight);
    }

    static private void showInfo(String output) {
        System.out.println(output);
    }
}
