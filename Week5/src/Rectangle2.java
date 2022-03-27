
public class Rectangle2 implements Shape2{
	//rectangle is defined by length and width

	private double length;

	private double width;

	//constructor for rectangle

	public Rectangle2(double length, double width) {

	this.length = length;

	this.width = width;

	}

	//getters and setters for private length and width

	public double getLength() {

	return length;

	}
	public void setLength(double length) {

	this.length = length;

	}
	public double getWidth() {

	return width;

	}
	public void setWidth(double width) {

	this.width = width;

	}

	//methods from interface

	@Override

	public double calculatePerimeter() {

	return (this.length * 2) + (this.width * 2);

	}

	@Override

	public double calculateArea() {

	return (this.length * this.width );

	}
}
