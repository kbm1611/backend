package day11;

public class Exam1 {
    public static void main(String[] args) {
        // [1] 상속 : A클래스로 부터 B클래스 에게(멤버변수/메소드) 물려주는 행위
        // [2] 목적 : 빠른클래스설계, 한번 만들어둔 클래스 재사용/활용한다.
        // [3] 키우드 : extends( 확장, 뻗다 뜻)
        // [4] 장점 : 유지보수 , 계층관계표현 , 재사용 , **다형성**

        Animal animal1 = new Animal(); //동물 객체
        animal1.name = "강아지";
        animal1.show();

        Bird bird1 = new Bird(); // 조류객체
        bird1.name = "비둘기"; // 조류클래스에는 없지만 물려받은 멤버변수
        bird1.show();

        Sparrow sparrow1 = new Sparrow(); // 참새객체
        sparrow1.name = "참새1";
        sparrow1.show(); // 동물 -> 조류 -> 참새 물려받은 메소드

        Chicken chicken1 = new Chicken();
        chicken1.name = "닭1";
        chicken1.show(); //동물 -> 조류 -> 닭 물려받은 메소드
        // [5] 주의할점:
        // 1.상속은 무조건 하나의 클래스로부터 상속받는다.
        // 2. 하위클래스가 상위클래스를 *선택 구조*

        // [6] 다형성 : 다(양한) 형(태/모양) 성(질)
        // *본질은 그대로 이다, int a = 3 , long b = a;
        // (1) 참새가 조류로 타입 변환
        Bird bird2 = sparrow1; // 자동타입변환, 업캐스팅, 묵시적타입변환
        // (2) 조류(참새)가 동물로 타입 변환
        Animal animal2 = bird2;
        animal2.show(); // 참새1 : 객체*본질*은 그대로 유지
        // (3) 동물(참새)가 참새로 타입 변환
        Sparrow sparrow3 = (Sparrow) animal2; //강제타입변환, 다운캐스팅, 명시적타입변환
        sparrow3.show(); // 참새1
        System.out.println("sparrow1 = " + sparrow1); //주소
        System.out.println("sparrow3 = " + sparrow3); //똑같음
        // (4) 동물이 닭으로 타입변환
        Chicken chicken2 = (Chicken)animal1;
//        chicken2.show(); // 오류 발생 : ClassCastException
        // 참새로 생성한 객체는: 참새 -> 조류 -> 동물, 동물 -> 조류 -> 참새
        // 조류로 생성한 객체는 : 조류 -> 동물, 동물 -> 조류
//        Chicken chicken3 = (Chicken)sparrow1; // 오류, 형제 관계도 타입변환 불가능.

        // [7] 상속활용처 : 1. 웹/앱 라이브러리 2. 클래스 설계 ( 개발 경험 필요 )
    }
}
// 상속은 동시에 못 받음.
class Animal{
    String name;
    void show(){
        System.out.println("Animal.show");
        System.out.println( name );
    }
}
class Bird extends Animal {
    // 조류 클래스는 동물 클래스로부터 상속받는다.
}
class Sparrow extends Bird{
    // 참새 클래스는 조류 클래스로부터 상속받는다.
}
class Chicken extends  Bird{
    // 닭 클래스는 조류 클래스로부터 상속받는다.
    /* 가계도/상속 구조
    *               동물
    *       조류            포유류
    *   참새     닭       박쥐   고래
    * */
}
