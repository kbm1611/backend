package 종합.과제3.model.dto;

public class UserDto {
    int uid;
    String id;
    String pw;
    String nickname;
    boolean isManager;

    public UserDto(){}
    public UserDto(int uid, String id, String pw, String nickname, boolean isManager){
        this.uid = uid;
        this.id = id;
        this.pw = pw;
        this.nickname = nickname;
        this.isManager = isManager;
    }

    public int getUid() {
        return uid;
    }

    public String getId() {
        return id;
    }

    public String getPw() {
        return pw;
    }

    public String getNickname() {
        return nickname;
    }

    public boolean isManager() {
        return isManager;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setManager(boolean manager) {
        isManager = manager;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "uid=" + uid +
                ", id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", nickname='" + nickname + '\'' +
                ", isManager=" + isManager +
                '}';
    }
}
