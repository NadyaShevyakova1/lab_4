package ru.miet.pin31d.promprog.shevyakovanadya;

import java.util.Scanner;
class Rectangle {
    public double side1,side2;
    public Rectangle(){}
    //Формула для нахождения площади
    public double areaCalculator(double num1,double num2){
        side1 = (num1 * num2);
        return side1;
    }
    //Формула для нахождения периметра прямоугольника
    public double perimeterCalculator(double num1,double num2){
        side2 = (num1 + num2)*2;
        return side2;
    }
    public void viewResult(){
        System.out.println("Площадь прямоугольника: "+side1);
        System.out.println("Периметра прямоугольника: "+side2);
    }
}

class Square {
    public double sideSquare1, sideSquare2;
    public Square(){}
    //Формула для нахождения площади
    public double areaSquare(double x){
        sideSquare1 = (x*x);
        return sideSquare1;
    }
    //Формула для нахождения периметра квадрата
    public double perimeterSquare(double x){
        sideSquare2 = (x+x)*2;
        return sideSquare2;
    }
    public void viewResultSquare(){
        System.out.println("Площадь квадрата: "+sideSquare1);
        System.out.println("Периметра квадрата: "+sideSquare2);
    }
}

class Cube {
    public double sideCube1, sideCube2;
    public Cube(){}
    //Формула для нахождения площади
    public double areaSquare(double xC){
        sideCube1 = 6*xC*xC;
        return sideCube1;
    }
    //Формула для нахождения объема куба
    public double perimeterCube(double xC){
        sideCube2 = xC*xC*xC;
        return sideCube2;
    }
    public void viewResultCube(){
        System.out.println("Площадь куба: "+sideCube1);
        System.out.println("Периметра куба: "+sideCube2);
    }
}