package commercePJT;

import java.util.ArrayList;
import  java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Category> categoryList = new ArrayList<>();

        Category electronic = new Category("전자제품");
        Category clothes = new Category("의류");
        Category food = new Category("식품");

        categoryList.add(electronic);
        categoryList.add(clothes);
        categoryList.add(food);

        electronic.getProductList().add(new Product("Galaxy S26",
                1250000, "Android", 12));

        electronic.getProductList().add(new Product("Iphone 18",
                1850000, "APPLE", 2));

        electronic.getProductList().add(new Product("Galaxy Book",
                2250000, "Android", 30));

        electronic.getProductList().add(new Product("MAC Book",
                2400000, "APPLE", 5));

        CommerceSystem commerceSystem = new CommerceSystem(categoryList);
        commerceSystem.start();
    }
}
