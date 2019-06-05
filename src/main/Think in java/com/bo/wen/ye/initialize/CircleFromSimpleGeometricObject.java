package com.bo.wen.ye.initialize;

public class CircleFromSimpleGeometricObject extends SimpleGeometricObject {
    private double radius;

    public CircleFromSimpleGeometricObject() {
    
    }

    public CircleFromSimpleGeometricObject(double radius) {
    this.radius = radius;
    }

    public CircleFromSimpleGeometricObject(double radius, String color, boolean filled) {
        setColor(color);

        this.radius = radius;
        super.setColor(color);
        setFilled(filled);

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Diameter直徑
    public double getDiameter() {
        return radius * 2;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    // 周長2πr
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public void printCircle() {
        System.out.println("the circle is created" + super.getDateCreated() + "and the radius is " + radius);
    }
}
