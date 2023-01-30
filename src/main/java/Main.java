import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        HashMap<String, Product> products = new HashMap<>();
        products.put("Хлеб", new Product("Хлеб", 56));
        products.put("Масло", new Product("Масло", 153));
        products.put("Колбаса", new Product("Колбаса", 211));
        products.put("Пирожок", new Product("Пирожок", 45));

        writeMenu(products);
        Scanner scanner = new Scanner(System.in);
        Basket basket = new Basket(products.size());
        while (true) {
            String line = scanner.nextLine();
            if ("end".equals(line)) break;
            String[] parts = line.split(" ");
            String product = parts[0];
            int count = Integer.parseInt(parts[1]);
            basket.addPurchase(new Purchase(products.get(product), count));
        }
        long sum = basket.sum();
        System.out.println("ИТОГО: " + sum);
    }

    public static void writeMenu(HashMap<String, Product> products) {
        System.out.println("В МАГАЗИНЕ В НАЛИЧИИ");
        for (Map.Entry<String, Product> productAndPrice : products.entrySet()) {
            System.out.println(productAndPrice.getKey() + " за " + productAndPrice.getValue().getPrice() + " руб./шт.");
        }
        System.out.println("Введите два слова: название товара и количество. Или end");
    }

}

