package day02;

import java.util.Scanner;

public class Practice3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );

        //문제1
        System.out.print("국어 점수:");     int kor = scan.nextInt();
        System.out.print("영어 점수:");     int eng = scan.nextInt();
        System.out.print("수학 점수:");     int math = scan.nextInt();

        int sum = kor + eng + math;
        System.out.println("총점:" + sum);    System.out.println("평균:" + sum/3.0);

        //문제2
        System.out.print("반지름을 입력하세요:");        double r = scan.nextDouble();
        double area = r*r*3.14;
        System.out.println("원의 넓이:" + area);

        //문제3
        System.out.print("첫 번째 실수:");       double d1 = scan.nextDouble();
        System.out.print("두 번째 실수:");       double d2 = scan.nextDouble();
        double rate = d1/d2 * 100;
        System.out.printf("비율: %f%%\n", rate);

        //문제4
        System.out.print("정수를 입력하세요:");     int i1 = scan.nextInt();
        System.out.println( i1 % 2 == 1 );

        //문제5
        System.out.print("정수를 입력하세요:");     int i2 = scan.nextInt();
        System.out.println("결과:" + (i2 % 7 == 0) );

        //문제6
        System.out.print("아이디:");       String id = scan.next();
        System.out.print("비밀번호:");      String pwd = scan.next();
        boolean result1 = id.equals("admin") && pwd.equals("1234");
        System.out.println( result1 );

        //문제7
        System.out.print("정수를 입력하세요:");     int i3 = scan.nextInt();
        boolean result2 = i3 % 2 == 1 && i3 % 7 == 0;
        System.out.println( result2 );

        //문제8
        System.out.print("1차 점수:");     int score1 = scan.nextInt();
        System.out.print("2차 점수:");     int score2 = scan.nextInt();
        System.out.println( score1 + score2 >= 150 ? "합격" : "불합격" );

        //문제9
        System.out.print("이름을 입력하세요:");     String name = scan.next();
        System.out.println( name.equals("유재석") ? name + "(방장)" : name);

        //문제10
        System.out.print("밑변:");    double bottom = scan.nextDouble();
        System.out.print("높이:");    double height = scan.nextDouble();
        double tarea = bottom * height / 2.0;
        System.out.println("삼각형의 넓이:" + tarea );

        //문제11
        System.out.print("섭씨 온도:");     double temper = scan.nextDouble();
        double tempF = (temper * 9.0 / 5.0) + 32;
        System.out.println("화씨 온도:" + tempF);

        //문제12
        System.out.print("태어난 년도:");    int year = scan.nextInt();
        int age = 2025 - year;
        System.out.printf("2025년 기준 나이:%d세\n", age);

        //문제13
        System.out.print("키(cm):");     double cm = scan.nextDouble();
        System.out.print("몸무게(kg):");  double kg = scan.nextDouble();
        double bmi = kg / ((cm/100) * (cm/100));
        System.out.println("BMI 지수:" + bmi);

        //문제14
        System.out.print("아이디:");       String id2 = scan.next();
        System.out.print("이메일:");       String email = scan.next();
        boolean result3 = id2.equals("admin") || email.equals("admin@test.com");
        System.out.println("결과:" + (result3 ? "관리자" : "일반사용자") );

        //문제15
        System.out.print("점수를 입력하세요:");     int score = scan.nextInt();
        char rating = score >= 90 ? 'A' : score >= 80 ? 'B' : 'C';
        System.out.println("등급:" + rating);

        //문제16
        System.out.print("나이를 입력하세요:");     int age2 = scan.nextInt();
        boolean result4 = age2 >= 20 && age2 < 30;
        System.out.println(result4 ? "이벤트 대상입니다." : "이벤트 대상이 아닙니다.");
    }
}
