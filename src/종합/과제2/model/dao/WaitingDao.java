package 종합.과제2.model.dao;

import 종합.과제2.model.dto.WaitingDto;

import java.util.ArrayList;

public class WaitingDao {
    private WaitingDao(){}
    private static final WaitingDao instance = new WaitingDao();
    public static WaitingDao getInstance(){
        return instance;
    }
    private ArrayList<WaitingDto> waitingList = new ArrayList<>();

    private static int currentNo = 1;
    public boolean addWaiting(String phone, int count){
        WaitingDto wait = new WaitingDto(currentNo, phone, count);

        boolean result = waitingList.add( wait );
        currentNo++;

        return result;
    }
    public ArrayList<WaitingDto> getWaitingList(){
        return waitingList;
    }

}
