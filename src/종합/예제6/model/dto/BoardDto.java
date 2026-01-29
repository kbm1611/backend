package 종합.예제6.model.dto;

public class BoardDto {
    private int no;
    private  String content;
    private String writer;

    public BoardDto(){};
    public BoardDto(int no, String content, String writer){
        this.no = no;
        this.content = content;
        this.writer = writer;
    }

    public int getNo() { return no; }
    public String getContent() { return content; }
    public String getWriter() { return writer; }
    public void setNo(int no) { this.no = no; }
    public void setContent(String content) { this.content = content; }
    public void setWriter(String writer) { this.writer = writer; }

    @Override
    public String toString() {
        return "BoardDto{" +
                "no=" + no +
                ", content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                '}';
    }
}
