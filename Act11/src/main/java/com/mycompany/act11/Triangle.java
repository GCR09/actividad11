package com.mycompany.act11;

/**
 *
 * @author Cortez Ramos
 */
public class Triangle extends Shape{
    private double sideLength;   
    private double heightLength; 

    public Triangle(double sideLength) {
        this.sideLength = sideLength;
        this.heightLength = calculateHeightLength();
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
        this.heightLength = calculateHeightLength();
    }

    public double getSideLength() {
        return sideLength;
    }

    public double getHeightLength() {
        return heightLength;
    }

    @Override
    public double getArea() {
        return (sideLength * heightLength) / 2.0;
    }

    @Override
    public double getPerimeter() {
        return sideLength * 3.0;
    }

    private double calculateHeightLength() {
        return (Math.sqrt(3.0) * this.sideLength) / 2.0;
    }
}
