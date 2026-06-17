package commercePJT;

import java.util.ArrayList;
import  java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();

        productList.add(new Product("Galaxy S26", 1250000,
                "Android", 12));

        productList.add(new Product("Iphone 18", 1850000,
                "APPLE", 2));

        productList.add(new Product("Galaxy Book", 2250000,
                "Android", 30));

        productList.add(new Product("MAC Book", 2400000,
                "APPLE", 5));

        CommerceSystem commerceSystem = new CommerceSystem(productList);
        commerceSystem.start();
    }
}
