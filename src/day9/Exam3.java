package day9;

public class Exam3 {
    public static void main(String[] args) {

        // (1) 상위 객체
        Higher obj1 = new Higher();
        obj1.show();
        // obj1.show2(); 자식의 멤버변수/메소드 사용 불가

        // (2) 하위 객체
        Lower obj2 = new Lower();
        obj2.show(); // 부모 메소드 대신에 오버라이딩 된 메소드 실행
        obj2.show2();

        // (3) 타입변환 // 자식 -> 부모 타입변환
        Higher obj3 = obj2;
        obj3.show(); // 타입은 부모타입이지만 오버라이딩이 메소드 호출이 우선적이기 때문에 오버라이딩 실행됨.

        // (4) 부모와 자식 간의 멤버변수 공유 가능
        System.out.println( obj2.value1 );
        System.out.println( obj2.value3 );
    }
}

class Higher{
    int value1 = 10; int value2 = 20;
    Higher(){
        System.out.println("상위클래스생성");
    }
    void show(){
        System.out.println("상위클래스메소드실행");
    }
}

class Lower extends Higher{
    int value3 = 30; int value4 = 40;
    Lower(){
        System.out.println("하위클래스생성");
    }
    @Override // 생략가능, 물려받은 메소드 재정의한다.
    void show(){ /* 상위크랠스 메소드 선언부가 일치하면 오버라이딩*/
        // -- 오버라이딩하면 최우선으로 실행된다.
        System.out.println("하위클래스메소드실행(재정의)");
    }
    // 오버라이딩 vs 오버로딩
    void show( int a ){ }
    void show2(){
        System.out.println("하위클래스메소드실행2");
        System.out.println( this.value3 ); // this : 현재 객체 뜻
        System.out.println( super.value1 ); // super : 상위 객체 뜻
        // 부모와 자식 간의 멤버변수명이 동일할 때 this, super
    }
}
