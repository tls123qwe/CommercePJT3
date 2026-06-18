package commercePJT;

import java.util.List;
import java.util.Scanner;

// 커머스 시스템 클래스 생성
public class CommerceSystem {
    // Product를 관리하는 리스트가 필요에 존재
    private final List<Category> categoryList;

    // 생성자 생성
    public CommerceSystem(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    //입력과 반복문 로직은 start 함수를 만들어 관리
    public void start() {
        Scanner sc = new Scanner(System.in);

        // 카테고리 출력 및 선택
        while (true) {
            for (int i = 0; i < categoryList.size(); i++) {
                System.out.println((i + 1) + "." + categoryList.get(i).getCategoryName());
            }
            System.out.println("0.종료");
            System.out.print("카테고리 선택: ");
            int choice = sc.nextInt();
            if (choice == 0) break;

            Category selected = categoryList.get(choice - 1);
            System.out.println();
            System.out.println("[" + selected.getCategoryName() + "] 카테고리");

            // 상품 출력 및 선택
            while (true) {
                List<Product> products = selected.getProductList();

                for (int i = 0; i < products.size(); i++) {

                    Product product = products.get(i);
                    System.out.printf("%d. %-12s | %,10d원 | %s%n",
                            i + 1,
                            product.getProductName(),
                            product.getPrice(),
                            product.getDescription());
                }

                System.out.println("0.뒤로가기");
                System.out.print("원하는 상품 선택: ");
                int productChoice = sc.nextInt();
                if (productChoice == 0) break;

                // 선택된 상품 출력
                Product selectedProduct = products.get(productChoice - 1);

                System.out.println();
                System.out.printf("%-12s | %,10d원 | %d 개%n",
                        selectedProduct.getProductName(),
                        selectedProduct.getPrice(),
                        selectedProduct.getStock());
                System.out.println();
            }
        }sc.close();
    }
}

