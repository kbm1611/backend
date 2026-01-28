package day07.practice10;

public class TicketMachine {
    static  int totalTickets = 0;

    void issueTicket(){
        totalTickets++;
        System.out.println("티켓1장을 발권했습니다.");
    }

    static void printTotalTickets(){
        System.out.println("총 발급된 티켓 수:" + totalTickets);
    }
}
