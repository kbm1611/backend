package day11.Practice12;

import day07.package1.A;

import javax.crypto.Mac;

public class Practice12 {
    public static void main(String[] args) {
        //문제1
        Student std = new Student();
        std.name = "이건";
        std.studentId = 10;
        System.out.println(std.name); System.out.println(std.studentId);

        //문제2
        Cat cat = new Cat();
        cat.makeSound();

        //문제3
        Computer computer = new Computer();

        //문제4
        Triangle triangle = new Triangle();
        triangle.num = 10; //상속을 받으면 자식 클래스 쪽에서 부모클래스에서 선언한 변수나 메소드를 사용 가능하기 떄문에.

        //문제5
        Shape shape = new Shape();
        shape.draw(); // 도형을 그립니다가 출력되고 이유는 상속에서 부모클래스가 자식클래스에 있는 변수나 메소드를 사용할 수 없다.

        //문제6
        Vehicle vehicle = new Vehicle();
        if( vehicle instanceof Bus){ // 부모 - Vehicle / 자식 - Bus 관계에서는 false!
            ((Bus) vehicle).checkFare(); //실행안됨
        }

        //문제7
        Beverage[] beverages = {new Coke(), new Coffee()};

        for(int i = 0; i <= beverages.length-1; i++){
            beverages[i].drink();
        }

        //문제8
        Sword sword = new Sword();
        Gun gun = new Gun();

        new Character().use(sword);
        new Character().use(gun);

        //문제9
        SuperClass obj = new SubClass();
        System.out.println( obj.name );
        obj.method();
        /* 둘이 다른 결과가 나오는 이유: obj 자체는 SuperClass타입으로 만들어졌기 때문에 SuperClass의 name을 따라가고
        method는 SubClass로 생성하면서 오버라이딩이 되었기 때문에 SubClass의 메소드가 나온다. 변수와 메소드의 차이, 다형성의 특징
         */


        //문제10
        Laptop laptop = new Laptop();
        System.out.println(laptop instanceof Electronic); // Object -> Electronic -> laptop
        System.out.println(laptop instanceof Device); // Object -> Devie -> Electronic -> laptop
        //둘다 부모쪽 클래스이므로 형 변환이 가능하다.

    }
}
//문제1 클래스 정의
class Person{
    String name;
}
class Student extends Person{
    int studentId;
}

//문제2 클래스 정의
class Animal{
    void makeSound(){};
}
class Cat extends Animal{
    void makeSound(){
        System.out.println("고양이가 야옹하고 웁니다.");
    }
}
//문제3 클래스 정의
class Machine{
    Machine(){
        System.out.println("부모 클래스 생성자 실행");
    }
}
class Computer extends Machine{
    Computer(){
        System.out.println("자식 클래스 생성자 실행");
    }
}

//문제4 클래스 정의
class Figure{
    int num;
}
class Triangle extends Figure{
}

//문제5 클래스 정의
class Shape{
    void draw(){
        System.out.println("도형을 그립니다.");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("원을 그립니다.");
    }
}

//문제6 클래스 정의
class Vehicle{

}
class Bus extends Vehicle{
    void checkFare(){
        System.out.println("요금을 확인합니다.");
    }
}

//문제7 클래스 정의
class Beverage {
    void drink(){
        System.out.println("음료를 마십니다.");
    }
}
class Coke extends Beverage{
    void drink(){
        System.out.println("콜라를 마십니다.");
    }
}
class Coffee extends Beverage{
    void drink(){
        System.out.println("커피를 마십니다.");
    }
}

//문제8 클래스 정의
class Weapon{
    void attack(){
        System.out.println("무기로 공격합니다.");
    }
}
class Sword extends Weapon{
    void attack(){
        System.out.println("검으로 공격합니다.");
    }
}
class Gun extends Weapon{
    void attack(){
        System.out.println("총으로 공격합니다.");
    }
}
class Character{
    Weapon weapon;
    void use(Weapon weapon){
        weapon.attack();
    }
}

//문제9 클래스 정의
class SuperClass{
    String name = "상위";
    void method(){
        System.out.println("상위 메소드");
    }
}
class SubClass extends SuperClass{
    String name = "하위";
    void method(){
        System.out.println("하위 메소드");
    }
}

//문제10 클래스 정의
class Device{

}
class Electronic extends Device{

}
class Laptop extends Electronic{

}









