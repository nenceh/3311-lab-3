/*
 * Name:		Nancy Hao
 * Course:		EECS 3311 A F21
 * Lab:			3
 * Description:	This software project allows users to load 6 shapes (rectangles, squares, circles) and
 * 				has the functionality to sort the shapes by their areas, all displayed on a Java GUI.
 * 				This software project implements two design patterns: Singleton and Factory.
 */

import java.util.Random;

/*
 * This class will make 6 random shapes and store them inside an ArrayList
 * 
 * This class implements the Singleton design pattern.
 */

class ShapeFactory {

	private Random ran;								// Random object
	private static ShapeFactory factory;			// Singleton instance
	
	private ShapeFactory() {}						// private constructor
	
	protected static ShapeFactory getInstance() {
		if (factory == null) factory = new ShapeFactory();
		return factory;
	}
	
	protected Shape newShape(int i) {				// generate random shape
		ran = new Random();
		int r = ran.nextInt(99);
		
		/*
		 	Random shape based on random integer 'r' (0-98):
					0-32 	-> 	rectangle
					33-65 	->	circle
					66-98	->	square
		*/
		
		if (r < 33) return new Rectangle(i);
		else if (r < 66) return new Circle(i);
		else return new Square(i);
	}
}