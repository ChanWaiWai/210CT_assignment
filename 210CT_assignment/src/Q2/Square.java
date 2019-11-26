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
public class Square extends Shape{
    Point topLeft;
    double width;
    
    public Square(double x, double y, double width){
        super("Square");
        topLeft = new Point(x, y);
        this.width = width;
    }
    
    public void setWidth(double width){
       this.width = width;
    }
    
    public double getWidth(){
        return width;
    }
    
    public void setTopLeft(Point TopLeft){
        this.topLeft = topLeft;
    }
    
    public Point getTopLeft(){
        return topLeft;
    };
    @Override
    public double getArea() {
        return width*width;
    }
    
    public String toString(){
        return name + ": TopLeft = " + topLeft + ", Width = " + width ;
    }
}
