package 테스트1;

public class TestBoardController {
    TestBoard[] boards = new TestBoard[100];

    boolean doPost(String content, String writer){
        TestBoard board = new TestBoard();

        board.content = content;
        board.writer = writer;

        for(int index = 0; index <= boards.length-1; index++){
            if(boards[index] == null){
                boards[index] = board;
                return true;
            }
        }
        return false;
    }

    TestBoard[] doGet(){
        return boards;
    }
}
