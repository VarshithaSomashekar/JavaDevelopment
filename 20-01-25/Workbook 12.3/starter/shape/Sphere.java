package shape;
public class Sphere extends Shape {

    public Sphere(double radius) {
        super(radius);
    }

    public double getArea(){
        return (4*3.14*this.getRadius()*this.getRadius());
    }

    public double getVolume(){
        return ((4/3)*3.14*this.getRadius()*this.getRadius()*this.getRadius());
    }

}