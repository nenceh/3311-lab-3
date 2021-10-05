/*
 * Name:		Nancy Hao
 * Course:		EECS 3311 A F21
 * Lab:			3
 * Description:	This software project allows users to load 6 shapes (rectangles, squares, circles) and
 * 				has the functionality to sort the shapes by their areas, all displayed on a Java GUI.
 * 				This software project implements two design patterns: Singleton and Factory.
 */

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * This class contains all the Java GUI setup needed for this software project.
 * 
 * This class contains the main method which starts the entire software project.
 */

public class ShapesGUI implements ActionListener{

	private final int SIZE = 600;			// maximum size of interface
	private final int NUM_SHAPES = 6;		// maximum of 6 shapes
	
	private JFrame frame;					// frame is window
	private JPanel panel;					// panel is layout
	private JButton loadButton, sortButton; // buttons
	private JLabel status;					// some text to display the "status" of button pressed
	
	private Graphics g;						// Graphics object
	
	private ShapeFactory factory;			// ShapeFactory object; implements Singleton, Factory design pattern
	private ArrayList<Shape> list;
	private SortingTechnique sort;			// SortingTechnique object; implements Singleton design pattern
	
	public ShapesGUI() {
		
		// instantiation of GUI objects
		frame = new JFrame("Display shapes");
		panel = new JPanel(null);
		
		loadButton = new JButton("Load shapes");
		sortButton = new JButton("Sort shapes");
		
		status = new JLabel();
		
		// setting the frame
		frame.setSize(SIZE, SIZE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		
		// creating buttons
		loadButton.setBounds(150, 0, 125, 25);
		loadButton.addActionListener(this);
		
		sortButton.setBounds(300, 0, 125, 25);
		sortButton.addActionListener(this);
		
		//setting the panel
		panel.setLayout(null);
		panel.add(loadButton);
		panel.add(sortButton);
		panel.add(status);	
		panel.setVisible(true);
		
		// visibility
		frame.setContentPane(panel);
		frame.setVisible(true);
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// This method runs when a button is pressed.
		
		if (e.getSource() == loadButton) {			// if 'Load shapes' button is clicked
			
			factory = ShapeFactory.getInstance();		// get Singleton instance of ShapeFactory
			list = new ArrayList<>();					// instantiate a (new) ArrayList
			
			for (int i = 0; i < NUM_SHAPES; i++)
				list.add(factory.newShape(i));			// generate 6 random shapes & add onto an ArrayList
			
			
			status.setText("");							// get rid of text in case there is one
			displayShapes(list);						// calls display method
			
		}
			
		else {										// else if 'Sort shapes' button is clicked
			
			if (list == null) 							// if there are no shapes currently
				status.setText("Unable to sort. Please load some shapes.");
			
			else {										// else if there are shapes, can sort them
				sort = SortingTechnique.getInstance();		// get Singleton instance of SortingTechnique
				sort.sortList(list);						// sort the ArrayList using that instance
				displayShapes(list);						// calls display method
			}
			
		}
		
		// setting + displaying text/"status"
		Dimension size = status.getPreferredSize();
		status.setBounds(10, 30, size.width, size.height);		
	
	}
	
	public void displayShapes (ArrayList<Shape> list) {	
		// This method displays shapes to the GUI.
		
		g = panel.getGraphics();
		
		g.clearRect(100, 100, SIZE, SIZE);				// clear existing shapes
		
		for (int i = 0; i < NUM_SHAPES; i++) {			// for each of the 6 shapes...
			
			//System.out.println(list.get(i).getType() + " | " + list.get(i).getArea() + " | " + list.get(i).getWidth() + " | " + list.get(i).getHeight());
			
			list.get(i).paintComponent(g);					// draw shape
		}
		
		//System.out.println("-------------------------------");
			
	}
	
	// Main method to start entire software project:
	public static void main(String[] args) { new ShapesGUI(); }	

}