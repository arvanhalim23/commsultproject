package id.sgu.ac.javabasics;
import java.util.Scanner;

public class MovieTicket {
	
	public static void main (String args[]) {
	
	int age;
	int time;

	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter your age: "); 
	age = input.nextInt();

	System.out.println("Enter your time: "); 
	time = input.nextInt();
	
	if (age > 13 && time <= 1500) {
		System.out.println("Matinee: $5.00");
		} 
		
	else if (age > 13 && time > 1500) {
		System.out.println("Normal: $8.00");
		} 
	
	else if (age < 13 && time <= 1500) {
		System.out.println("Matinee: $2.00");
		} 
	
	else if (age < 13 && time > 1500) {
		System.out.println("Normal: $4.00");
		} 
	}
}
