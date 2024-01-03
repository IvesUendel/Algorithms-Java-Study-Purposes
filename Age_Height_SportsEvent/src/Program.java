import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many people will participate? Maximum 10 people per category: ");
		int quantity_people = sc.nextInt();
		
		if(quantity_people <= 10) {
		
			String[] names = new String[quantity_people];
			int[] ages = new int[quantity_people];
			double[] heights = new double[quantity_people];
			
			for(int i = 0; i < quantity_people; i++) {
				System.out.println((i+1)+ " St Person Data:");
				System.out.print("Name: ");
				names[i] = sc.next();
				System.out.print("Age: ");
				ages[i] = sc.nextInt();
				System.out.print("Height: ");
				heights[i] = sc.nextDouble();
			}
			
			double sum = 0.0;
			for(int i = 0; i < quantity_people; i++) {
				sum += heights[i];
			}
			double averageHeight = sum / quantity_people;
			
			System.out.println();
			System.out.printf("Average Height: %.2f%n", averageHeight);
			
			int count = 0;
			for(int i = 0; i < quantity_people; i++) {
				if(ages[i] < 16) {
					count += 1;
				}
			}
			
			double percent = count * 100.0 / quantity_people;
			
			System.out.printf("People under 16 old years: %.1f%%%n: ", percent);
			
		} else {
			System.out.println("Enter a value between 1 and 10!!");
		}
		
		sc.close();
	}

}
