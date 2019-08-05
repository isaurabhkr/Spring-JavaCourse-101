package day3pack;

public class Rectangle {
	protected double l;
	protected double b;
	
	public Rectangle() {
		this.l = 0;
		this.b = 0;
	}
	
	public Rectangle(double l, double b) {
		this.l = l;
		this.b = b;
	}

	public double getL() {
		return l;
	}

	public void setL(double l) {
		if(l>0.0 && l<20.0)
			this.l = l;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		if(l>0.0 && l<20.0)
			this.b = b;
	}

	@Override
	public String toString() {
		return "Rectangle [l=" + l + ", b=" + b + "]";
	}
	
	public double area(double l, double b)
	{
		return(l*b);
	}
	
	public double perimeter(double l, double b)
	{
		return(2*(l+b));
	}
	

}
