package OCP2;

public class Rectangle extends Shape{

	private double width;
	private double height;
	
	public Rectangle(double width, double height)
	{
		this.width = width;
		this.height = height;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public double getheight()
	{
		return height;
	}
	
	public double calculateArea()
	{
		return width * height;
	}
}
