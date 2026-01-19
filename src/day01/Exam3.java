package day01;

public class Exam3 {

    public static void main(String[] args) {

        // [1] System.out.println() : 자료 출력 후 줄바꿈포함 sout 자동완성
        // System : 클래스 이면서 시스템(현재 컴퓨터) 관련 기능/함수 제공한다.
        // out : 출력에 관련된 기능/함수 갖는 객체 반환
        // print : 출력함수
        System.out.println("자바안녕1");
        // [2] System.out.print() : 자료 출력
        System.out.print("자바안녕2");
        // [3] System.outprinf() : 자료 출력 + 형식문자
        System.out.printf(" %s ", "자바안녕3");
        /*
        * printf(format 형식)
        *   %s : 문자열, %d : 정수 , %c : 문자, %f : 실수
        * */
        String name = "유재석";        int age = 10;
        System.out.printf("저는" + name + "이고 나이는" + age + "입니다.");
        //JS에서는 `${}` 사용하듯이 하는 것.
        System.out.printf("저는 %s 이고 나이는 %d 입니다.\n", name, age);
        System.out.printf("저는 %s 이고 나이는 %6d 입니다.\n", name, age);
        System.out.printf("저는 %s 이고 나이는 %-6d 입니다.\n", name, age);
        System.out.printf("저는 %s 이고 나이는 %06d 입니다.\n", name, age);
        System.out.printf("저는 %s 이고 키는 %5.2f 입니다.\n", name, 177.2537);

        System.out.println("안녕1\n안녕2");
        System.out.println("안녕1\t안녕2");
        System.out.println("안녕1\"안녕2\"");
        System.out.println("안녕1'안녕2'");
        System.out.println("안녕1\\안녕2\\");


        // [5] 이스케이프/제어 문자
        // "\n" : 줄바꿈

    }
}
