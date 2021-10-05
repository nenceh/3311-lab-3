<h1> EECS3311 F21 Lab3 </h1>

<h2> What is this? </h2>
<p> 
  This is my software project for EECS3311 F21 <a href="https://github.com/nenceh/3311-lab-3/files/7282935/lab3info.pdf">Lab3</a>.
  
  <br>

  This software project is about combining the implementation of a Java graphical user interface (GUI) using <i>javax.swing</i> objects and components with object-oriented programming and design, while using design patterns. The goal for this software project is to allow users to load 6 shapes (rectangles, squares, circles) and has the functionality to sort the shapes by their areas, all displayed visually on a Java GUI.
</p>

<br>

<h2> Video Demo </h3>
<p> As GitHub cannot support attaching files larger than 10MB, click <b>here</b> to access a YouTube unlisted video. </p>

<br>

<h2> Written Report </h3>
<p>
  Click <b><a href="">here</a></b> to download a PDF version of my written report. 
  
  <br> ... <br><br>
  
  If you don't feel like downloading, here is a rundown of what the report is composed of. Essentially, there are four main parts:
  <ul>
    <li> Part 1 - Introduction 
      <ul>
        <li> Explain what the software project about and what are its goals. </li>
        <li> Explain the challenges associated to the software project. </li>
        <li> Explain the concepts (e.g., OOD, OOD principles, design patterns) you will use to carry out the software project. </li>
        <li> Explain how you are going to structure you report accordingly. </li>
      </ul>
    </li> <br>
    <li> Part 2 - Design
        <ul>
          <li> Create a first UML class diagram of your system (use at least two design patterns), add the corresponding figure in the report and comment its elements. </li>
          <li> Explain in your report how you have used the OO design principles in your class diagram: name the corresponding classes, interfaces, and if possible most relevant methods </li>
          <li> Propose a design alternative by creating a second UML class diagram. Does this second class diagram yields a better design than your first class diagram? Explain why. </li>
        </ul>
    </li> <br>
    <li> Part 3 - Implementation
        <ul>
          <li> Your class diagram should include the following classes:
            <ul>
              <li> The Circle class: it represents a circle </li>
              <li> The Rectangle class: it represent a Rectangle </li>
              <li> The Square class: it represents a rectangle whose height and width are equal </li>
              <li> The Shape class: class that embodies the generic concept of Shape </li>
              <li> The SortingTechnique class: it allows sorting shapes based on their surfaces </li>
              <li> The ShapeFactory: it supports the instantiation of different Shapes </li>
              <li> The classes allowing to display the shapes on an interface </li>
              <li> Other classes you may find relevant. </li>
            </ul>
          </li> 
          <li>Describe the algorithm of the sorting technique you have used to sort the shapes:
            <ul>
              <li> Describe how you have implemented and compiled all the classes of your class diagram in Java (specify if you have implemented the first or the second class diagram) </li>
              <li> Specify the tools you have used during the implementation: version of Eclipse/IntelliJ or of another IDE use to write code and run it, version of JDK, etc. </li>
              <li> Take a snapshot of the execution of the code (i.e., of the interface) and comment it in the report </li>
              <li> Create a short video (2 to 3 mins) showing how to launch your application and run it </li>
            </ul>
          </li>
        </ul>
    </li> <br>
    <li> Part 4 - Conclusion
        <ul>
          <li> What went well in the software project? </li>
          <li> What went wrong in the software project? </li>
          <li> What have you learned from the software project? </li>
          <li> What are your top three recommendations to ease the completion of the software project? </li>
        </ul>
    </li>
  </ul>

  <br> <br>
  
  You can also find the report here! 🠇🠇🠇 <b> Warning </b>, it's quite long... 
  
  <hr>
  
  <h3><strong> Introduction </strong> </h3>
  
  This software project is about combining the implementation of a Java graphical user interface (GUI) using javax.swing objects and components with object-oriented programming and design, while using design patterns. The goal for this software project is to allow users to load 6 shapes (rectangles, squares, circles) and has the functionality to sort the shapes by their areas, all displayed visually on a Java GUI.
  
  <br>
  
  Some challenges associated to the software project include:
  <ul>
    <li> Inheritance ➜ the children shape objects can inherit from the parent shape object </li>
    <li> Abstraction ➜ methods of a class is not exposed to other classes that are not relevant to it </li>
    <li> Positioning the GUI objects successfully and in appropriate places </li>
    <li> Successfully applying some of the design patterns </li>
  </ul>

  <br>

  The OOD concepts I will use to carry out this software project are:
  <ul>
    <li> Abstraction ➜ I will hide the internal implementation of a class from other classes such that I will expose only the relevant methods with other relevant classes </li>
    <li> Inheritance ➜ I will make sure the shape objects of Rectangle, Square and Circle are the children classes of the generic object of Shape. I will also make sure the children can reuse the parent’s fields and methods. </li>
  </ul>

  I am going to structure the report by first doing the first two parts (introduction and design of the solution). Then, I will move onto part 3: implementation of the solution, where I will write my code in Java in Eclipse. Finally, after the entire coding and the unified modeling language (UML) diagrams have been completed, I will finish the report by writing part 4: conclusion.

  <br>

  <h3><strong> Design </strong> </h3>

  The following image is a picture of my first class diagram that contains two design patterns.
  
  <br>

  ![uml_1](https://user-images.githubusercontent.com/45662855/135968656-55d3e55d-da3f-4f97-b571-9c53922bdeb3.png)
  <h6 align="center"> Figure 1: The image of my first UML diagram that implements two design patterns. </h6>

  <br>

  In the UML class diagram seen in Figure 1, I have designed this software project to incorporate object-oriented programming and design, and two design patterns: Singleton and Factory. I decided to make the SortingTechnique and ShapeFactory class have the Singleton design pattern because those two classes perform only one job each and do not need several instances for this software project to function properly. The SortingTechnique class will sort the list of shapes as its primary and only job. Therefore, having one instance will work the same as having several instances of this object, and so I decided to practice implementing the Singleton design pattern via this class. As well, ShapeFactory’s only job is to generate a random shape, and therefore this project only needs one “factory”/ random shape-generator. ShapeFactory also has the Factory pattern which also forms its relationships with the other classes. I feel this design pattern applies well to this software project because of the required “randomness” of shapes (random shape generated with random dimensions; no pre-determined shapes). By implementing the Factory design pattern, my project will generate random shapes at runtime.

  <br>

  Figure 1 also details the four main object-oriented design principles used:
  <ol>
    <li> Abstraction <br>
      In the classes, the fields and methods are private or protected, except for the public constructors. The visibility of private makes it so that the field or method cannot be accessed in other classes except the ones which it is declared in. The visibility of protected means the field or method can be accessed by any class in the same package. There are setters and getters methods to access the value of the private fields.
    </li>
    <li> Encapsulation <br>
      In the classes, encapsulation is used to keep the data (fields and methods) in one class bundled. This is so that there is restriction from accessing the data directly.
    </li>
    <li> Inheritance <br>
      The Rectangle, Square and Circle class inherit from their respective parent class. Each child is able to reuse fields and methods that belong to the parent.
    </li>
    <li> Polymorphism <br>
      In the diagram, polymorphism is used around a concept of a shape. For example, a concept of a square can be in place of a concept of a rectangle but with square’s behaviours.
    </li>
  </ol>

  <br>

  The following image is my second UML class diagram incorporating one design pattern.

  <br>

  ![uml_2](https://user-images.githubusercontent.com/45662855/135970363-da8e820b-24af-4e23-90fa-54934f904319.png)

  <h6 align="center"> Figure 2: The image of my second UML diagram that implements one design pattern. </h6>
   
  <br>

  In my opinion, the second class diagram, seen in Figure 2, does not yield a better design, and my first UML diagram, seen in Figure 1, yields a more user-friendly design.
  
  <br>
  
  My second diagram implements the Builder design pattern, where the ShapeFactory class supports the common building process of a “shape” and the Shape class is an interface with declared methods. Although this diagram allows the creation of different representations of “shapes” in the same constructive way, by having an interface, it means the classes implementing it will each need complete concrete methods written separately. As Square, Rectangle and Circle implement from the Shape interface, they cannot use or reference from a parent class, and I feel this does not have the same level of object-oriented design as the first diagram. In addition, the first diagram seems more user-friendly as viewers can clearly identify the object-oriented approach I took. Viewers can also clearly see which classes have the Singleton design pattern by identifying the private constructors, static references, and public getInstance() methods.

  <br>

  <h3><strong> Implementation </strong> </h3>

  The algorithm I used to sort the areas of the shapes in increasing order is a simple Selection sort algorithm. The algorithm for Selection sort sorts an array or list by continuously finding the minimum element from the list and places the element at beginning of the list. I decided to use Selection sort because it is very simple to implement and for viewers to understand.
  
  <br>
  
  I implemented this concept by going through the list of 6 shapes made and compared each of the shape’s areas. The list of 6 shapes is listed in increasing order by its x and y coordinate, such that at index 0 the shape’s coordinates are closest to the upper left corner, and at index 5 the shape’s coordinates are closest to the lower right corner. 
  
  <br>
  
  In each iteration, after finding the minimum, the algorithm will swap the x and y coordinates with the shape at the top of the sub list, such that the minimum shape will have its coordinates as close to the upper left corner as possible. Then, that minimum shape will also swap index positions with the shape at the top of the sub list, such that this will indicate this shape has been placed correctly and should not be looked at anymore.

  <br>
  
  I have implemented the first UML diagram as seen in Figure 1. As stated earlier in the report, a big reason is I feel the first UML diagram has a more user-friendly design. As well, I decided to implement the first design I feel it will provide more flexibility in potential future expansions of this software project.

  <br>
  
  This implementation of the software project begins with the main method located in ShapesGUI. The main method only has one line new ShapesGUI();, which will instantiate a ShapesGUI object. The ShapesGUI constructor will build the GUI/interface using javax.swing components, including two buttons: Load shapes and Sort shapes. When Load shapes button is clicked, ShapesGUI will create and instantiate a Singleton ShapeFactory object where it will generate six random Shape objects with random dimensions and a random colour associated with each shape, and ShapesGUI will store all six shapes inside an ArrayList. Determining what random shape is created is based on a random integer generated `int r = ran.nextInt(99);` If r ∈[0,32], a rectangle is created. If r ∈[33,65], a circle is created. If r ∈[66,98], a square is created. After the list is created, ShapesGUI will move to displaying the 6 shapes inside the list onto the interface. ShapesGUI will call the method `public void paintComponent (Graphics g)` inside Shape. Since each shape has the ability to draw itself, each shape will draw itself based at their respective x and y coordinates. The x and y coordinates are determined by the formula `i*75 + 100`, where i is the index of the list where the shape is located. That way, each shape will have an appropriate position inside the GUI dimensions of 600x600. When the Sort shapes button is clicked, ShapesGUI will instantiate a Singleton SortingTechnique object. When calling the SortingTechnique object, it will sort the list of shapes in increasing order by the value of their areas by switching around the x and y coordinates of each shape. Finally, ShapesGUI will again display the 6 shapes onto the interface by allowing each shape to draw itself.

  <br>
  
  In this software project, the tools I used Eclipse IDE Version: 2021-06 (4.20.0), the Java programming language and JDK Version 11.0.9, Microsoft Word, the online tool diagrams.net to draw the UML diagrams, GitHub to upload the necessary project files, and HyperCam2 to capture my video demonstration.

  <br>
  
   The following are images of my interface when the code is executed.
   
   ... TBA

</p>
