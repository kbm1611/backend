package day08;

import day07.package1.A;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Scanner;

public class practice11 {
    public static void main(String[] args) {
        //문제1
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("유재석");
        nameList.add("강호동");
        nameList.add("신동엽");
        System.out.println("nameList = " + nameList);

        //문제2
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("사과"); fruits.add("바나나"); fruits.add("딸기");
        for (int index = 0; index <= fruits.size()-1; index++){
            System.out.printf("인덱스 %d: %s\n", index, fruits.get(index));
        }

        //문제3
        for( String fruit : fruits){
            System.out.println("fruit: " +fruit);
        }

        // 문제4
        ArrayList<Character> AlphaList = new ArrayList<>();
        AlphaList.add('A'); AlphaList.add('B'); AlphaList.add('C'); AlphaList.add('D'); AlphaList.add('E');
        AlphaList.remove(2);
        System.out.println("AlphaList = " + AlphaList);

        //문제5
        ArrayList<String> languages = new ArrayList<>();
        languages.add("자바"); languages.add("파이썬"); languages.add("C++");
        languages.add(1, "자바스크립트");
        System.out.println("languages = " + languages);

        //문세6
        ArrayList<Book> library = new ArrayList<>();
        Book book1 = new Book("이것이 자바다", "장용권");
        Book book2 = new Book("이것이 C언어다", "이세희");
        Book book3 = new Book("이것은 음식이다", "이건우");

        library.add(book1);
        library.add(book2);
        library.add(book3);

        for( Book book : library){
            System.out.printf("책 제목: %s, 저자: %s\n", book.title, book.author);
        }

        //문제7
        ArrayList<String> strList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        for(; ;){
            System.out.print("입력(종료 입력 시 종료):");
            String str = scan.next();
            if(str.equals("종료")) break;
            else{
                strList.add(str);
            }
        }
        System.out.println("strList = " + strList);

        //문제8
        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("국어"); subjects.add("수학"); subjects.add("사회"); subjects.add("과학");
        subjects.set(1, "영어");
        System.out.println("subjects = " + subjects);

    }
}
