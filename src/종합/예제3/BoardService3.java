package 종합.예제3;

import java.util.Scanner;

public class BoardService3 {

    public static void main(String[] args) {
        Board[] boards = new Board[100];
        Scanner scan = new Scanner(System.in);

        for( ; ; ){
            System.out.println("====== My Community ======");
            System.out.println("1게시물쓰기 2.게시물출력");
            System.out.println("==========================");
            System.out.print("선택>");

            int ch = scan.nextInt();
            //[5] 제어문, 코드 흐름 제어( 논리적인 사고, 경우의 수 등)
            if( ch == 1 ){
                Board board = new Board();
                scan.nextLine(); // .nextLine() 앞에 다른 next 존재하면 하나로 인식
                System.out.print("내용 : " );   board.content = scan.nextLine();
                System.out.print("작성자 : ");   board.writer = scan.nextLine();

                boolean check = false;
                for(int index = 0; index <= boards.length-1; index++){
                    if( boards[index] == null){
                        boards[index] = board;
                        check = true; break;
                    }
                }
                if(check){ System.out.println("[안내] 글쓰기 성공"); System.out.println(); }
                else{ System.out.println("[경고] 게시물 등록할 공간이 없습니다."); }

            }else if(ch == 2){
                for(int index = 0; index<= boards.length-1; index++){
                    if(boards[index] == null){
                        continue;
                    }else{
                        System.out.printf("작성자 : %s\n내용 : %s\n", boards[index].writer, boards[index].content);
                        System.out.println("---------------------------------------");
                    }
                    System.out.println();
                }
            }
        }
    }
}
