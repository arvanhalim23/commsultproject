package id.sgu.ac.javabasics;
import java.util.Scanner;

public class BookIndex {
	public static void main (String args[]) {

	Scanner in = new Scanner(System.in);  
    System.out.print("Enter first word: ");    
    String Word1 = in.next();  
    
    System.out.print("Enter second word: ");    
    String Word2 = in.next();  
  
    System.out.println("Word count of word 1: "+Word1.length());
    System.out.println("Word count of word 2: "+Word2.length());
    
    int dotsLength = (30 - (Word1.length() + Word2.length()));
    
    
    System.out.print(Word1);
    for (int x = 0 ; x < dotsLength; x++) {
    	System.out.print(".");
    }
    System.out.print(Word2);
    
		
		
	}
	
}
