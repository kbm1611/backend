package day10;

public class Tool implements Testinterface{
    // 해당 인터페이스를 구현한다. <---오버라이딩 한다.
    public void method1(){
        System.out.println("해당 메소드를 구현");
    }
    public boolean method2(int a){
        System.out.println("해당메소드2 구현 완료");
        return a > 10;
    }
}
