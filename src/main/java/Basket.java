import java.util.Map;

public class Basket {
    protected Purchase[] purchases;
    public Basket(int size) {
        purchases = new Purchase[size];
    }
    public void addPurchase(Purchase purchase) {
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] == null) {
                purchases[i] = purchase;
                //return;
                break;
            }
            if (purchases[i].product.equals(purchase.product)) {
                purchases[i].count += purchases[i].count;
                //return;
                break;
            }
        }
    }

    public long sum() {
        long sum = 0;
        System.out.println("КОРЗИНА:");
        for (int i = 0; i < purchases.length; i++) {
            //Purchase purchase = purchases[i];
            if (purchases[i] == null) continue;
            System.out.println("\t" + purchases[i].product.title + " " + purchases[i].count + " шт. в сумме "
                    + purchases[i].count* purchases[i].product.price + " руб.");
            sum += purchases[i].count * purchases[i].product.price;
        }
        return sum;
    }
}

