package by.it.academy.square.triangle;

public interface TriangleSquare {
    double squareThroughBaseAndHeight(double base, double height);

    double squareThroughTwoSidesAndAngleBetweenThem(double sideOne, double sideTwo, double angle);

    double squareThroughSidesAndTwoAdjacentAngles(double side, double angleOne, double angleTwo);
}
