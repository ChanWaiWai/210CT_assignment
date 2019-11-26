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
public class Point {
    public double x;
    public double y;
    
    public Point(double a, double b){
        setPoint(a, b);
    }

    private void setPoint(double a, double b) {
        x = a;
        y = b;
    }
    
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
    
    public String toString(){
        return "[ " + x + " , " + y + " ]";
    }
}
