package part3;

public class Circle extends Shape {
    protected double radius;
    private final double PI = 3.14;

    public Circle(){

    }

    public Circle( double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled ){
        this.color = color;
        this.filled = filled;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return PI * this.radius * this.radius;
    }
    @Override
    public double getPerimeter(){
        return 2 * PI * this.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
