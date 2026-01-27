package 종합.예제4;

public class BoardController {
    //디자인패턴의 백앤드에서는 출력x -> scan, print 안씀
    Board[] boards = new Board[100];

    boolean doPost(String content, String writer){
        Board board = new Board();
        board.content = content;
        board.writer = writer;

        for(int i = 0; i <= boards.length-1; i++){
            if(boards[i] == null){
                boards[i] = board;
                return true;
            }
        }
        return false;
    }

    Board[] doGet(){
        return boards;
    }
}
