package shape;

public class Cylinder extends Shape {

    private double height;

    public Cylinder(Double height , Double radius){
        super(radius);
        this.height = height;

    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
  
}
  