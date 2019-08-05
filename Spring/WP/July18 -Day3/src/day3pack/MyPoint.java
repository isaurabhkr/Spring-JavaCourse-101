package day3pack;

public class MyPoint {
	protected int x;
	protected int y;
	public MyPoint() {
		this.x = 0;
		this.y = 0;
	}
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void setX() {
		this.x = 0;
	}
	
	public void setY() {
		this.y = 0;
	}
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "MyPoint [x=" + x + ", y=" + y + "]";
	}
	
	public double distance(int x,int y) {
		return(Math.sqrt(Math.pow((this.x-x),2)+Math.pow((this.y-y),2)));
	}
	
	public double distance(MyPoint p) {
		return(Math.sqrt(Math.pow((this.x-p.x),2)+Math.pow((this.y-p.y),2)));

	}
}
