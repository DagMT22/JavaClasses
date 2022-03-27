public class Application {
	public static void main(String[] args) {
		Circle circle = new Circle(5);
		//circle.setRadius(5);
		System.out.printf("Radius:        %5.1f%n", circle.getRadius());
		System.out.printf("Diameter:      %5.1f%n", circle.getDiameter());
		System.out.printf("Circumference: %5.1f%n", circle.getCircumference());
		System.out.printf("Area:          %5.1f%n", circle.getArea());
		System.out.println(Math.PI);
		
		System.out.println(new Circle(4.0).getDiameter());
		
		System.out.println(circle.toString());
		
		Rectangle rectangle = new Rectangle(1.0, 2.0);
		System.out.println(rectangle.toString());
		
		System.out.println(new Square(5).toString());
		
		System.out.println("*****");
		
		Shape[] shapes = new Shape[] {
				new Circle(10),
				new Rectangle(5, 8),
				new Square(5),
		};
		for (Shape each : shapes) {
			System.out.println(each.getClass());
			System.out.println(each.toString());
		}
		
		Dog kiva = new Dog();
		kiva.speak();
		System.out.println(kiva.getFavoriteFoodName());
		
		Rectangle2 sample = new Rectangle2(2.0, 5.0);
		System.out.println("Perimeter = " + sample.calculatePerimeter());
		System.out.println("Area = " + sample.calculateArea());
		
		
	}

	
	
	
}
