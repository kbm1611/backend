package 종합.예제6.controller;

import 종합.예제6.model.dao.BoardDao;
import 종합.예제6.model.dto.BoardDto;

import java.util.ArrayList;

public class BoardController {
    // [*] 싱글톤 생성
    private BoardController(){}
    private static final BoardController instance = new BoardController();

    public static BoardController getInstance(){
        return instance;
    }

    // [*] MVC 패턴 흐름의 dao 싱글톤 호출
    private BoardDao bd = BoardDao.getInstance();

    // 1) 등록 제어 : view에게 입력받은 content, writer 받아서 dao에게 요청후 결과를 view 에게 전달
    public boolean doPost( String content, String writer){
        // 다양할 유효성검사 / 자료의 타입 확인 등등
        boolean saveResult = bd.doPost( content, writer ); // 1. DAO에게 content와 writer 전달하고 결과 받기
        return saveResult;
    }

    // 2) 전체 조회 처리 : view 에게 모든 게시물들을 요청 받아 dao에게 재요청하여 결과를 view에게 전달한다.
    public ArrayList<BoardDto> doGet(){
        return bd.doGet();
    }
}
