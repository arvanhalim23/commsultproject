package id.sgu.ac.javabasics.project;

class Controller implements java.awt.event.ActionListener {

	Model model;
	View view;

	Controller() {	
		System.out.println ("Controller()");
	} 

	public void actionPerformed(java.awt.event.ActionEvent e){
		System.out.println("Controller: acting on Model");
		model.incrementValue();
	} 
	
	public void addModel(Model m){
		System.out.println("Controller: adding model");
		this.model = m;
	} 

	public void addView(View v){
		System.out.println("Controller: adding view");
		this.view = v;
	} 

	public void initTemperature(int x){
		model.setValue(x);
	} 
	
	public void initHumidity(int h){
		model.setValue(h);
	} 
} 