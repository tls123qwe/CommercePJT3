package commercePJT;

import java.util.List;
import java.util.Scanner;

// 커머스 시스템 클래스 생성
public class CommerceSystem {
    // Product를 관리하는 리스트가 필요에 존재
    private final List<Product> productList;

    // 생성자 생성
    public CommerceSystem(List<Product> products) {
        this.productList = products;
    }

    //입력과 반복문 로직은 start 함수를 만들어 관리
    public void start() {
        Scanner sc = new Scanner(System.in);

        while(true) {
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
            if (choice == 0) {
                System.out.println("커머스 플랫폼을 종료 합니다.");
                break;
            }
        }
    }
}

