package javabased;

import entity.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Rectangle rectangle() {
        return new Rectangle(5, 10);
    }

    @Bean
    public Triangle triangle() {
        return new Triangle(3, 4, 5);
    }

    @Bean
    public Circle circle() {
        return new Circle(5);
    }

    @Bean
    public SquareTrapezoid squareTrapezoid() {
        Rectangle rectangle = rectangle();
        Triangle triangle = triangle();
        return new SquareTrapezoid(rectangle, triangle);
    }
}

