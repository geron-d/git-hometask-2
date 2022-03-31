package by.it.academy.square.triangle;

public class RightTriangleSquareImplementation implements RightTriangleSquare{

    @Override
    public double squareThroughTwoLegs(double legOne, double legTwo) {
        double square = 0.5 * legOne * legTwo;
        return square;
    }

    @Override
    public double squareThroughHypotenuseAndSharpAngle(double hypotenuse, double sharpAngle) {
        double square = 0.25 * Math.pow(hypotenuse, 2) * Math.sin(Math.toRadians(2 * sharpAngle));
        return square;
    }

    @Override
    public double squareThroughLegAndAdjacentAngles(double leg, double adjacentAngle) {
        double square = 0.5 * Math.pow(leg, 2) * Math.tan(Math.toRadians(adjacentAngle));
        return square;
    }
}
