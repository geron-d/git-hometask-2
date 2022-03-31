package by.it.academy.square.triangle;

public class IsoscelesTriangleSquareImplementation implements IsoscelesTriangleSquare {
    @Override
    public double squareThroughBaseAndHeight(double base, double height) {
        double square = 0.5 * base * height;
        return square;
    }

    @Override
    public double squareThroughSidesAndAngleBetweenThem(double side, double angleBetweenSides) {
        double square = 0.5 * Math.pow(side, 2) * Math.sin(Math.toRadians(angleBetweenSides));
        return square;
    }


}
