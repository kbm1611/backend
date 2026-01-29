package 종합.예제5;

import java.util.Scanner;

public class BoardService {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // [1] Controller 생략
        for (; ; ) {
            System.out.println("====== My Community ======");
            System.out.println("1게시물쓰기 2.게시물출력");
            System.out.println("==========================");
            System.out.print("선택>");
            int ch = scan.nextInt();
            if (ch == 1) {
                scan.nextLine();
                System.out.print("내용: "); String content = scan.nextLine();
                System.out.print("작성자: "); String writer = scan.nextLine();
                //BoardController.doPost( ) : static 메소드( 클래스명.메소드명() ) vs bc.doPost( ) : 메소드( 객체명.메소드명 )
                boolean result = BoardController.doPost( content, writer ); // 함수 호출 후 반환(결과)에 따른 흐름제어 하기위해 변수에 저장
                if(result){ System.out.println("[안내] 글쓰기 성공"); System.out.println(); }
                else{ System.out.println("[경고] 게시물 등록할 공간이 없습니다."); }
            } else if (ch == 2) {
                Board[] boards = BoardController.doGet();
                for( Board board : boards ){ // board.writer vs board.getWriter();
                    if(board != null ) {
                        System.out.printf("작성자: %s , 내용 : %s\n", board.getWriter(), board.getContent());
                    }
                }
            }
        }
    } //main end
} // claas end
