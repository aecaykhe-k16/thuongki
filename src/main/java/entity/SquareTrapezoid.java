package entity;

public class SquareTrapezoid implements Shape {
    private Rectangle rectangle;
    private Triangle triangle;

    public SquareTrapezoid(Rectangle rectangle, Triangle triangle) {
        this.rectangle = rectangle;
        this.triangle = triangle;
    }

    public double getArea() {
        return rectangle.getArea() + triangle.getArea();
    }

    public double getPerimeter() {
        return rectangle.getPerimeter() + triangle.getPerimeter();
    }
}

