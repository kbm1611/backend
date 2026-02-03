package 종합.과제3.controller;

import 종합.과제3.database.DB;
import 종합.과제3.model.dao.BookDao;
import 종합.과제3.model.dto.BookDto;
import 종합.과제3.model.dto.MyRentBooksDto;
import 종합.과제3.model.dto.RentBookDto;

import java.util.ArrayList;

public class BookController {
    private BookController(){}
    private static final BookController instance = new BookController();
    public static BookController getInstance(){
        return instance;
    }
    BookDao bd = BookDao.getInstance();

    // [1] 도서 대출
    public boolean rentBook(int bid){
        for(BookDto book : DB.books){
            if(book.getBid() == bid && book.getStatus() == 0){ // 도서번호가 일치하고 대출 가능한 책을 찾을 시
                return bd.rentBook(bid);
            }
        }
        return false; //대출 가능한 책을 찾지 못할 시 false 반환
    }
    // [2] 도서 반납
    public boolean returnBook(int bid){
        for(RentBookDto rentbook : DB.rentbooklist){
            if(rentbook.getBid() == bid && UserController.getInstance().getLoginSession() == rentbook.getUid()){ //일치하는 빌린 책 도서번호와 사용자가 일치할 시
                return bd.returnBook(bid);
            }
        }
        return false; //없으면 false값 반환
    }
    // [3] 전체도서 조회
    public ArrayList<BookDto> getAllBooks(){
        return bd.getAllBooks();
    }
    // [4] 내가 대출중인 도서 목록
    public ArrayList<MyRentBooksDto> getMyBooks(){
        return bd.getMyBooks();
    }
    // [5] 도서 등록
    public boolean addBook(String bookName, String writer){
        return bd.addBook(bookName, writer);
    }

}
