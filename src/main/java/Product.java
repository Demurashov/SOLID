public class Product {
    protected String title;
    protected int price;
    public Product(String title,int price){
        this.title=title;
        this.price=price;
    }

    public int getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }
}
