package day14;

import java.time.LocalTime;
import java.util.Scanner;

public class Exam2 {
    public static void main(String[] args) {
        // [ 시계 thread 만들기]
        ClockThread clockThread = new ClockThread();
        Thread thread = new Thread( clockThread );
        thread.start(); // 시계 스레드 시작

        // [ 타이머 Thread 만들기 ]
        TimerThread timerThread = new TimerThread();

        // [ Main Thread 입력 ]
        for( ; ; ){
            System.out.println("타이머 : 1)ON 2)OFF :");
            Scanner scan = new Scanner(System.in);
            int ch =  scan.nextInt();
            if( ch ==1 ){
                timerThread = new TimerThread();
                timerThread.state = true;
                timerThread.start();
            }
            else if( ch == 2 ){
                if( timerThread != null ){
//                    timerThread.stop(); 가능하지만 비권장
                    timerThread.state = false; //멤버변수로 상태 관리
                }
            }
        }
    }
}
class ClockThread implements Runnable{
    @Override public void run() { // run
        for( ; ;){
            System.out.println(LocalTime.now() ); // 현재시간
            // main스레드가 아닌 현재 작업스레드 1초 일시정지
            try { Thread.sleep( 995 ); } //오차 때문에 990정도로 낮춰서 하는 것이 좋음.
            catch (InterruptedException e) {}
        }
    }
}

class TimerThread extends Thread{
    boolean state = false; //타이머 실행 상태
    @Override public void run() {
        int second = 0; //타이머가 계산하는 초
        for( ; ; ){
            if( state == false ) break; // 타이머 종료
            second++; // 1초 증가
            System.out.printf("[타이머]: %d초\n", second);
            try { Thread.sleep( 995 ); } catch (InterruptedException e) {}
        } // for end
    } // run end
}
