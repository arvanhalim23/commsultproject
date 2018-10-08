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
import java.util.Random;


class View implements java.util.Observer {


	private TextField myTextField;
	private Button button;
	Random rand = new Random();
	private int n = rand.nextInt(50) + 1;
	
	View() {
		System.out.println("View()");	
		
		Frame frame = new Frame();
		frame.add("North", new Label("Random temperature"));

		myTextField = new TextField();
		frame.add("Center", myTextField);

		Panel panel = new Panel();
		button = new Button("Press");
		panel.add(button);
		frame.add("South", panel);		

		frame.addWindowListener(new CloseListener());	
		frame.setSize(300,200);
		frame.setLocation(100,100);
		frame.setVisible(true);

	} 
    	public void update(Observable obs, Object obj) {
		myTextField.setText("" + ((Integer)obj).intValue());

    	} 

	public void setValue(int v){
    		myTextField.setText("" + n);
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