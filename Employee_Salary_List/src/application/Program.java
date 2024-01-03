package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list_employees = new ArrayList<>();
		
		System.out.println("How many employees will be registered");
		int quantity_employees = sc.nextInt();
		
		for(int i = 0; i < quantity_employees; i++) {
			System.out.println("Employee " + (i+1) + " :");
			System.out.print("Id : ");
			Integer id = sc.nextInt();
			System.out.print("Name : ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary : ");
			Double salary = sc.nextDouble();
			
			Employee emp = new Employee(id, name, salary);
			list_employees.add(emp);
			
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id_employee = sc.nextInt();
		Integer pos = position(list_employees, id_employee);
		
		if(pos == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.println();
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			list_employees.get(pos).increaseSalary(percent);
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		System.out.println();
		for(Employee emp : list_employees) {
			System.out.println(emp.toString());
		}
		
		sc.close();
	}
	
	public static Integer position(List<Employee> list, int id) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

}
