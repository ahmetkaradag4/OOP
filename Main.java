/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB10;

/**
 *
 * @author rmb
 */
public class Main {
    public static void main(String[] args){
        
        Shape2D circle = new Circle(5);
        Shape2D square = new Square(12);
        Shape2D rectangle = new Rectangle(4,10);
        
        Shape2D cylinder = new Cylinder(5,4);
        Shape2D sphere = new Sphere(6,8);
        Shape2D pyramid = new Pyramid(6,8,10);
        Shape2D cone = new Cone(4,4);
        
        System.out.println(circle.toString());
        System.out.println(square.toString());
        System.out.println(rectangle.toString());
        System.out.println(cylinder.toString());
        System.out.println(sphere.toString());
        System.out.println(pyramid.toString());
        System.out.println(cone.toString());
        
    }
}
