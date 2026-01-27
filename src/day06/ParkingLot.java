package day06;

public class ParkingLot {

    int calculateFee(int time){
        int money = 0;
        if( time <= 30){
            return 1000;
        }else{
            money = 1000 + ( 500 * (int)((time - 30)/10));
            if(money > 20000){
                return 20000;
            }else {
                return money;
            }
        }
    }
}
