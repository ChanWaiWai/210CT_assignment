/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q2;

/**
 *
 * @author chan_
 */
public class Circle extends Shape{
    Point center;
    double radius;

    public Circle(double x, double y, double radius) {
        super("Circle");
        this.center = new Point(x, y);
        this.radius = radius;
    }
    
    public void setCenter(Point center){
        this.center = center;
    }
    
    public Point getCenter(){
        return center;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public double getRadius(){
        return radius;
    }
    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }
    
    public String toString(){
        return name + ": Center = " + center + "; Radius = " +radius;
    }
}
