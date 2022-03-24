
public class Rectangle extends Shape{
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		setLength(length);
		setWidth(width);
	}
	
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
	
	public double getPerimeter() {
		return (2*getLength()) + (2*getWidth());
	}
	
	public double getArea() {
		return getLength()	* getWidth();
	}
	
	@Override
	public String toString() {
		StringBuilder output = new StringBuilder();
		return String.format("%3.1f x %3.1f, Area= %3.1f, Perimeter= %3.1f",getLength(), getWidth(), getArea(), getPerimeter());
		
	}
	
	

}
