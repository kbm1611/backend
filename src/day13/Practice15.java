package day13;

import day07.package1.B;

import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Practice15 {
    public static void main(String[] args) {
        //문제1
        BookDto bookDto = new BookDto();
        BoardDto boardDto = new BoardDto();

        System.out.println(bookDto + "|" + boardDto);

        //문제2
        String str1 = new String("유재석");
        String str2 = new String("유재석");
        System.out.println("==비교:" + str1 == str2 + "equals 비교:" + str1.equals(str2));

        //문제3
        String str3 = new String();
        Class c1 = str3.getClass();
        String str4;
        try {
            Class.forName("java.lang.String");
            str4 = "forName 성공";
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        Method[] method = c1.getMethods();
        int methodcount = 0;
        for(Method met : method){
            methodcount++;
        }
        System.out.println(c1 + "|" + str4 + "|" + "method count:" + methodcount);

        //문제4
        int val1 = Integer.parseInt("100");
        double val2 = Double.parseDouble("3.14");
        String str5 = 100+"";
        String str6 = String.valueOf(100);

        System.out.println("int:"+val1+", double:"+val2+", str1: \"" + str5 + "\", str2:\""+str6+"\"");

        //문제5
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 hh:mm:ss");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'hh:mm:ss");
        String today = localDateTime.format( formatter );
        LocalDateTime dateTime1 = localDateTime.plusDays( 10 );
        String today2 = dateTime1.format( formatter2 );
        LocalDateTime dateTime2 = localDateTime.minusDays( 30 );
        String today3 = dateTime2.format( formatter2 );
        System.out.println("현재:"+today+"|+10일:"+ today2 + "|-30일:" + today3);

    }
}
