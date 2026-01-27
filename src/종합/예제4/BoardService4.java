package 종합.예제4;

import java.util.Scanner;

public class BoardService4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BoardController bc = new BoardController();
        for( ; ; ){
            System.out.println("====== My Community ======");
            System.out.println("1게시물쓰기 2.게시물출력");
            System.out.println("==========================");
            System.out.print("선택>");

            int ch = scan.nextInt();

            if( ch == 1 ){
                scan.nextLine();
                System.out.print("내용: "); String content = scan.nextLine();
                System.out.print("작성자: "); String writer= scan.nextLine();

                boolean result = bc.doPost(content, writer);
                if(result){ System.out.println("[안내] 글쓰기 성공"); System.out.println(); }
                else{ System.out.println("[경고] 게시물 등록할 공간이 없습니다."); }
            }else if( ch == 2 ){
                Board[] boards = bc.doGet();
                for( int index = 0; index <= boards.length-1; index++){
                    if(boards[index] != null){
                        System.out.println("작성자 : " + boards[index].writer );
                        System.out.println("내용 : " + boards[index].content );
                        System.out.println("---------------------------------");
                    }
                }
            }
        }
    }
}
