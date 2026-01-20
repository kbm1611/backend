package day01;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        //문제1
        System.out.println( 25 );
        System.out.println("홍길동");

        //문제2
        int age = 25;
        System.out.println( age );

        //문제3
        String name = "안재민";
        int age2 = 29;
        double height = 182;
        String motto = "인생은 길고 얇게";

        //문제4
        System.out.println("제 이름은" + name + ", 나이는" + age2 + "세, 키는" + height + "cm 입니다.");

        //문제5
        System.out.printf("제 이름은 %s, 나이는 %d세, 키는 %3.1fcm 입니다.\n", name, age2, height);

        //문제6
        System.out.println("|\\_/|");
        System.out.println("|qp| /}");
        System.out.println("(0)\"\"\"\\");
        System.out.println("|\"^\"` |");
        System.out.println("||_/=\\\\__|");

        //문제7
        int num = 1;
        String writer = "유재석";
        String content = "안녕하세요!";
        System.out.printf("""
                ===========방문록==========
                번호 작성자 방문록
                %d  %s %s
                ==========================
                """, num, writer, content);

        //문제8
        Scanner scan1 = new Scanner( System.in );
        System.out.print("이름을 입력하세요: ");
        String name2 = scan1.next();
        System.out.print("나이를 입력하세요: ");
        int age3 = scan1.nextInt();
        System.out.printf("%s님의 나이는 %d세 입니다.\n", name2, age3);

        //문제9
        System.out.print("게시물 번호: ");
        int boardnum = scan1.nextInt();
        System.out.print("제목: ");
        scan1.nextLine();
        String title = scan1.nextLine();
        System.out.print("내용: ");
        String content2 = scan1.nextLine();
        System.out.printf("[%d번 게시물]\n제목: %s\n내용: %s\n", boardnum, title, content2);

        //문제10
        System.out.print("성별을 입력하세요(남/여): ");
        char sex = scan1.next().charAt(0);
        System.out.printf("입력하신 성별은'%c'입니다.\n", sex);

        //문제11
        System.out.print("이름:");
        String name3 = scan1.next();
        System.out.print("나이:");
        int age4 = scan1.nextInt();
        System.out.print("키:");
        double height2 = scan1.nextDouble();
        System.out.print("프로그래머입니까?(true/false):");
        boolean isProgramer = scan1.nextBoolean();

        System.out.printf("이름:%s\n나이:%d\n키:%f\n프로그래머 여부:%s\n", name3, age4, height2, isProgramer);
    }
}
