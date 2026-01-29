package day07.package1;

public class A {
    public int 공개변수;
    private int 비공개변수;
    int 일반변수; //default 키워드 생성
    public  void 메소드(){
        System.out.println("공개변수 = " +공개변수);
        System.out.println("비공개변수 = " +비공개변수);
        System.out.println("일반변수 = " +일반변수);
    }
    private void 비공개메소드(){
        System.out.println("A.비공개메소드"); // soutm
    }
}
