import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Scanner scannerNumber = new Scanner(System.in);
		
		System.out.println("Salary Calculator");
		System.out.println();
		System.out.print("Enter the employee's name: ");
		String name = scanner.nextLine();
		System.out.print("Enter the employee's gross salary: ");
		double grossSalary = scannerNumber.nextDouble();
		System.out.print("Enter the rate on the employee's salary: ");
		double tax = scannerNumber.nextDouble();
		
		Employee employee = new Employee(name, grossSalary, tax);
		employee.netSalary();
		
		System.out.println(employee.toString());
		
		System.out.print("Enter the percentage of the employee's salary increase: ");
		double percentage = scannerNumber.nextDouble();
		employee.increaseSalary(percentage);
		
		scanner.close();
		scannerNumber.close();

	}

}
