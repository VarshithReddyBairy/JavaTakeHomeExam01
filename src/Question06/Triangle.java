/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question06;

/**
 *
 * @author S542263
 */
public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3, String color, boolean filled) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public boolean triangleFilled(){
        return super.isFilled();
    }
    @Override
    public double perimeter(){
        return side1 + side2 + side3 ;
    }
    @Override
    public double area(){
        double s = perimeter()/2.0;
       return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }

    @Override
    public String toString() {
        return "The area of triangle is : "+Math.round(area()*100)/100.0+"\n"+
               "The perimeter of triangle is : "+Math.round(perimeter()*100)/100.0+"\n"+
               "The color of the triangle is : "+super.getColor()+"\n"+
               "Triangle filled : "+triangleFilled();
    }
    
    
}
