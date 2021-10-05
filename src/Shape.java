/*
 * Name:		Nancy Hao
 * Course:		EECS 3311 A F21
 * Lab:			3
 * Description:	This software project allows users to load 6 shapes (rectangles, squares, circles) and
 * 				has the functionality to sort the shapes by their areas, all displayed on a Java GUI.
 * 				This software project implements two design patterns: Singleton and Factory.
 */

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

/*
 * This abstract class contains a generic concept of a Shape.
 * 
 * Each shape is able to compute its own area via an abstract method since each shape has a
 * way of calculating its area, and is able to draw/paint itself.
 */

abstract class Shape {
	
	// Each Shape has:
	protected Random ran;				// Random object to randomly choose dimensions
	private int x,y, width, height;		// integer x & y coordinates, width, height values
	protected double area;				// double area value
	private String type;				// String type_of_shape value
	private Color col;					// random Color
	
	// The list of Colors based on Colors' constants
	final private Color[] LIST_COL =
		{Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.MAGENTA,
			Color.BLACK, Color.CYAN, Color.PINK};
	
	
	public Shape() {
		// When a generic shape is made, it instantiates a random object and assigns it a colour.
		
		ran = new Random();
		this.col = LIST_COL[ran.nextInt(LIST_COL.length)];
	}
	
	public void paintComponent (Graphics g) {
		// This method paints a shape by setting the Graphics to the shape's colour and filling it based on its dimensions.
		
		if (this.type.equals("Circle")) {		// if current shape is a circle
			g.setColor(this.col);
			g.fillOval(this.getX(), this.getX(), this.getWidth(), this.getWidth());
		}
		else {									// else if current shape is rectangle/square
			g.setColor(this.col);
			g.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
		}
	}
	
	// setters & getters
	protected void setType(String t) { this.type = t; }
	
	public String getType () { return this.type; }
	
	public Color getColour() { return this.col; }
	
	protected void setX(int x) { this.x = x; }
	protected void setY (int y) { this.y = y; }
	
	public int getX() { return this.x; }
	public int getY() { return this.y; }
	
	public Double getArea() { return this.area; }
	
	protected void setWidth(int w) { this.width = w; }
	protected void setHeight(int h) { this.height = h; }
	
	
	public int getWidth() { return this.width; }
	public int getHeight() { return this.height; }
	
	// abstract setter
	abstract protected void setArea();
}