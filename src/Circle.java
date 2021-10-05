/*
 * Name:		Nancy Hao
 * Course:		EECS 3311 A F21
 * Lab:			3
 * Description:	This software project allows users to load 6 shapes (rectangles, squares, circles) and
 * 				has the functionality to sort the shapes by their areas, all displayed on a Java GUI.
 * 				This software project implements two design patterns: Singleton and Factory.
 */

/*
 * This class represents a circle and extends the generic Shape class.		
 */

class Circle extends Shape {
	
	public Circle (int i) {
		// When a Circle is made, it calls its parent's constructor, sets the type to "Circle, 
		// sets the x and y coordinates, sets the width and height, and calculates and sets the area.
		
		super();
		setType("Circle");
		
		setX(i*75 + 100);
		setY(i*75 + 100);
		
		setWidth(ran.nextInt(65) + 5);
		setHeight(this.getWidth());
		
		setArea();
	}
	
	protected void setArea() { this.area = Math.PI * Math.pow(this.getWidth()/2, 2); }
}
