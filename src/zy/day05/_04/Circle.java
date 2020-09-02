package zy.day05._04;

public class Circle {
    private int r;

    public Circle() {

    }

    public Circle(int r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public void showArea() {
        System.out.println("半径为:" + r + ",面积为:" + (r * r * 3.14));
    }

    public void showPerimeter() {
        System.out.println("半径为:" + r + ",周长为:" + (2 * r * 3.14));
    }
}
