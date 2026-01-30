package 종합.과제2.view;

import 종합.과제2.controller.WaitingController;
import 종합.과제2.model.dto.WaitingDto;

import java.util.ArrayList;
import java.util.Scanner;

public class WaitingView {
    private WaitingView(){}
    private static final WaitingView instance = new WaitingView();
    public static WaitingView getInstance(){
        return instance;
    }
    private WaitingController wc = WaitingController.getInstance();

    private Scanner scan = new Scanner(System.in);

    public void indexView(){
        for(;;){
            System.out.println("==========맛집 대기 시스템==========");
            System.out.println("1.대기 등록|2.대기 현황");
            System.out.println("=================================");
            System.out.print("선택>"); int ch = scan.nextInt();

            if(ch == 1){ writeView(); }
            if(ch == 2){ printView(); }
        }
    }
    public void writeView(){
        scan.nextLine();
        System.out.print("전화번호: "); String phone = scan.nextLine();
        System.out.print("인원수: "); int count = scan.nextInt();

        boolean result = wc.addWaiting(phone, count);
        if( result ){ System.out.println("[안내]대기 등록 완료"); }
        else{ System.out.println("[경고]대기 등록 실패"); }
        System.out.println();
    }

    public void printView(){
        ArrayList<WaitingDto> waitingList = wc.getWaitingList();
        System.out.println("==========대기 현황============");
        for(WaitingDto waiting : waitingList ){
            System.out.printf("번호: %d|연락처: %s|인원: %d\n", waiting.getNo(), waiting.getPhone(), waiting.getCount());
        }
        System.out.println();
    }
}
