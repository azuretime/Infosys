package com.example.W1;

/**
 * Created by Jiang Jinjing on 2017/9/18.
 */

public class MyRectangle2D {
    double x;
    double y;
    double width;
    double height;

    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public double getWidth() {
        return width;
    }

    MyRectangle2D() {x=0; y=0; height=1; width=1;}
    MyRectangle2D(double x,double y,double width,double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    double getArea(){
        return width * height;
    }
    double getPerimeter(){
        return (width + height)*2;
    }

    public boolean contains(double x, double y){

        return Math.abs(x-this.x) <= width / 2 && Math.abs(y-this.y)<= height / 2;

    }


    public boolean contains(MyRectangle2D r){

        return contains(r.x - r.width / 2, r.y + r.height / 2)&&

                contains(r.x - r.width / 2, r.y - r.height / 2) &&

                contains(r.x + r.width / 2, r.y + r.height / 2) &&

                contains(r.x + r.width / 2, r.y - r.height / 2);

    }


    public boolean overlaps (MyRectangle2D r) {
        return x < r.x + r.width && x + width > r.x && y < r.y + r.height && y + height > r.y;
    }


    public static void main(String[] args)
    {
        MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.0, 5.0);
        System.out.println("Area is " + r1.getArea());
        System.out.println("Perimeter is " + r1.getPerimeter());
        System.out.println(r1.contains(3, 3));
        System.out.println(r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)));
        System.out.println(r1.overlaps(new MyRectangle2D(3, 5, 2.3, 6.7)));
        MyRectangle2D a = new MyRectangle2D();
        System.out.println(a.getX());
        MyRectangle2D b = new MyRectangle2D(1, 2, 3, 4);
        System.out.println(b.getWidth());
        MyRectangle2D c = new MyRectangle2D(1, 2, 3, 4);
        System.out.println(c.getArea());
    }

}
