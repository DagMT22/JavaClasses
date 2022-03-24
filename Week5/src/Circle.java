
public class Circle extends Shape{
	private double radius;
	private double PI = Math.PI;
		
	public Circle(double i) {
		setRadius(i);
	}

	public double getRadius() {
	return radius;
	}
	
	public void setRadius(double radius ) {
		this.radius = radius;
	}

	public double getDiameter() {
		return getRadius() * 2;
	}

	public double getCircumference() {
		return getRadius() * PI * 2;
	}
	
	public double getArea() {
		return PI * getRadius() * getRadius();
	}
	
	@Override
	public String toString() {
		StringBuilder output = new StringBuilder();
		// R(radius), Area = <area>, Circumference = <circ>, Diam = <diam>
		output.append("R(");
		output.append(getRadius());
		output.append("), Area= ");
		output.append(getArea());
		output.append(", Circumference = ");
		output.append(getCircumference());
		output.append(", Diameter = ");
		output.append(getDiameter());		
		
		return output.toString();
	}
	
	
}
