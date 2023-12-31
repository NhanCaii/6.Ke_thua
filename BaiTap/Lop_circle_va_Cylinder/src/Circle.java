public class Circle {
    private double radius=1;
    private String color="red";

    public Circle(double radius, String color){
        this.radius=radius;
        this.color=color;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public double area(double radius){
        return radius*radius*Math.PI;
    }

    @Override
    public String toString(){
        return "circle radius: "+ getRadius()+", color:"+getColor()+" and area: "+area(radius);
    }
}
