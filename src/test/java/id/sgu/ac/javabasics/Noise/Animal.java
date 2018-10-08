package id.sgu.ac.javabasics.Noise;

interface Noise {
	public void speak();	
}

public class Animal{

}

class Cow implements Noise {

	public Cow() {
		System.out.println("Cow is created!");
	}
	public void speak(){
		System.out.println("Moo!");
	}
}

class Duck implements Noise{

	public Duck() {
		System.out.println("Duck is created!");
	}
	public void speak(){
		System.out.println("Quack!");
	}
}