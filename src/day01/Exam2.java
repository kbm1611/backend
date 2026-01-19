package day01;

public class Exam2 {

    // 자바에서 최초의 실행 흐름(스레드)를 갖는 (미리만들어진)함수
    public static void main(String[] args) {
        // [2] 리터럴 : 상수 이면서 키보드로 입력가능한 자료들
        // 3, 3.14, 'a', true, false
        System.out.println( 3 );        // JS의 console.log() 동일한 기능의 함수
        System.out.println();           // sout + 엔터 : System.out.println( 출력자료 );
        System.out.println("유");       // 선언 또는 함수실행 뒤에 ;세미콜론 작성한다.
        System.out.println("유재석");    // 문자열 처리할때는 "큰따옴표 사용
        // [3] 자료형/타입(분류) : 자료들을 효율적으로 사용하기 위한 분류 방법
        // 바이트란? bit의 8개가 모이면 1byte
        // 정수 : byte(1) , short(2) , int(4)(*) long(8)
        // 실수 : float(4, 소수점 8자리) , double(8, 소수점 17자리 표현)(*)
        // 문자 : char(2) -> c언어에서 1바이트, java에서는 유니코드를 사용하기 때문에 2바이트, 문자열 : String( 문자열 클래스 , " " 큰따옴표 감싼)
        // 논리 : boolean(1)

        boolean boo1 = true; // [동적타입] let bool1 = true;
        boolean boo2 = false; // 변수명은 카멜표기법 권장, 숫자시작/일부특수/띄어쓰기 안됨
        //boolean bool3 = 3; // [오류] boolean은 3 저장 할 수 없다.
        System.out.println(boo1);
        System.out.println(boo2);

        // 2. char : ''작은따옴표로 감싼 문자 1개 저장하는 타입
        char ch1 = 'A'; System.out.println( ch1 );
//        char ch2 = 'ABC' [오류] 문자 여러개 불가능
//        char ch3 = "A"; [오류] " " 저장 불가능

        // 3. String : " " 큰따옴표로 감싼 문자 여러개 저장하는 (클래스)타입
        String str1 = "ABC강"; System.out.println( str1 );

        // 4. byre : -128 ~ 127
        byte b1 = 100;
//        byte b2 = 300; // [오류]

        // 5. short : +- 3만정도
        short s1 = 32000; System.out.println( s1 );
//        short s2 = 40000; // [오류]

        // 6. int : +-21억 정도, 정수의 리터럴 기본타입, 즉] 키보드로부터 입력받은 int 타입이다.
        int i1 = 2100000000; System.out.println( i1 );
//        int i2 = 3000000000; // [오류]

        // 7. long : +-21억 이상 , 리터럴 뒤에 L/l 붙인다.
        long l1 = 3000000000L; // 그냥은 INT이기 때문에 L을 붙여 long타입임을 명시해줌.
        System.out.println( l1 );

        // 8. double : 소수점 포함한 17자리 표현, 실수의 리터럴 기본타입
        double d1 = 0.123456789123456789; System.out.println( d1 );


        // 9. float : 소수점 포함한 8자리 표현, 리터럴 뒤에 F/f 붙인다.
        float f1 = 123.123456799123456789F; System.out.println( f1 );
    }
}
