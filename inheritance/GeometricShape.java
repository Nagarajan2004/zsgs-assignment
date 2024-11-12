package inheritance;

abstract class Shape {
    private double dimension1;
    private double dimension2;
    
    public Shape(double dimension) {
    	this.dimension1 = dimension;
    }
    
    public Shape(double dimension1, double dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }

    public double getDimension1() {
        return dimension1;
    }
    public double getDimension2() {
        return dimension2;
    }
    abstract double calcArea();
}

class Rectangle extends Shape {
    public Rectangle(double width, double height) {
        super(width, height);
    }

    @Override
    double calcArea() {
        return getDimension1() * getDimension2();
    }
}

class Triangle extends Shape {
    public Triangle(double width, double height) {
        super(width, height);
    }

    @Override
    double calcArea() {
        return 0.5 * getDimension1() * getDimension2();
    }
}

class Circle extends Shape {
	public Circle(double radius) {
		super(radius);
	}
	
	@Override
    double calcArea() {
        return 2 * Math.PI * getDimension1();
    }
}

public class GeometricShape {
    public static void main(String[] args) {
        Rectangle rectangle =  new Rectangle(4.0, 6.0);
        Triangle triangle =  new Triangle(3.0, 4.0);
        Circle circle = new Circle(5.0);
        double areaOfRectangle = rectangle.calcArea();
        double areaOfTriangle = triangle.calcArea();
        double areaOfCircle = circle.calcArea();
        System.out.println("The Area of Rectangle is "+areaOfRectangle);
        System.out.println("The Area of Triangle is "+areaOfTriangle);
        System.out.println("The Area of Circle is "+areaOfCircle);
    }
}
