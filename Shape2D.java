
package LAB10;


public abstract class Shape2D {
    protected final static double PI = 3.14159;
    private double height;
    private double radius;
    private double width;
    
     public void setHeight(double height){
        this.height = height;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public void setWidth(double width){
        this.width = width;
    }
    
    public double getHeight(){
        return height;
    }
    public double getRadius(){
        return radius;
    }
    public double getWidth(){
        return width;
    }  
    
    public Shape2D(double height, double width){
        this.height = height;
        this.width = width;
    }
    
    public Shape2D(double radius){
        this.radius = radius;
    }
    
    public abstract double getArea();
    
    @Override
    public abstract String toString();
}

class Circle extends Shape2D{
    public Circle(double radius){
        super(radius);
    }
    
    @Override
    public double getArea(){
        return PI * getRadius() * getRadius();
    }
    
    @Override
    public String toString(){
        return "Area of CIRCLE is " + getArea();
    }
}


class Square extends Shape2D{
    public Square(double width){
        super(width);
    }
    
    @Override
    public double getArea(){
        return (getWidth() * getWidth());
    }
    
    @Override
    public String toString(){
        return "Area of SQUARE is " + getArea();
    }
    
}


class Rectangle extends Shape2D{
    public Rectangle(double height, double width){
        super(height,width);
    }
    @Override
    public double getArea(){
        return getWidth() * getHeight();
    }
    
    @Override
    public String toString(){
        return "Area of RECTANGLE is " + getArea();

    }
}


