package by.it.academy;


import by.it.academy.square.triangle.IsoscelesTriangleSquare;
import by.it.academy.square.triangle.IsoscelesTriangleSquareImplementation;

import by.it.academy.square.triangle.RightTriangleSquare;
import by.it.academy.square.triangle.RightTriangleSquareImplementation;

import by.it.academy.square.rectangle.RectangleSquare;
import by.it.academy.square.rectangle.RectangleSquareImplementation;
import by.it.academy.square.triangle.TriangleSquare;
import by.it.academy.square.triangle.TriangleSquareImplementation;

public class App {
    public static void main(String[] args) {
        printTriangleSquare();

        printIsoscelesTriangleSquare();

        printRightTriangleSquare();

    }


    private static void printRightTriangleSquare() {
        RightTriangleSquare rightTriangleSquare = new RightTriangleSquareImplementation();
        System.out.println("squareThroughTwoLegs : " + rightTriangleSquare.squareThroughTwoLegs(5, 5));
        System.out.println("squareThroughHypotenuseAndSharpAngle : " + rightTriangleSquare.squareThroughHypotenuseAndSharpAngle(7, 45));
        System.out.println("squareThroughLegAndAdjacentAngles : " + rightTriangleSquare.squareThroughLegAndAdjacentAngles(5, 45));
    }

    private static void printIsoscelesTriangleSquare() {
        IsoscelesTriangleSquare isoscelesTriangleSquare = new IsoscelesTriangleSquareImplementation();
        System.out.println("squareThroughBaseAndHeight : " + isoscelesTriangleSquare.squareThroughBaseAndHeight(7.071, 3.536));
        System.out.println("squareThroughSidesAndAngleBetweenThem : " + isoscelesTriangleSquare.squareThroughSidesAndAngleBetweenThem(5, 90));
    }

    private static void printTriangleSquare() {
        TriangleSquare triangleSquare = new TriangleSquareImplementation();
        System.out.println("squareThroughBaseAndHeight : " + triangleSquare.squareThroughBaseAndHeight(5, 5));
        System.out.println("squareThroughTwoSidesAndAngleBetweenThem : " + triangleSquare.squareThroughTwoSidesAndAngleBetweenThem(5, 5, 90));
        System.out.println("squareThroughSidesAndTwoAdjacentAngles : " + triangleSquare.squareThroughSidesAndTwoAdjacentAngles(5, 90, 45));
        System.out.println();
    }
}
