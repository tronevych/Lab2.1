/*
 *
 * Classname: Main
 *
 * 06 June 2020
 *
 * Copyright Serhii Tronevych KNUTE
 *
 * Module 2 task 1
 *
 * Create a class from the attached document according
 * to the order in your group. The class must contain
 *
 * 1. Constructor.
 * 2. Getters/Setters.
 * 3. 5 methods.
 * 4. Override toString() method
 * 5. Override hash() and equals() methods.
 *
 */

package com.company;

import java.util.Objects;

public class Rectangle {

    private int biggestSide;
    private int smallerSide;
    private double Angle;

    // 1. Constructor.

    public Rectangle() {
    }

    public Rectangle(int biggestSide, int smallerSide, double Angle) {
        this.biggestSide = biggestSide;
        this.smallerSide = smallerSide;
        this.Angle = Angle;
    }

    // 2. Getters/Setters.

    public int getBiggestSide() {
        return biggestSide;
    }

    public void setBiggestSide(int biggestSide) {
        this.biggestSide = biggestSide;
    }

    public int getSmallerSide() {
        return smallerSide;
    }

    public void setSmallerSide(int smallerSide) {
        this.smallerSide = smallerSide;
    }

    public double getAngle() {
        return Angle;
    }

    public void setAngle(double Angle) {
        this.Angle = Angle;
    }

    // 3. 5 methods.

    // Method for finding the perimeter

    public double getPerimeter() {
        return 2 * this.getBiggestSide() + 2 * this.getSmallerSide();
    }

    // Method for finding the Longest Diagonal

    public double getLongDiagonal() {
        return Math.sqrt(this.getBiggestSide() * this.getBiggestSide() +
                this.getSmallerSide() * this.getSmallerSide() + 2 *
                this.getBiggestSide() * this.getSmallerSide() *
                Math.cos(this.getAngle()));
    }

    // Method for finding the Shortest Diagonal

    public double getShortDiagonal() {
        return Math.sqrt(this.getBiggestSide() * this.getBiggestSide() +
                this.getSmallerSide() * this.getSmallerSide() - 2 *
                this.getBiggestSide() * this.getSmallerSide() *
                Math.cos(this.getAngle()));
    }

    // Method - Is Rectangle a Shombus?

    public boolean isSquare() {

        boolean result = true;

        if (this.getBiggestSide() == this.getSmallerSide()) {
            result = true;
        } else {
            result = false;
        }

        return result;

    }

    // Method - Is Rectangle a Paralelogram?

    public boolean isParalelogramm() {

        boolean result = true;

        if (this.getBiggestSide() == this.getSmallerSide() &&
                this.getAngle() == Math.PI * 0.5) {
            result = true;
        } else {
            result = false;
        }

        return result;

    }

    // 4. Override toString() method

    @Override
    public String toString() {
        return "Rectangle {" +
                "Big Side = " + biggestSide +
                ", Small Side = " + smallerSide +
                ", Angle = " + Angle +
                ", \nPerimeter = " + this.getPerimeter() +
                ", Long Diagonal = " + this.getLongDiagonal() +
                ", \nShort Diagonal = " + this.getShortDiagonal() +
                ", \nThis is Paralelogramm? - " + this.isParalelogramm() +
                ", This is Square? - " + this.isSquare() +
                '}' + "\n";
    }

    // 5. Override hash() and equals() methods.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle that = (Rectangle) o;
        return getBiggestSide() == that.getBiggestSide() &&
                getSmallerSide() == that.getSmallerSide() &&
                Double.compare(that.getAngle(), getAngle()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBiggestSide(), getSmallerSide(), getAngle());
    }
}
