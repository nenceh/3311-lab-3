/*
 * Name:		Nancy Hao
 * Course:		EECS 3311 A F21
 * Lab:			3
 * Description:	This software project allows users to load 6 shapes (rectangles, squares, circles) and
 * 				has the functionality to sort the shapes by their areas, all displayed on a Java GUI.
 * 				This software project implements two design patterns: Singleton and Factory.
 */

/*
 * This class represents a square and extends the Rectangle class.
 */

class Square extends Rectangle {

	public Square(int i) {
		// When a Square is made, it calls its parent's constructor (which is Rectangle). 
		// See: Rectangle constructor comments for more information.
		
		super(i, "Square");
		
		setArea();		
	}

	protected void setArea() { this.area = Math.pow(this.getWidth(), 2); }
}