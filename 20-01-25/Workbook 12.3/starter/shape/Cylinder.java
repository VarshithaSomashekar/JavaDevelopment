package shape;

public class Cylinder extends Shape {

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return ((2*3.14*this.getRadius()*this.getRadius()) + (2*3.14*this.getRadius()*height));
    }

    public double getVolume(){
        return (3.14*this.getRadius()*this.getRadius()*height);
    }
  
}
  