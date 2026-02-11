package day13;

public class BoardDto {
    int price;
    String writer;
    String content;

    @Override
    public String toString() {
        return "BoardDto{" +
                "price=" + price +
                ", writer='" + writer + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
