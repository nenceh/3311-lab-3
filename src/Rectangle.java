/*
 * Name:		Nancy Hao
 * Course:		EECS 3311 A F21
 * Lab:			3
 * Description:	This software project allows users to load 6 shapes (rectangles, squares, circles) and
 * 				has the functionality to sort the shapes by their areas, all displayed on a Java GUI.
 * 				This software project implements two design patterns: Singleton and Factory.
 */

/*
 * This class represents a rectangle and extends the generic Shape class.	
 */

class Rectangle extends Shape{
	
	public Rectangle(int i, String type) {
		super();
		int len = ran.nextInt((75 - 20) + 1) + 20;
		setDimensions(len, len, type);
		
		setX(i*75 + 100);
		setY(i*75 + 100);
	}
	
	public Rectangle(int i) {
		// When a Rectangle is made, it calls its parent's constructor, sets the x and y coordinates,  
		// sets the type to "Rectangle", sets the width and height, and calculates and sets the area.
		
		super();
		
		setX(i*75 + 100);
		setY(i*75 + 100);
		
		int w = ran.nextInt((75 - 20) + 1) + 20;
		int h = ran.nextInt(w) + 5;
		
		setDimensions(w, h, "Rectangle");

		setArea();	
	}
	
	private void setDimensions(int w, int h, String type) {
		setType(type);
		setWidth(w);
		setHeight(h);		
	}
	
	protected void setArea() { this.area = (this.getWidth() * this.getHeight()); }
}