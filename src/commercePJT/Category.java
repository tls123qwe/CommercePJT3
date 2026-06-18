package commercePJT;

import java.util.ArrayList;
import java.util.List;

// 카테고리 클래스 만들기
public class Category {
    // 카테고리이름
    private String categoryName;
    // 상품 클래스를 관리하는 클래스니깐 리스트 가져오기
    private List<Product> productList;

    // 생성자
    public Category(String categoryName){
        this.categoryName = categoryName;
        this.productList = new ArrayList<>();
    }

    public String getCategoryName() {
        return categoryName;
    }

    public List<Product> getProductList() {
        return productList;
    }
}
