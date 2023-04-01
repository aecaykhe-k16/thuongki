package xmlbased.xml;
import entity.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("shape.xml");

        Shape rectangle = (Shape) context.getBean("rectangle");
        Shape triangle = (Shape) context.getBean("triangle");
        Shape circle = (Shape) context.getBean("circle");
        Shape squareTrapezoid = (Shape) context.getBean("squareTrapezoid");

        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());

        System.out.println("Triangle area: " + triangle.getArea());
        System.out.println("Triangle perimeter: " + triangle.getPerimeter());

        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Circle perimeter: " + circle.getPerimeter());

        System.out.println("Square trapezoid area: " + squareTrapezoid.getArea());
        System.out.println("Square trapezoid perimeter: " + squareTrapezoid.getPerimeter());
    }

}
