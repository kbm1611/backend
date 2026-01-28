package day07.practice9;

public class Rectangle {
    int width;
    int height;

    Rectangle(){
        width = 0;
        height = 0;
    }

    Rectangle(int w, int h){
        width = w;
        height = h;
    }

    int getArea(int w, int h){
        return w * h;
    }
}
