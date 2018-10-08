package id.sgu.ac.javabasics.project;

import java.awt.Button;
import java.awt.Panel;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.Label;
import java.awt.event.WindowEvent;	
import java.awt.event.WindowAdapter;	
import java.lang.Integer;		
import java.util.Observable;	
import java.awt.event.ActionListener;


class View implements java.util.Observer {


	private TextField myTextField1;
	private Button button;

	
	View() {
		System.out.println("View()");	
		
		Frame frame = new Frame();
		frame.add("North", new Label("Random temperature"));

		myTextField1 = new TextField();
		frame.add("Center", myTextField1);

		Panel panel = new Panel();
		button = new Button("Change temperature (random)");
		panel.add(button);
		frame.add("South", panel);		

		frame.addWindowListener(new CloseListener());	
		frame.setSize(250,150);
		frame.setLocation(100,100);
		frame.setVisible(true);

	} 
    	public void update(Observable obs, Object obj) {
		myTextField1.setText("Temperature: " + ((Integer)obj).intValue());
    	} 
    	
	public void addController(ActionListener controller){
		System.out.println("View      : adding controller");
		button.addActionListener(controller);	
	} 
	
	public static class CloseListener extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			e.getWindow().setVisible(false);
			System.exit(0);
		} 
	} 

}