/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question03;

/**
 *
 * @author S542263
 */
public class Circle {
    
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double area(){
        return Math.round(Math.PI * radius *radius*100)/100.0;
    }

    @Override
    public String toString() {
        return "The area of circle of radius "+radius+" cm is "+ area()+" cm\u00b2";
    }
    
    
    
}
