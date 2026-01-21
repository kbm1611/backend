package day03;

public class Exam1 {

    public static void main(String[] args) {

        //[1] 조건문 if, 만약에~, 경우의 수
        //(1) if( 조건문 ) 실행문;
        int temper = 5;
        if (temper <= 10) System.out.println("외투 입니다. ");

        //(2) if( 조건문 ) {실행문; 실행문;}
        int age = 10;
        if (age >= 19) {
            System.out.println("성인 입니다.");
            System.out.println("19세 입니다.");
        }
        // (3) if( 조건문 ){ 실행문; } else{ 실행문; }
        boolean isMember = false;
        if (isMember == true) {
            System.out.println("안녕하세요 회원님");
        } else {
            System.out.println("비회원 입니다.");
        }
        //(4)
        int money = 1750;
        if (money >= 3000) {
            System.out.println("택시를 탄다.");
        }
        else if(money >= 1700) { System.out.println("버스를 탄다."); }
        else if(money >= 1200) { System.out.println("전동자전거를 탄다."); }
        else{ System.out.println("걸어간다."); }
            //(5)
        int age2 = 25;
        char gender = 'w'; //여자
        if( age2 >= 19){
            System.out.println("성인");
            if(gender == 'w' ) { // 문자 비교 == vs 문자열 비교 .equls
                System.out.println("성인여자");
            }else{
                System.out.println("성인남자");
            }
        }else{
            System.out.println("미성년자");
        }
            //(6) switch : 논리 검사 보다 값에 따른 흐름 제어
        char grade = 'B';
        switch ( grade ) {
            case 'A':
                System.out.println("우수 학생");
                break;
            case 'B':
                System.out.println("장려 학생");
                break;
            default:
                System.out.println("학생");
                break;
        }
            //(7) switch 중첩
        int adult = 1;
        char gender2 = 'w';
        switch ( adult ){
            case 1:
                System.out.println("성인");
                switch ( gender2 ){
                    case 'w':
                        System.out.println("성인여자");
                        break;
                    case 'm':
                        System.out.println("성인남자");
                        break;
                }
                break;
            default:
                System.out.println("미성년자");
                break; //마지막 case에서는 break 생략가능
        }

        // IF = 조건에 따른 논리 검사 실행, SWITCH = 어떠한 값에 따른 흐름 제어( 정해진 경우의 수 )


    }
}
