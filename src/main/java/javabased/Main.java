package javabased;

import entity.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Rectangle rectangle = context.getBean(Rectangle.class);
        Triangle triangle = context.getBean(Triangle.class);
        Circle circle = context.getBean(Circle.class);
        SquareTrapezoid squareTrapezoid = context.getBean(SquareTrapezoid.class);

        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());

        System.out.println("Triangle area: " + triangle.getArea());
        System.out.println("Triangle perimeter: " + triangle.getPerimeter());

        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Circle perimeter: " + circle.getPerimeter());

        System.out.println("Square trapezoid area: " + squareTrapezoid.getArea());
        System.out.println("Square trapezoid perimeter: " + squareTrapezoid.getPerimeter());
    }
}
