package day10;

public interface Testinterface {
    // int a ; // *멤버변수 불가능
    public static final int b = 10; // 상수는 가능
    // * 생성자 불가능
    // * 추상메소드 : 메소드 선언부만 존재, { } 구현부 없는
    public abstract void method1();
    boolean method2(int a);
}
