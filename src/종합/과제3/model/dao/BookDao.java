package 종합.과제3.model.dao;

import day07.package1.B;
import 종합.과제3.controller.UserController;
import 종합.과제3.database.DB;
import 종합.과제3.model.dto.BookDto;
import 종합.과제3.model.dto.MyRentBooksDto;
import 종합.과제3.model.dto.RentBookDto;

import java.util.ArrayList;

public class BookDao {
    private BookDao(){}
    private static final BookDao instance = new BookDao();
    public static BookDao getInstance(){
        return instance;
    }

    public boolean rentBook(int bid){//도서 대출

        RentBookDto rentbook = new RentBookDto(++DB.currentRid, UserController.getInstance().getLoginSession(), bid);
        boolean result = DB.rentbooklist.add(rentbook);
        if(result){
            //해당하는 북의 상태 변경 대출 가능 -> 대출 중
            for(BookDto book : DB.books){
                if(book.getBid() == bid){
                    book.setStatus(UserController.getInstance().getLoginSession()); // 대출번호를 현재 대출자로 바꿈
                    break;
                }
            }
            return true;
        }
        else{ return false; }
    }

    public boolean returnBook(int bid) { //도서 반납
        for (RentBookDto rentbook : DB.rentbooklist) {
            if(rentbook.getUid() == UserController.getInstance().getLoginSession() && rentbook.getBid() == bid){
                DB.rentbooklist.remove(rentbook);
                for (BookDto book : DB.books) {
                    if (book.getBid() == bid) { //도서번호가 같다면
                        //대출 중 -> 대출 가능으로
                        book.setStatus(0);
                        break;
                    }
                }
                return true;
            }
        }
        return false; //삭제 실패
    }
    public ArrayList<BookDto> getAllBooks(){ //전체도서조회
        return new ArrayList<>(DB.books); // 복사본 반환
    }

    public ArrayList<MyRentBooksDto> getMyBooks(){//내가 대출중인 도서 목록

        ArrayList<MyRentBooksDto> MRB = new ArrayList<>();
        for(RentBookDto rentbook : DB.rentbooklist){
            if(rentbook.getUid() == UserController.getInstance().getLoginSession()){
                for(BookDto book : DB.books){
                    if(rentbook.getBid() == book.getBid()){
                        MyRentBooksDto mbook = new MyRentBooksDto(book.getBid(), book.getBookName(), book.getWriter());
                        MRB.add(mbook);
                    }
                }
            }
        }
        return MRB;
    }

    public boolean addBook(String bookName, String writer){ // 도서 등록
        BookDto book = new BookDto(++DB.currentbid, bookName, writer, 0);
        return DB.books.add(book);
    }
}
