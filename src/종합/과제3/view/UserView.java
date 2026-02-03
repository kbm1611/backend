package 종합.과제3.view;

import 종합.과제3.controller.UserController;
import 종합.과제3.database.DB;
import 종합.과제3.model.dto.UserDto;

import java.util.Scanner;

public class UserView{
    private UserView(){}
    private static final UserView instance = new UserView();
    public static UserView getInstance(){
        return instance;
    }
    UserController uc = UserController.getInstance();
    
    private Scanner scan = new Scanner(System.in);

    public void indexUserView(){
        for(;;){
            System.out.println("==========도서관리 시스템==========");
            System.out.println("1.회원가입|2.로그인");
            System.out.println("===============================");
            System.out.print("선택>"); int ch = scan.nextInt();

            if(ch == 1){ signUp(); } // 회원가입화면 출력
            else if(ch == 2){ login(); } // 로그인화면 출력
            else{ System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); }
        }
    }

    public void signUp(){ //회원가입
        scan.nextLine();
        System.out.println("---회원가입---");
        System.out.print("아이디:"); String id = scan.nextLine();
        System.out.print("비밀번호:"); String pw = scan.nextLine();
        System.out.print("닉네임:"); String nickname = scan.nextLine();
        System.out.print("관리자(true/false):"); boolean isManager = scan.nextBoolean();

        boolean result = uc.signUp(id, pw, nickname, isManager);
        if(result){ System.out.println("[안내]회원가입 성공!"); }
        else{ System.out.println("[경고]회원가입 실패! 아이디나 닉네임을 확인하세요."); }
        System.out.println(); //한 줄 띄우기
    }

    public void login(){ //로그인
        scan.nextLine();
        System.out.println("---로그인---");
        System.out.print("아이디:"); String id = scan.nextLine();
        System.out.print("비밀번호:"); String pw = scan.nextLine();

        boolean result = uc.login(id, pw);
        if( result){
            for(UserDto user : DB.users){
                if(user.getId().equals(id) && user.getPw().equals(pw)){
                    if(user.isManager()){
                        System.out.printf("%s 관리자님 환영합니다.\n", user.getNickname());
                        BookView.getInstance().indexBookView(true);
                    } else{
                        System.out.printf("%s 회원님 환영합니다.\n", user.getNickname());
                        BookView.getInstance().indexBookView(false);
                    }
                }
            }
        }else{
            System.out.println("[경고]로그인 실패!");
        }
        System.out.println(); //한 줄 띄우기
    }
    public void logoutView(){
        System.out.println("[안내]로그아웃 되었습니다.");
        System.out.println(); //한 줄 띄움
        uc.logout();
        indexUserView();
    }
}
