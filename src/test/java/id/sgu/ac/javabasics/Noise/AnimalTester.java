package id.sgu.ac.javabasics.Noise;
import java.util.ArrayList;

public class AnimalTester {
	public static void main(String[] args) {
			
			ArrayList<Noise> animals = new ArrayList<Noise>();
			
			Cow animal1 = new Cow();
			Duck animal2 = new Duck();
			
			animals.add(animal1);
			animals.add(animal2);
			
			for (int i =0; i < animals.size(); i++){
				animals.get(i).speak();
			}
			
	}
}