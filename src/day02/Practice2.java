package day02;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        //문제1
        byte a = 10;
        int b = 200;
        System.out.printf("결과:%d\n",(long)(a+b));

        //문제2
        double z = 3.141592;
        System.out.println("원본 double 값:" + z);
        System.out.println("변환된 int 값:" + (int)z);

        //문제3
        Scanner scan = new Scanner( System.in );
        System.out.print("키를 입력하세요:");
        double height = scan.nextDouble();
        System.out.printf("당신의 키는 약%dcm 이군요.\n", (int)height);

        //문제4
        System.out.print("첫 번째 정수 입력:");
        int c = scan.nextInt();
        System.out.print("두 번째 정수 입력:");
        int d = scan.nextInt();
        System.out.print("세 번째 정수 입력:");
        int e = scan.nextInt();

        double avg = (c+d+e) / 3.0;
        System.out.println("평균 결과:\n" + avg); // soutv + 자동완성 , 가장 가까운 변수 출력 함수
    }
}
