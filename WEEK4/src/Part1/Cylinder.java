package Part1;

public class Cylinder extends  Circle {
    private double height = 1;

    public Cylinder(){

    }

    public Cylinder(double radius){
        this.setRadius(radius);
    }

    public Cylinder(double radius, double height){
        this.setRadius(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color){
        this.setRadius(radius);
        this.height = height;
        this.setColor(color);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                super.toString() +
                "height=" + height +
                '}';
    }

    @Override
    public double getArea(){
        return PI * this.getRadius() * this.getRadius() * this.height;
    }
}
