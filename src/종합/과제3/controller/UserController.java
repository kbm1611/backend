package 종합.과제3.controller;

import 종합.과제3.database.DB;
import 종합.과제3.model.dao.UserDao;
import 종합.과제3.model.dto.UserDto;

public class UserController {
    private UserController(){}
    private static final UserController instance = new UserController();
    public static UserController getInstance(){
        return instance;
    }
    UserDao ud = UserDao.getInstance();

    //[1]로그인 세션
    private int loginSession = 0;
    public int getLoginSession(){ return loginSession; }

    public boolean signUp(String id, String pw, String nickname, boolean isManager){
        for(UserDto user : DB.users){
            if(user.getId().equals(id)){
                return false; //중복 id 방지
            }else if(user.getNickname().equals(nickname)){
                return false; //중복 닉네임 방지
            }
        }
        boolean result = ud.signUp(id, pw, nickname, isManager);
        return result;
    }

    public boolean login(String id, String pw){
        int result = ud.login(id, pw);
        if( result != -1){
            loginSession = result; return true; //로그인 정보 로그인세션에 저장
        }
        return false;
    }

    public boolean logout(){
        loginSession = 0;
        return true;
    }

}
