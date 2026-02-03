package 종합.과제3.view;

import 종합.과제3.controller.BookController;
import 종합.과제3.database.DB;
import 종합.과제3.model.dao.BookDao;
import 종합.과제3.model.dto.BookDto;
import 종합.과제3.model.dto.MyRentBooksDto;
import 종합.과제3.model.dto.UserDto;

import java.util.ArrayList;
import java.util.Scanner;

public class BookView {
    private BookView(){}
    private static final BookView instance = new BookView();
    public static BookView getInstance(){
        return instance;
    }
    BookController bc = BookController.getInstance();

    private Scanner scan = new Scanner(System.in);

    public void indexBookView(boolean isManager){
        for(;;){
            System.out.println("==========도서관리 시스템 메뉴==========");
            System.out.print("1.도서대출|2.도서반납|3.전체도서조회|4.내가대출중인도서");
            if(isManager == true){ System.out.println("|5.도서 등록 기능|6.로그아웃");  }
            else{ System.out.println("|5.로그아웃"); }
            System.out.println("====================================");
            System.out.print("선택>"); int ch = scan.nextInt();

            if(ch == 1){ rentBookView(); } // 도서대출
            else if(ch == 2){ returnBookView(); } // 도서반납
            else if(ch == 3){ getAllBooksView(); } // 전체도서조회
            else if(ch == 4){ getMyBooksView(); } // 내가 대출 중인 도서
            else if(isManager){
                if(ch == 5){ addBookView(); } //도서 등록 기능
                else if(ch == 6){ tologout(); return; } // 로그아웃
                else{ System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); }
            }else if(ch == 5){ tologout(); return; } //로그아웃
            else{ System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); }
        }
    }

    public void rentBookView(){
        scan.nextLine();
        System.out.println("---도서 대출---");
        System.out.print("대출할 도서 번호:"); int bid = scan.nextInt();
        boolean result = bc.rentBook(bid);
        if(result){System.out.println("[안내]도서 대출 성공!");}
        else{System.out.println("[경고]도서 대출 실패!");}
        System.out.println(); //한 줄 띄우기
    }
    public void returnBookView(){
        scan.nextLine();
        System.out.println("---도서 반납---");
        System.out.print("반납할 도서 번호:"); int bid = scan.nextInt();
        boolean result = bc.returnBook(bid);
        if(result){System.out.println("[안내]도서 반납 성공!");}
        else{System.out.println("[경고]도서 반납 실패!");}
        System.out.println(); //한 줄 띄우기
    }
    public void getAllBooksView(){
        ArrayList<BookDto> booklist = bc.getAllBooks();
        System.out.println("==========전체 도서 목록==========");
        for(BookDto book : booklist){
            String isRent = "";
            if(book.getStatus() == 0){
                isRent = "대출 가능";
            } else{
                String name = "";
                for(UserDto user : DB.users){
                    if(user.getUid() == book.getStatus()){
                        name = user.getNickname();
                        break;
                    }
                }
                isRent = "대출 중 (대여자: " + name + ")";
            }
            System.out.printf("도서 번호: %d |책 제목: %s |저자: %s |%s\n",book.getBid(), book.getBookName(), book.getWriter(), isRent);
        }
        System.out.println("================================");
        System.out.println(); //한 줄 띄우기
    }
    public void getMyBooksView(){
        ArrayList<MyRentBooksDto> mybooks = bc.getMyBooks();
        System.out.println("==========내가 대출한 도서 목록==========");
        for(MyRentBooksDto mybook : mybooks){
            System.out.printf("도서 번호: %d |책 제목: %s|저자: %s\n", mybook.getBid(), mybook.getBookName(), mybook.getWriter());
        }
        System.out.println("=====================================");
        System.out.println(); //한 줄 띄우기
    }
    public void addBookView(){
        scan.nextLine();
        System.out.println("---도서 등록---");
        System.out.print("도서명:"); String bookName = scan.nextLine();
        System.out.print("저자:"); String writer = scan.nextLine();
        boolean result = bc.addBook(bookName, writer);
        if(result){System.out.println("[안내]도서 등록 성공!");}
        else{System.out.println("[경고]도서 등록 실패!");}
        System.out.println(); //한 줄 띄우기
    }
    public void tologout(){
        UserView.getInstance().logoutView();
    }


}
