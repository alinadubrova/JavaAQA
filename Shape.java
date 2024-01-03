import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(10);
        circle.setFillColor(Color.BLACK);
        circle.setBorderColor(Color.WHITE);
        System.out.println(circle);

        Shape rectangle = new Rectangle(5, 7);
        rectangle.setFillColor(Color.RED);
        rectangle.setBorderColor(Color.GREEN);
        System.out.println(rectangle);

        Shape triangle = new Triangle(4, 5, 7);
        triangle.setFillColor(Color.YELLOW);
        triangle.setBorderColor(Color.ORANGE);
        System.out.println(triangle);
    }
}

interface Shape {
    double getPerimeter();
    double getArea();
    void setFillColor(Color color);
    void setBorderColor(Color color);
}

class Circle implements Shape {
    private final double radius;
    private Color fillColor;
    private Color borderColor;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public void setFillColor(Color color) {
        this.fillColor = color;
    }

    public void setBorderColor(Color color) {
        this.borderColor = color;
    }

    public String toString() {
        return "Круг [" + "периметр = " + getPerimeter() + ", площадь = " + getArea() + ", цвет фона = " + fillColor + ", цвет границ = " + borderColor + ']';
    }
}

class Rectangle implements Shape {
    private final double width;
    private final double height;
    private Color fillColor;
    private Color borderColor;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public double getArea() {
        return width * height;
    }

    public void setFillColor(Color color) {
        this.fillColor = color;
    }

    public void setBorderColor(Color color) {
        this.borderColor = color;
    }

    public String toString() {
        return "Прямоугольник [" + "периметр = " + getPerimeter() + ", площадь = " + getArea() + ", цвет фона = " + fillColor + ", цвет границ = " + borderColor + ']';
    }
}

class Triangle implements Shape {
    private final double side1;
    private final double side2;
    private final double side3;
    private Color fillColor;
    private Color borderColor;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    public void setFillColor(Color color) {
        this.fillColor = color;
    }

    public void setBorderColor(Color color) {
        this.borderColor = color;
    }

    public String toString() {
        return "Треугольник ["+ "периметр = " + getPerimeter() + ", площадь = " + getArea() + ", цвет фона = " + fillColor + ", цвет границ = " + borderColor + ']';
    }
}