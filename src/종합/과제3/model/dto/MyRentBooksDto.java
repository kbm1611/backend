package 종합.과제3.model.dto;

public class MyRentBooksDto {
    int bid;
    String bookName;
    String writer;


    public MyRentBooksDto(){}

    public MyRentBooksDto(int bid, String bookName, String writer){
        this.bid = bid;
        this.bookName = bookName;
        this.writer = writer;
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


    @Override
    public String toString() {
        return "MyRentBooksDto{" +
                "bid=" + bid +
                ", bookName='" + bookName + '\'' +
                ", writer='" + writer + '\'' +
                '}';
    }
}
