import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the base value: ");
		double valueX = scanner.nextDouble();
		System.out.print("Enter the height value: ");
		double valueY = scanner.nextDouble();
		System.out.println();
		
		scanner.close();
		
		Rectangle rectangle = new Rectangle(valueX, valueY);
		rectangle.area();
		rectangle.perimeter();
		rectangle.diagonal();
		
		System.out.println(rectangle.toString());

	}

}
