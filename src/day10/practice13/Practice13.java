package day10.practice13;

import javax.xml.crypto.Data;

public class Practice13 {
    public static void main(String[] args) {
        //문제1
        Cat cat = new Cat();
        Dog dog = new Dog();
        Soundable soundable = cat;
        soundable.makeSound();
        soundable = dog;
        soundable.makeSound();

        //문제2
        System.out.println(RemoteControl.MAX_VOLUME);
        System.out.println(RemoteControl.MIN_VOLUME);

        //문제3
        Runnable runner = new Person();
        runner.run();
        runner = new Car();
        runner.run();

        //문제4
        Sword sword = new Sword();
        Gun gun = new Gun();
        new Character().useWeapon(sword);
        new Character().useWeapon(gun);

        //문제5
        Flyable flyable = new Duck();
        Swimmable swimmable = new Duck();
        flyable.fly();
        swimmable.swimmable();

        //문제6
        Object duck2 = new Duck();
        if(duck2 instanceof Flyable){
            Flyable fly = (Flyable)duck2;
            fly.fly();
        }
        if(duck2 instanceof Swimmable){
            Swimmable swim = (Swimmable)duck2;
            swim.swimmable();
        }

        //문제7
        DataAccessObject dao = new OracleDao();
        dao.save();
        dao = new MySqlDao();
        dao.save();

        //문제8
        Greeting greeting = new Greeting() {
            @Override
            public void welcome() {
                System.out.println("환영합니다.");
            }
        };
        greeting.welcome();

        //문제9
        Television television = new Television();
        television.turnOff();
        television.turnOn();
        television.setMute(true);

        //문제10
        System.out.println( Calculator.plus(10, 20) );
    }
}
//문제1 클래스, 인터페이스 정의
interface Soundable{
    public abstract void makeSound();
}
class Cat implements Soundable{
    public void makeSound(){
        System.out.println("야옹");
    }
}
class Dog implements Soundable{
    public void makeSound(){
        System.out.println("멍멍");
    }
}

//문제2 클래스, 인터페이스 정의
interface RemoteControl{
    public static final int MAX_VOLUME = 10;
    public static final int MIN_VOLUME = 0;
}

//문제3 클래스, 인터페이스 정의
interface Runnable{
    void run();
}
class Person implements Runnable{
    public void run(){
        System.out.println("사람이 달립니다.");
    }
}
class Car implements Runnable{
    public void run(){
        System.out.println("자동차가 달립니다.");
    }
}

//문제4 클래스, 인터페이스 정의
interface Attackable{
    void attack();
}
class Sword implements Attackable{
    public void attack(){
        System.out.println("검으로 공격!");
    }
}
class Gun implements Attackable{
    public void attack(){
        System.out.println("총으로 공격!");
    }
}
class Character{
    void useWeapon(Attackable weapon){
        weapon.attack();
    }
}
//문제5 클래스, 인터페이스 정의
interface Flyable{
    void fly();
}
interface Swimmable{
    void swimmable();
}
class Duck implements Flyable, Swimmable{
    @Override
    public void fly() {
        System.out.println("하늘을 납니다.");
    }

    @Override
    public void swimmable() {
        System.out.println("물에서 헤엄칩니다.");
    }
}

//문제6 클래스, 인터페이스 정의 -> 문제 5번 활용

//문제7 클래스, 인터페이스 정의
interface DataAccessObject{
    void save();
}
class OracleDao implements DataAccessObject{
    public void save(){
        System.out.println("Oracle DB에 저장");
    }
}
class MySqlDao implements DataAccessObject{
    public void save(){
        System.out.println("MySQL DB에 저장");
    }
}

//문제8 클래스, 인터페이스 정의
interface Greeting{
    void welcome();
}

//문제9 클래스, 인터페이스 정의
interface Device{
    void turnOn();
    void turnOff();
    public default void setMute(boolean mute){
        System.out.println("무음 처리합니다.");
    }
}
class Television implements Device{
    public void turnOn(){
        System.out.println("텔레비전을 킵니다.");
    }
    public void turnOff(){
        System.out.println("텔레비전을 끕니다.");
    }
}

//문제10 클래스, 인터페이스 정의
interface Calculator{
    public static int plus(int x, int y){ return x + y; }
}
