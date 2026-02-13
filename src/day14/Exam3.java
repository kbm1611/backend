package day14;

public class Exam3 {
    public static void main(String[] args) {

        //[동기화 vs 비동기화] , 메소드들은 비동기화 상태이다.
        /* [동기화]
            1. 정의: 메소드/기능에 Lock(락) 사용하여 메소드를 점령하는 상태
            2. 목적: 서로 다른 여러 스레드가 동시에 하나의 메소드에 사용한다면 충돌 발생할 수 있음.
            3. 비교:
                동기화(무조건 순서대로)    비동기화(순서 보장x)
                처리순서 보장            처리순서 보장 안됨
            4. 사용법 -> 대량데이터를 처리할 때는 웬만하면 사용, 웹 / 앱에서 사용
                sychronized 타입명 메소드명(){}
         */

        // 1) 계산기 객체 생성
        Calculator calculator = new Calculator();
        // 2) 스레드A
        WorkThreadA threadA = new WorkThreadA();
        threadA.calculator = calculator;
        // 3) 스레드B
        WorkThreadB threadB = new WorkThreadB();
        threadB.calculator = calculator;
        // *2개의 쓰레드가 동일한 계산기객체를 멤버변수로 갖는 예제
        threadA.start();
        threadB.start();

    }
}

class Calculator{
    int memory; // 멤버변수 // 계산기가 갖는 값
    // 메소드
    public synchronized void setMemory( int memory ){
        // this란? 현재 메소드를 실행한 객체라는 뜻
        // 멤버변수명과 매개변수명이 같을 때 식별용
        this.memory = memory;
        try { Thread.sleep( 2000 ); } //2초간 스레드 일시정지
        catch (InterruptedException e) {}
        System.out.println( Thread.currentThread().getName() ); //현재 스레드의 이름
        System.out.println("결과: " + this.memory );
    }
}
// 2개의 쓰레드가 동일한 계산기객체를 갖는 예제
class WorkThreadA extends Thread{
    Calculator calculator;

    @Override public void run() {
        calculator.setMemory( 100 ); //계산기에 100 넣기
    }
}
class WorkThreadB extends Thread{
    Calculator calculator;

    @Override public void run() {
        calculator.setMemory( 200 ); //계산기에 200 넣기
    }
}