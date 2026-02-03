package 종합.과제3.model.dao;

import 종합.과제3.database.DB;
import 종합.과제3.model.dto.UserDto;

public class UserDao {
    private UserDao(){}
    private static final UserDao instance = new UserDao();
    public static UserDao getInstance(){
        return instance;
    }

    public boolean signUp(String id, String pw, String nickname, boolean isManager){
        UserDto user = new UserDto(++DB.currentUid, id, pw, nickname, isManager);
        boolean result = DB.users.add(user);
        return result;
    }

    public int login(String id, String pw){
        for(UserDto user : DB.users){
            if(user.getId().equals(id) && user.getPw().equals(pw)){
                    return user.getUid(); //해당하는 아이디 넘김
            }
        }
        return -1; //로그인 실패 값 리턴
    }
}
