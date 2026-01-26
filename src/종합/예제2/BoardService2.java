package 종합.예제2;

import java.util.Scanner;

public class BoardService2 {

    public static void main(String[] args) {

        String[] contents = new String[100];
        String[] writers = new String[100];
        //[2] 반복문 , 무한루프
        for( ; ; ){
            System.out.println("====== My Community ======");
            System.out.println("1게시물쓰기 2.게시물출력");
            System.out.println("==========================");
            System.out.print("선택>");
            Scanner scan = new Scanner(System.in);
            int ch = scan.nextInt();
            //[5] 제어문, 코드 흐름 제어( 논리적인 사고, 경우의 수 등)
            if( ch == 1 ){
                scan.nextLine(); // .nextLine() 앞에 다른 next 존재하면 하나로 인식
                System.out.print("내용 : " );   String content = scan.nextLine();
                System.out.print("작성자 : ");   String writer = scan.nextLine();

                for(int index = 0; index <= contents.length-1; index++){
                    if( contents[index] == null && writers[index] == null){
                        contents[index] = content; writers[index] = writer;
                        System.out.println("[안내] 글쓰기 성공");
                        System.out.println();
                        break;
                    } else{
                        System.out.println("[경고] 게시물 등록할 공간이 없습니다.");
                    }
                }
            }else if(ch == 2){
                for(int index = 0; index<= contents.length-1; index++){
                    if(contents[index] == null){
                        continue;
                    }else{
                        System.out.printf("작성자 : %s\n내용 : %s\n", writers[index], contents[index]);
                        System.out.println("---------------------------------------");
                    }
                    System.out.println();
                }
            }
        }
    }
}
