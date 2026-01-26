package 종합.예제1;

import java.util.Scanner;

public class BoardService { //class start
    //자바는 무조건 클래스 단위로 작성한다.

    public static void main(String[] args) { //main start
        //[1] 메모리 설계 : 데이터 6개 저장 -> 변수 6개 사용, [배열/객체 학습 전]
        String content1 = null;
        String writer1 = null;
        String content2 = null;   String writer2 = null;
        String content3 = null;   String writer3 = null;
        //[2] 반복문 , 무한루프
        for( ; ; ){
            System.out.println("====== My Community ======");
            System.out.println("1게시물쓰기 2.게시물출력");
            System.out.println("==========================");
            System.out.print("선택>");
            Scanner scan = new Scanner(System.in);
            int ch = scan.nextInt();
            //[5] 제어문, 코드 흐름 제어( 논리적인 사고, 경우의 수 등)
            if( ch == 1 ){
                scan.nextLine(); // .nextLine() 앞에 다른 next 존재하면 하나로 인식
                System.out.println("내용 : " );   String 내용 = scan.nextLine();
                System.out.println("작성자 : ");   String 작성자 = scan.nextLine();
                if( content1 == null && writer1 == null){
                    content1 = 내용; writer1 = 작성자;
                } else if( content2 == null && writer2 == null){
                    content2 = 내용; writer2 = 작성자;
                } else if( content3 == null && writer3 == null){
                    content3 = 내용; writer3 = 작성자;
                } else{
                    System.out.println("[경고] 게시물 등록할 공간이 없습니다.");
                }
                System.out.println("[안내] 글쓰기 성공");
            }else if(ch == 2){
                if( content1 != null && writer1 != null){
                    System.out.printf("작성자 : %s , 내용 : %s \n", content1, writer1);
                }
                if( content2 != null && writer2 != null){
                    System.out.printf("작성자 : %s , 내용 : %s \n", content1, writer1);
                }
                if( content3 != null && writer3 != null){
                    System.out.printf("작성자 : %s , 내용 : %s \n", content1, writer1);
                }

            }
        }

    } //main end
} // class end
