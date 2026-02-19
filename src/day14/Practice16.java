package day14;

public class Practice16 {
    public static void main(String[] args) {
        //문제1 배달진행 + 화면 갱신 "동시 실행"구현
        DeliveryTask deliveryTask = new DeliveryTask();
        Thread thread1;
        for( ; ; ){
            thread1 = new Thread( deliveryTask );
            thread1.start();
            System.out.println("[메인]주문 화면 갱신1");
            System.out.println("[메인]주문 화면 갱신2");
            System.out.println("[메인]주문 화면 갱신3");
            try { Thread.sleep(1000); }
            catch (InterruptedException e) { }
        }
        //배달처리 종료 함수 구현
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
