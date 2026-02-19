package day15;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Exam1 {
    public static void main(String[] args) {

        // [ 제네릭 타입 ]
        // 1. 정의 : 여러가지 타입에서 동작할 수 있도록 만든 타입, < >
        // 2. 목적 : 클래스 정의할 때 멤버변수 *타입* 정하지 않고 인스턴스(객체) 생성할 때 타입을 정한다. (통합 용도로 많이 사용함)
        // 3. 사용법
            // 1. 제네릭타입명은 대문자로 한다.
            // 2. 여러개 가능하다.
            // 3. 제네릭타입에 대입된느 타입은 기본타입 안된다. <래퍼클래스사용>
                // int -> Integer
        /*
            class 클래스명< 제네릭타입1 , 제네릭타입2 >{

                제네릭타입1 멤버변수명;
                void 함수명( 제네릭타입2 매개변수명 ) { }
            }

            클래스명 < 타입1 , 타입2 > 변수명;
        */

        // (1)
        Box1 box1 = new Box1();
        box1.content = "안녕하세요";
        String content1 = box1.content;

        Box2 box2 = new Box2();
        box2.content = 100;
        int content2 = box2.content;

        // box1.content = 100;      // 타입이 다른 멤버변수에는 값 대입 불가능.
        // box2.content = "안녕하세요":

        // (2) 제네릭 사용되는 상황
        Box3< String > box3 = new Box3<>();
        box3.content = "안녕하세요";     String content3 = box3.content;
        Box3< Integer > box33 = new Box3<>();
        box33.content = 100;           int content33 = box33.content;

        // ArrayList 컬렉션프레임워크 사용됨.
        ArrayList< String > list1 = new ArrayList<>(); // ArrayList 안에서 제네릭타입을 String 타입으로 사용하겠다는 뜻
        // ArrayList < Dto > list2 = new ArrayList<>();                             Dto 타입으로 사용하겠다는 뜻

        // (3) 제네릭타입 여러개
        Box4< String, Integer > box4 = new Box4<>();
        box4.value1 = "안녕하세요"; box4.value2 = 100;

        // (4) 제네릭타입 중첩 가능
        Box4< String, ArrayList<String> > box44 = new Box4<>();
        box44.value1 = "안녕하세요"; box44.value2 = new ArrayList<>();

        // (5) 활용처2: 배열 -> 리스트
        내가만든리스트 < String > list2 = new 내가만든리스트<>();
    }
}

class Box1{ String content; }
class Box2{ int content; }
class Box3< 제네릭타입 >{ 제네릭타입 content; }
class Box4< T, E >{ T value1; E value2; }

class 내가만든리스트< E >{
    E content;
    내가만든리스트(){
        content = (E)new Object[10];
    }
}
