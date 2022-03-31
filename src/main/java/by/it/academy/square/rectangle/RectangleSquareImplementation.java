package by.it.academy.square.rectangle;

public class RectangleSquareImplementation implements RectangleSquare {
    @Override
    public double squareThroughWidthAndLength(double width, double length) {
        double square = width * length;
        return square;
    }

    @Override
    public double squareThroughQuadrilateralFormula(double diagonal, double angleBetweenDiagonals) {
        double square = 0.5 * Math.pow(diagonal, 2) * Math.sin(Math.toRadians(angleBetweenDiagonals));
        return square;
    }

    @Override
    public double squareThroughSideAndDiagonal(double side, double diagonal) {
        double square = side * Math.sqrt(Math.pow(diagonal, 2) - Math.pow(side, 2));
        return square;
    }
}
