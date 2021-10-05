/*
 * Name:		Nancy Hao
 * Course:		EECS 3311 A F21
 * Lab:			3
 * Description:	This software project allows users to load 6 shapes (rectangles, squares, circles) and
 * 				has the functionality to sort the shapes by their areas, all displayed on a Java GUI.
 * 				This software project implements two design patterns: Singleton and Factory.
 */

import java.util.ArrayList;
import java.util.Collections;

/*
 * This class contains the sorting technique needed to sort the order of shapes in increasing area order.
 * 
 * This class uses the Comparable interface to compare a shape's area to another shape's area.
 * 
 * This class implements the Singleton design pattern.
 */

class SortingTechnique {
	
	private static SortingTechnique technique;				// Singleton instance
	
	private SortingTechnique() {}							// private constructor

	protected void sortList(ArrayList<Shape> list) {
		
		// Simple selection sort
		int len = list.size(), smallest;
		for (int i = 0; i < len; i++) {
			smallest = i;
			
			for (int j = i+1; j < len; j++)
				if ( ((Comparable<Double>)list.get(smallest).getArea()).compareTo((Double) list.get(j).getArea()) > 0 )
					smallest = j;

			if (i != smallest) {
				int tempX = list.get(smallest).getX();
				int tempY = list.get(smallest).getY();
				list.get(smallest).setX(list.get(i).getX());
				list.get(smallest).setY(list.get(i).getY());
				list.get(i).setX(tempX);		
				list.get(i).setY(tempY);	
				
				Collections.swap(list, i, smallest);
			}
		}
	}
	
	protected static SortingTechnique getInstance() {
		if (technique == null) technique = new SortingTechnique();
	
		return technique;
	}
}