package day07.practice10;

import java.util.Scanner;
import java.util.Timer;

public class Practice10 {
    public static void main(String[] args) {

        Member member = new Member();
        member.setId("admin");
        System.out.println(member.getId());

        Score score = new Score();
        score.setScore(85);
        score.setScore(120);

        BankAccount bank = new BankAccount("123-456");
        System.out.println(bank.getAccountNumber());

        CircleCalulator circle = new CircleCalulator();
        System.out.println("반지름 넓이:" + circle.printCircleArea(5));

        TicketMachine machine1 = new TicketMachine();
        machine1.issueTicket(); machine1.issueTicket();
        TicketMachine machine2 = new TicketMachine();
        machine2.issueTicket();
        TicketMachine machine3 = new TicketMachine();

        TicketMachine.printTotalTickets();

        GameConfig gameconfig = new GameConfig();
        System.out.println("MAX_LEVEL:" + GameConfig.MAX_LEVEL);
        System.out.println("MAX_HP:" + GameConfig.MAX_HP);
        System.out.println("GAME_TITLE:" + GameConfig.GAME_TITLE);

    }
}
