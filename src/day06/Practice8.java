package day06;

import java.rmi.dgc.Lease;

public class Practice8 {

    public static void main(String[] args) {
        
        Printer print = new Printer();
        print.printMessage();
        
        Greeter gr = new Greeter();
        gr.greet("유재석");
        
        SimpleCalculator c = new SimpleCalculator();
        int result = c.add( 5, 7);
        System.out.println("결과: " + result);

        
        Checker check = new Checker();
        System.out.println("check is Even:" + check.isEven(5));
        
        Lamp lamp = new Lamp();
        lamp.turnOn(); System.out.println("lamp.isOn: " + lamp.isOn);
        lamp.turnOff(); System.out.println("lamp.isOn: " + lamp.isOn);
        
        Product product = new Product();
        product.sell(5);
        product.sell(12);
        
        Visualizer visual = new Visualizer();
        String result2 = visual.getStars(5);
        System.out.println("결과: " + result2);
        
        ParkingLot park = new ParkingLot();
        int result3 = park.calculateFee(430);
        System.out.println( "결과: " + result3 );
    }
}
