
public class Rectangle {

	private double width;
	private double height;
		
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double area() {
		return this.getWidth() * this.getHeight();
	}
	
	public double perimeter() {
		return 2 * (this.getWidth() + this.getHeight());
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}

	@Override
	public String toString() {
		return "Area = " + area() +"\n"
				+ "Perimeter = " + perimeter() + "\n"
				+ "Diagonal = " + diagonal();
	}
	
	
	
}
