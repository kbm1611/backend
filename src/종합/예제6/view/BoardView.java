package 종합.예제6.view;

import 종합.예제5.BoardService;
import 종합.예제6.controller.BoardController;
import 종합.예제6.model.dto.BoardDto;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardView {
    // [*] 싱글톤 생성
    private BoardView() {
    }

    private static final BoardView instance = new BoardView();

    public static BoardView getInstance() {
        return instance;
    }

    // [*] MVC 패턴 흐름의 controller 싱글톤 호출
    private BoardController bc = BoardController.getInstance();
    // [*] 입력객체는 모든 메소드에서 사용할 예정이므로 지역변수 말고 메소드 밖에서 선언하자.
    private Scanner scan = new Scanner(System.in);

    // *) 메인 페이지 입출력
    public void indexView(){
        for( ; ; ){
            System.out.println("====== My Community ======");
            System.out.println("1게시물쓰기 2.게시물출력");
            System.out.println("==========================");
            System.out.print("선택>");
            Scanner scan = new Scanner(System.in);
            int ch = scan.nextInt();
            if( ch == 1){ writeView(); }
            else if( ch == 2 ){ printView(); }
        }
    }

    // 1) 등록 입출력 화면
    public void writeView() {
        System.out.print("작성자 : "); String writer = scan.nextLine();
        System.out.print("내용 : "); String content = scan.nextLine();
        // 컨트롤러에게 입력받은 content, writer 전달하여 결과 받아오기

        boolean result = bc.doPost(content, writer);
        if (result) {
            System.out.println("[안내] 글쓰기 성공");
        } else {
            System.out.println("[경고] 글쓰기 실패");
        }
    }

    public void printView( ){
        //1.컨트롤러에게 모든 게시물 요청 하고 결과를 받는다.
        ArrayList<BoardDto> boards = bc.doGet();
        //2. 받은 결과를 모두 출력한다. //ArrayList는 가변(저장된 요소만 있음)길이 라서 null 체크 안한다.

        for(BoardDto board : boards){
            System.out.printf("번호 : %d , 작성자 : %s , 내용 : %s\n", board.getNo(), board.getWriter(), board.getContent() );
        }
    }
}
