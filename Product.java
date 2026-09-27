import java.util.Arrays;

public class Product {

    String name;
    double price;
    String[] tags;

    Product(String name, double price, String[] tags) {

        this.name = name;
        this.price = price;
        this.tags = tags;


    }


    public void printInfo() {
        System.out.println("Product name: " + name + " | Price: " + price);
    }

    public boolean hasTag(String tag) {
        for (String t : tags) {
            if (t.equals(tag)) {
                return true;
            }
        }
        return false;
    }


}


