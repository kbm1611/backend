package day14;

import java.util.Random;
import java.util.TreeMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Practice16 {
    public static void main(String[] args) {
        //문제1 배달진행 + 화면 갱신 "동시 실행"구현
        DeliveryTask deliveryTask = new DeliveryTask();

        Thread thread1 = new Thread(deliveryTask);
        thread1.start();

        System.out.println("[메인] 주문 화면 갱신1");
        System.out.println("[메인] 주문 화면 갱신2");
        System.out.println("[메인] 주문 화면 갱신3");

        try{
            thread1.join();
        }catch (Exception e){ }
        System.out.println("[안내]배달 처리 종료");

        //문제2 공유장바구니"안전한 총액 계산" 구현(synchronized 적용 버전)
        Cart cart = new Cart();

        UserAThread userA = new UserAThread();
        userA.cart = cart;

        UserBThread userB = new UserBThread();
        userB.cart = cart;

        userA.start();
        userB.start();

        try{
            userA.join();
            userB.join();
        }catch (Exception e){ }
        System.out.printf("[최종]total = %d /예상 = 1500\n", cart.total);

        // 문제3 고객 문의 처리 시스템 구현(스레드풀)
        ExecutorService pool = Executors.newFixedThreadPool(3);
        for(int i = 1; i <= 10; i++){
            InquiryTask inquiryTask = new InquiryTask();
            inquiryTask.iquiryNo = i;
            pool.submit(inquiryTask);
        }
        pool.shutdown();

        try{
            pool.awaitTermination(30, TimeUnit.SECONDS);
        }catch (Exception e){ }
        System.out.println("[안내]모든 문의 처리 종료");
    }
}
class DeliveryTask implements Runnable{
    @Override
    public void run() {
        System.out.println("[배달기사] 이동중1");
        System.out.println("[배달기사] 이동중2");
        System.out.println("[배달기사] 이동중3");
        try { Thread.sleep(1000); }
        catch (InterruptedException e) { }
    }
}
class Cart{
    int total;
    synchronized void addPrice(int price){
        total += price;
        try { Thread.sleep(500); }
        catch (InterruptedException e) { }
        System.out.printf("[장바구니]추가금액 = %d,현재총액 = %d\n", price, total);
    }
}
class UserAThread extends Thread{
    Cart cart;

    @Override public void run() {
        cart.addPrice(100);
        cart.addPrice(100);
        cart.addPrice(100);
        cart.addPrice(100);
        cart.addPrice(100);
    }
}
class UserBThread extends Thread{
    Cart cart;

    @Override public void run() {
        cart.addPrice(200);
        cart.addPrice(200);
        cart.addPrice(200);
        cart.addPrice(200);
        cart.addPrice(200);
    }
}
class InquiryTask implements Runnable{
    int iquiryNo;
    @Override
    public void run() {
        try {
            System.out.printf("[처리시작]문의%d | 스레드 = %s\n", iquiryNo, Thread.currentThread().getName());
            Thread.sleep( 2000);
            System.out.printf("[처리완료]문의%d | 스레드 = %s\n", iquiryNo, Thread.currentThread().getName());
        }  catch (InterruptedException e) {}

    }
}
