package 종합.예제7.view;

import 종합.예제7.controller.BoardController;
import 종합.예제7.model.dto.BoardDto;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BoardView {
    private BoardView(){}
    private static final BoardView instance = new BoardView();
    public static BoardView getInstance(){ return instance; }

    private BoardController bc = BoardController.getInstance();

    private Scanner scan = new Scanner(System.in);
    public void indexView(){
        for( ; ; ){
            try{
                System.out.println("====== My Community ======");
                System.out.println("1게시물쓰기 2.게시물출력 3.게시물수정 4.게시물삭제");
                System.out.println("==========================");
                System.out.print("선택>");
                int ch = scan.nextInt();
                if( ch == 1){ writeView(); }
                else if( ch == 2 ){ findAll(); }
                else if( ch == 3){ updateView(); }
                else if( ch == 4){ deleteView(); }
                else{ System.out.println("[경고] 없는 기능 번호 입니다."); }
            }catch( InputMismatchException e2){
                System.out.println("[경고] 잘못된 입력 방식 입니다.[재입력]");
                scan = new Scanner( System.in ); //입력객체 초기화 ( 잘못된 입력값 제거 )
            } catch(Exception e){ // Exception 예외 중 슈퍼클래스로 모든 예외처리 가능
                System.out.println("[시스템오류] 관리자에게 문의");
            } // t-c end
        } // f end
    } // indexView end

    // [1] 게시물 등록 view
    public void writeView(){
        scan.nextLine();
        System.out.print("내용 : "); String bcontent = scan.nextLine();
        System.out.print("작성자 : "); String bwriter = scan.nextLine();
        boolean result = bc.write( bcontent, bwriter );
        if( result ){ System.out.println("[안내] 게시물 등록 완료"); }
        else{ System.out.println("[경고] 게시물 등록 실패"); }
    }
    // [4] 게시물 삭제 view
    public void deleteView(){
        System.out.print("삭제할 게시물 번호 : "); int bno = scan.nextInt();
        boolean result = bc.delete( bno );
        if( result ){ System.out.println("[안내] 게시물 삭제 완료"); }
        else{ System.out.println("[경고] 게시물 삭제 실패"); }
    }
    // [3] 게시물 수정 view
    public void updateView(){
        System.out.print("수정할 게시물 번호 : "); int bno = scan.nextInt();
        scan.nextLine();
        System.out.print("수정할 내용 : "); String bcontent = scan.nextLine();
        boolean result = bc.update( bno, bcontent );
        if( result ){ System.out.println("[안내] 게시물 수정 완료"); }
        else{ System.out.println("[경고] 게시물 수정 실패"); }
    }
    // [2] 게시물 전체 조회 view
    public void findAll(){
        ArrayList<BoardDto> boards = bc.findAll();

        int cnt = 1;
        for(BoardDto board : boards){
            System.out.printf("게시물 번호: %d\n작성일: %s\n작성자: %s\n내용 :%s\n", cnt, board.getBdate(), board.getBwriter(), board.getBcontent());
            System.out.println("-----------------------------------------------------------------");
            cnt++;
        }
    }

} //class end
