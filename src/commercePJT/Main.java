package commercePJT;

import java.util.ArrayList;
import  java.util.List;

public class Main {
    public static void main(String[] args) {

        // 1. 카테고리 리스트를 만들고
        List<Category> categoryList = new ArrayList<>();

        // 2. 새로운 카테고리를 만든 후
        Category electronic = new Category("전자제품");
        Category clothes = new Category("의류");
        Category food = new Category("식품");

        // 3. 리스트에 추가한다.
        categoryList.add(electronic);
        categoryList.add(clothes);
        categoryList.add(food);

        // 4. 각 카테고리에 상품리스트를 호출해서 상품을 등록하는데
        // 4-1. 상품 리스트는 카테고리를 만들 때 만들어진다.
        electronic.getProductList().add(new Product("Galaxy S26",
                1250000, "Android", 12));

        electronic.getProductList().add(new Product("Iphone 18",
                1850000, "APPLE", 2));

        electronic.getProductList().add(new Product("Galaxy Book",
                2250000, "Android", 30));

        electronic.getProductList().add(new Product("MAC Book",
                2400000, "APPLE", 5));

        // 5. 만들어진 카테고리 리스트로 커머스시스템을 만들고
        CommerceSystem commerceSystem = new CommerceSystem(categoryList);
        // 6. 로직을 시작한다.
        commerceSystem.start();
    }
}
