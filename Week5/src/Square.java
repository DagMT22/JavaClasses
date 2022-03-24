
public class Square extends Rectangle{

	public Square(double length) {
		super(length, length);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setLength( double length) {
		super.setLength(length);
		super.setWidth(length);
		
	}
	
	@Override
	public void setWidth(double width) {
		super.setWidth(width);
		super.setLength(width);
	}
	
}
