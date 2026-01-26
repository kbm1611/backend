package day04;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {

        //문제1
        for(int i = 1; i <= 10 ; i++){
            System.out.println( i );
        }

        //문제2
        for(int i = 10; i >= 1 ; i--){
            System.out.println( i );
        }

        //문제3
        int sum = 0;
        for(int i = 1; i <= 50 ; i++){
            sum += i;
        }
        System.out.println("1부터 50까지의 합계:" + sum );

        //문제4
        for(int i = 1; i <= 20 ; i++){
            if(i % 2 == 0) {
                System.out.println( i );
            }
        }

        //문제5
        for(int i = 1; i <= 30 ; i++){
            if(i % 3 == 0) {
                continue;
            }
            System.out.println( i );
        }

        //문제6
        int sum2 = 0;
        int num;
        for(num = 1; ; num++){
            sum2 += num;
            if(sum2 > 100) {
                break;
            }
        }
        System.out.printf("%d까지 더했을 때 합계가 %d로 100을 넘습니다.\n", num, sum2 );

        //문제7
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print( "*" );
            }
            System.out.print("\n");
        }

        //문제8
        for(int i = 5; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print( "*" );
            }
            System.out.print("\n");
        }

        //문제9
        Scanner scan = new Scanner(System.in);

        int count = 0;
        while( true ){
            System.out.print("입력:"); String input = scan.next();
            if(input.equals("end")){
                break;
            }
            count++;
        }

        //문제10 -> 배열 안 쓰고 더 쉽게 가능한가? 모르겠음
        int july1 = 3531100;
        int july2 = 9123700;
        int july3 = 5183400;
        int july4 = 11738700;

        int july1_no = (int)(3531100 / 10000);
        int july2_no = (int)(9123700 / 10000);
        int july3_no = (int)(5183400 / 10000);
        int july4_no = (int)(11738700 / 10000);

        int july1_re = (int)(july1_no / 100);
        int july2_re = (int)(july2_no / 100);
        int july3_re = (int)(july3_no / 100);
        int july4_re = (int)(july4_no / 100);

        System.out.println("--------7월 매출액--------");
        System.out.print("1주차:"); for(int i = 1; i <= july1_re ; i++){ System.out.print("■"); } System.out.printf("%d만원\n", july1_no);
        System.out.print("2주차:"); for(int i = 1; i <= july2_re ; i++){ System.out.print("■"); } System.out.printf("%d만원\n", july2_no);
        System.out.print("3주차:"); for(int i = 1; i <= july3_re ; i++){ System.out.print("■"); } System.out.printf("%d만원\n", july3_no);
        System.out.print("4주차:"); for(int i = 1; i <= july4_re ; i++){ System.out.print("■"); } System.out.printf("%d만원\n", july4_no);

        //문제11
        int balance = 0; //초기 잔고 0

        boolean isout = true;
        while( isout ){
            System.out.println("------------------------------------");
            System.out.println("1:입금|2:출금|3:잔고|4:종료");
            System.out.println("------------------------------------");
            System.out.print("선택> "); int menu_num = scan.nextInt();

            switch (menu_num){
                case 1: //입금
                    System.out.print("입금액> ");
                    int input_money = scan.nextInt();
                    balance += input_money;
                    break;
                case 2: //출금
                    System.out.print("출금액> ");
                    int output_money = scan.nextInt();
                    if(output_money <= balance){
                        balance -= output_money;
                    }else{
                        System.out.println("잔고보다 큰 금액은 출금할 수 없습니다.");
                    }
                    break;
                case 3: //현재잔고 확인
                    System.out.printf("잔고> %d\n", balance);
                    break;
                case 4: isout = false; break; //종료시 조건 변경
            }
        }





    }
}
