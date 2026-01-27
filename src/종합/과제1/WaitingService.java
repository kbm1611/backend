package 종합.과제1;

import java.util.Scanner;

public class WaitingService {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        WaitingController wc = new WaitingController();

        for( ; ; ){
            System.out.println("==========맛집 대기 시스템==========");
            System.out.println("1.대기 등록|2.대기 현황");
            System.out.println("=================================");
            System.out.print("선택>"); int ch = scan.nextInt();

            if( ch == 1){
                scan.nextLine();
                System.out.print("전화번호:"); String phone = scan.nextLine();
                System.out.print("인원수:"); int count = scan.nextInt();

                boolean result = wc.addWaiting(phone, count);
                if(result) {System.out.println("[안내] 대기 등록이 완료되었습니다."); }
                    else { System.out.println("[경고] 대기 등록할 공간이 없습니다."); }
            }else if( ch == 2){
                Waiting[] waitings = wc.getWaitingList();
                System.out.println("==========대기 현황==========");
                for(int index = 0; index <= waitings.length-1; index++){
                    if(waitings[index] != null){
                        System.out.printf("%d.연락처:%s-인원:%d명\n", index+1, waitings[index].phone, waitings[index].count);
                        System.out.println("---------------------------");
                    }
                }
            }
        }
    }
}
