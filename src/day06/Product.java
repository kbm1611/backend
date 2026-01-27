package day06;

public class Product {
    String name;
    int stock = 10;

    boolean sell(int num){
        if(stock < num){ System.out.println("구매 완료"); return false; }
        else{ System.out.println("재고 부족");return true; }
    }
}
