package 테스트1;

import java.util.Scanner;

public class TestBoardService {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TestBoardController tbc = new TestBoardController();

        for( ; ; ){
            System.out.println("==========My Community==========");
            System.out.println("1.등록|2.출력");
            System.out.println("================================");
            System.out.print("선택>"); int ch = scan.nextInt();

            if( ch == 1){
                scan.nextLine();
                System.out.print("내용: "); String content = scan.nextLine();
                System.out.print("작성자: "); String writer = scan.nextLine();
                boolean result = tbc.doPost(content, writer);
                if(result){ System.out.println("[안내]등록 성공"); }
                else{ System.out.println("[경고]등록 실패");  }
            } else if( ch == 2){
                System.out.println("==========게시물 목록==========");
                TestBoard[] boards = tbc.doGet();
                for(int index = 0; index <= boards.length-1; index++){
                    if(boards[index] != null){
                        System.out.println("작성자: " + boards[index].writer);
                        System.out.println("내용: " + boards[index].content);
                        System.out.println("--------------------------");
                    }
                }
            }
        }
    }
}
