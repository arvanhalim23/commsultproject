package id.sgu.ac.javabasics.project;

public class Model extends java.util.Observable {	
		
	private int random = (int)(Math.random() * 50 + 1);
	
	public Model(){
		System.out.println("Model()");
	}
	
	public void setValue(int value) {
		
		random = (int)(Math.random() * 50 + 1);	
		
		if(random < 20) {
		System.out.println("Model init: temperature = " + random + " ,Turning off aircon");
		setChanged();
		notifyObservers(random);
		
		}
		
		else if (random >= 20){
		System.out.println("Model init: temperature = " + random + " ,Turning on aircon");
		setChanged();
		notifyObservers(random);
		
		}

	}
	
	public void incrementValue() {
		
		random = (int)(Math.random() * 50 + 1);	
		
		if(random < 20) {	
		System.out.println("Current temperature = " + random + " ,Turning off aircon");
		setChanged();
		notifyObservers(random);
		
		}
		else if ( random >= 20){	
		System.out.println("Current temperature = " + random + " ,Turning on aircon");
		setChanged();
		notifyObservers(random);	
		
		}
		}
		
	} 
	