package 종합.과제3.model.dto;

public class BookDto {
    int bid;
    String bookName;
    String writer;
    int status;

    public BookDto(){}

    public BookDto(int bid, String bookName, String writer, int status){
        this.bid = bid;
        this.bookName = bookName;
        this.writer = writer;
        this.status = status; // 0이면 대출 가능, 0이 아니면 대출 중
    }

    public int getBid() {
        return bid;
    }
    public String getBookName() {
        return bookName;
    }
    public String getWriter() {
        return writer;
    }
    public void setBid(int bid) {
        this.bid = bid;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "BookDto{" +
                "bid=" + bid +
                ", bookName='" + bookName + '\'' +
                ", writer='" + writer + '\'' +
                ", status=" + status +
                '}';
    }
}
