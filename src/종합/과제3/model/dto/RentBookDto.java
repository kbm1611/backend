package 종합.과제3.model.dto;

public class RentBookDto {
    int rid;
    int uid;
    int bid;

    public RentBookDto(){}

    public RentBookDto(int rid, int uid, int bid){
        this.rid = rid;
        this.uid = uid;
        this.bid = bid;

    }
    public int getRid() {
        return rid;
    }
    public int getUid() {
        return uid;
    }

    public int getBid() {
        return bid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }
    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }


    @Override
    public String toString() {
        return "RentBookDto{" +
                "uid=" + uid +
                ", bid=" + bid +
                '}';
    }
}
