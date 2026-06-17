package commercePJT;

import java.util.ArrayList;
import java.util.Scanner;
import  java.util.List;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Product> productList = new ArrayList<>();

        productList.add(new Product("Galaxy S26", 1250000,
                "Android", 12));

        productList.add(new Product("Iphone 18", 1850000,
                "APPLE", 2));

        productList.add(new Product("Galaxy Book", 2250000,
                "Android", 30));

        productList.add(new Product("MAC Book", 2400000,
                "APPLE", 5));

        for (int i = 0; i < productList.size(); i++) {
            Product product = productList.get(i);
            System.out.printf("%d. %-12s | %,10d원 | %s%n",
                    i + 1,
                    product.getProductName(),
                    product.getPrice(),
                    product.getDescription());
            }
        System.out.println("0. 종료");
        int choice = sc.nextInt();
        if (choice == 0){
            System.out.println("커머스 플랫폼을 종료 합니다.");

        }
    }
}
