public class Cylinder extends Circle{
    private double height;

    public Cylinder(double radius, String color, double height){
        super(radius,color);
        this.height=height;
    }


    public double area(double radius, double height){
        return 2*radius*Math.PI*(height+radius);
    }
    public double volume(double radius, double height){
        return radius*radius*Math.PI*height;
    }
}
