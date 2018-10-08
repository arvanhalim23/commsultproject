package id.sgu.ac.javabasics.project;

public class RunMVC {

	private int start_valueT = (int)(Math.random() * 40 + 1);
	private int start_valueH = (int)(Math.random() * 100 + 1);

	public RunMVC() {

		Model myModel = new Model();
		View myView = new View();
		View myView2 = new View();

		myModel.addObserver(myView);	
		myModel.addObserver(myView2);	
		
		Controller myController = new Controller();
		
		myController.addModel(myModel);
		myController.addView(myView);
		myController.addView(myView2);
		
		myController.initTemperature(start_valueT);
		myController.initHumidity(start_valueH);
		
		myView.addController(myController);
		myView2.addController(myController);
	} 

}