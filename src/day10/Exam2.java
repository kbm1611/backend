package day10;

import day07.practice10.Score;

public class Exam2 {
    public static void main(String[] args) {

        // [1] 인터페이스 타입은 객체 생성 불가능 하다.
        // new Keyboard(); // 인터페이스 타입은 생성자가 없다.
        // [2] 인터페이스 타입의 변수 선언
        Keyboard myKeyboard;
            // myKeyboard.aKey(); // 추상메소드를 실행 안된다.
        // [3] 추상메소드 구현하기 = 클래스에서 오버라이딩
        // [4] 구현(객)체 : 해당 인터페이스 구현한 클래스로 객체 생성
        myKeyboard = new fightingGame(); // <--- 키보드에 격투게임 연결
        myKeyboard.aKey(); // [공격]
        myKeyboard.aKey(); // [공격]
        myKeyboard.bKey(3, 2); // [방어]
        // [5] 다형성 - 게임 교체
        myKeyboard = new SoccerGame();
        myKeyboard.aKey(); // [슈팅]
        myKeyboard.aKey(); // [슈팅]
        myKeyboard.bKey(3, 2); // [태클]

        // [6] 구현체 없이 자체적으로 구현 == 익명(이름없는) 구현체
        // new 인터페이스명(){ 오버라이딩 };

        myKeyboard = new Keyboard() {
            @Override
            public void aKey() {
                System.out.println("[밥먹기]");
            }

            @Override
            public int bKey(int x, int y) {
                System.out.println("[공부하기]");
                return 0;
            }
        };
        myKeyboard.aKey(); // 밥먹기

    }
}
class fightingGame implements Keyboard{
    //implements란? 해당 인터페이스내 추상메소드 구현한다.
    @Override
    public void aKey(){
        System.out.println("[공격]");
    }
    @Override
    public int bKey(int x, int y){
        System.out.println("[방어]");
        return x+y;
    }
}
class SoccerGame implements Keyboard{
    //implements란? 해당 인터페이스내 추상메소드 구현한다.
    @Override
    public void aKey(){
        System.out.println("[슈팅]");
    }
    @Override
    public int bKey(int x, int y){
        System.out.println("[태클]");
        return x+y;
    }
}
