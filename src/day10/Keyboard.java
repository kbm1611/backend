package day10;

public interface Keyboard {
    // 상수 , public static final 생략가능
    public static final String  Manufaturer = "인텔";
    String ManuDate = "2026-02-24";

    // 추상메소드, public abstact 생략가능
    public abstract void aKey();
    int bKey(int x , int y);
}
