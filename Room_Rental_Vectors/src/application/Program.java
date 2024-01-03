package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent[] rooms = new Rent[10];
		
		System.out.println("How many rooms will be rented? ");
		int quantity_rooms = sc.nextInt();
		
		for(int i = 1; i <=quantity_rooms; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.next();
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			
			rooms[roomNumber] = new Rent(name, email);
		}
		
		System.out.println();
		System.out.println("Busy Rooms: ");
		for(int i = 0; i < rooms.length; i++) {
			if(rooms[i] != null) {
				System.out.println(i + " : " + rooms[i]);
			}
		}
		
		sc.close();
	}

}
