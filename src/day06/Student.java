package day06;

public class Student {
    // 1) 속성 = 멤버변수
    String name;
    String lunchBox;
    // 2) 기능 = 메소드 = 객체들 간의 공통/공유 이벤트
    void lunchEat(){  // this 생략가능 , 해당 메소드 호출한 대상/객체
        System.out.println( this.lunchBox );
        System.out.println(lunchBox + "먹는다.");
    }
}
