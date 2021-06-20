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
    public double areaCube(double xC){
        sideCube1 = 6*xC*xC;
        return sideCube1;
    }
    //Формула для нахождения объема куба
    public double vCube(double xC){
        sideCube2 = xC*xC*xC;
        return sideCube2;
    }
    public void viewResultCube(){
        System.out.println("Площадь куба: "+sideCube1);
        System.out.println("Периметра куба: "+sideCube2);
    }
}

class Sphere {
    public double sideSphere1, sideSphere2;
    public Sphere(){}
    //Формула для нахождения площади поверхности
    public double areaSphere(double xS){
        sideSphere1 = 4*Math.PI*xS*xS;
        return sideSphere1;
    }
    //Формула для нахождения объема сферы
    public double vSphere(double xS){
        sideSphere2 = (4*Math.PI*xS*xS)/3;
        return sideSphere2;
    }
    public void viewResultSphere(){
        System.out.println("Площадь сферы: "+sideSphere1);
        System.out.println("Объем сферы: "+sideSphere2);
    }
}

public class Main {

    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        Scanner in = new Scanner(System.in);

        System.out.println("Введите длину прямоугольника: ");
        double num1 = in.nextDouble();
        System.out.println("Введите ширину прямоугольника: ");
        double num2 = in.nextDouble();

        rec.perimeterCalculator(num1,num2);
        rec.areaCalculator(num1,num2);

        rec.viewResult();

        Square recS = new Square();
        Scanner n = new Scanner(System.in);

        System.out.println("Введите длину квадрата: ");
        double x = in.nextDouble();


        recS.perimeterSquare(x);
        recS.areaSquare(x);

        recS.viewResultSquare();

        Cube recC = new Cube();
        Scanner nc = new Scanner(System.in);

        System.out.println("Введите длину куба: ");
        double xC = in.nextDouble();
        recC.areaCube(xC);
        recC.vCube(xC);

        recC.viewResultCube();

        Sphere recSp = new Sphere();
        Scanner ns = new Scanner(System.in);

        System.out.println("Введите длину радиуса: ");
        double xS = in.nextDouble();
        recSp.areaSphere(xS);
        recSp.vSphere(xS);

        recSp.viewResultSphere();
    }
}
