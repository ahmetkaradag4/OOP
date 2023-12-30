
package LAB10;

public abstract class Shape3D extends Shape2D{
    private double depth;
    
    
    public void setDepth(double depth){
        this.depth = depth;
    }
    public double getDepth(){
        return depth;
    }
    // CONSTRUCTOR
    public Shape3D(double height, double width, double depth){
        super(height,width);
        this.depth = depth;
    }
    public Shape3D(double height, double radius){
        super(radius);
        this.setHeight(height);
    }
    
    abstract double getVolume();
    
    //
}
     
class Cylinder extends Shape3D{
    public Cylinder(double height, double radius){
        super(height,radius);
    }
    
    @Override
    public double getArea(){
        return 2*PI*getRadius()*getHeight() + 2*PI*(getRadius() * getRadius());
    }
    
    @Override
    public double getVolume(){
        return PI * (getRadius() * getRadius()) * getHeight();
    }
    
    @Override
    public String toString(){
        return "Area of CYLINDER is " + getArea() + " Volume of CYLINDER is " + getVolume();
    }
}

class Sphere extends Shape3D{
    public Sphere(int depth, double radius){
        super(0,radius);
        this.setDepth(depth);
    }
    
    @Override
    public double getArea(){
        return 4*PI*(getRadius() * getRadius());
    }
    
    @Override
    public double getVolume(){
        return (4.0/3.0) * PI * (getRadius() * getRadius() * getRadius());
    }
    
    @Override
    public String toString(){
        return "Area of SPHERE is " + getArea() + " Volume of SPHERE is " + getVolume();
    }
            
}


class Pyramid extends Shape3D{
    public Pyramid(int depth, int height, int width){
        super(height, width, depth);
    }
    
    @Override
    public double getVolume(){
        return (getHeight() * getWidth() * getDepth()) / 3.0;
    }
    
    
    @Override
    public double getArea(){
        return (0.5 * 2 * getDepth() * getWidth()) + (0.5 * 2 * getDepth() * getHeight()) + (getHeight() * getWidth());
    }
    
    @Override
    public String toString(){
        return "Area of PYRAMID is " + getArea() + " Volume of PYRAMID is " + getVolume();
    }

}

class Cone extends Shape3D{
    public Cone(double height, double radius){
        super(height, radius);
    }
    
    @Override
    public double getVolume(){
        return (PI * (getRadius() * getRadius() * getHeight())) / 3.0;
    }
    
    @Override
    public double getArea(){
        return (PI * getRadius()) * (getRadius() + getHeight());
    }
    
    @Override
    public String toString(){
        return "Area of CONE is " + getArea() + " Volume of CONE is " + getVolume();
    }
    
}