/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q2;

import Q1.*;

/**
 *
 * @author chan_
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circle circle;
        Square square;
        
        circle = new Circle(22, 8, 3.5);
        square = new Square(7.5, 2, 18);
        
        System.out.print(circle.toString());
        System.out.println("; Area = " + circle.getArea());
        System.out.print(square.toString());
        System.out.println("; Area = " + square.getArea());
    }
    
}
