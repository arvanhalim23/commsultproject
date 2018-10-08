package id.sgu.ac.javabasics.project;

public class Model extends java.util.Observable {	
		
	private int randomT = (int)(Math.random() * 40 + 1);
	private int randomH = (int)(Math.random() * 100 + 1);
	
	public Model(){
		System.out.println("Model()");
	}
	
	public void setValue(int value) {
		
		randomT = (int)(Math.random() * 40 + 1);
		randomH = (int)(Math.random() * 100 + 1);
		
		if(randomT < 20 || randomH < 50) {
		System.out.println("Model init: temperature = " + randomT + " ,initial humidity = " + randomH +" ,Aircon : OFF");
		
		setChanged();
		notifyObservers(randomT);
		notifyObservers(randomH);
		
		}

		else if (randomT >= 20 || randomH >= 50){
			System.out.println("Model init: temperature = " + randomT + " ,initial humidity = " + randomH +" ,Aircon : ON");
		setChanged();
		notifyObservers(randomT);
		notifyObservers(randomH);
		}
	}
	
	public void incrementValue() {
		
		randomT = (int)(Math.random() * 40 + 1);
		randomH = (int)(Math.random() * 100 + 1);
		
		if(randomT < 20 || randomH < 50) {	
		System.out.println("Current temperature = " + randomT + " ,Current humidity = " +randomH + " ,Aircon : OFF");
		setChanged();
		notifyObservers(randomT);
		notifyObservers(randomH);
		
		}
		else if (randomT >= 20 || randomH >= 50){	
			System.out.println("Current temperature = " + randomT + " ,Current humidity = " +randomH + " ,Aircon : ON");
		setChanged();
		notifyObservers(randomT);
		notifyObservers(randomH);	
		
		}
		}
		
	} 
	