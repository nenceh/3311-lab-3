<h1> EECS3311 F21 Lab3 </h1>

<h2> What is this? </h2>
<p> 
  This is my software project for EECS3311 F21 <a href="https://github.com/nenceh/3311-lab-3/files/7282935/lab3info.pdf">Lab3</a>.
  
  <br>

  This software project is about combining the implementation of a Java graphical user interface (GUI) using <i>javax.swing</i> objects and components with object-oriented programming (OOP) and object-oriented design (OOD), while using design patterns. The goal for this software project is to allow users to load 6 shapes (rectangles, squares, circles) and has the functionality to sort the shapes by their areas, all displayed visually on a Java GUI.
</p>

<br>

<h2> Video Demo </h3>
<p> As GitHub cannot support attaching files larger than 10MB, click <b> <a href="https://youtu.be/jH8qIvrLOBs">here</a></b> to access a YouTube unlisted video. </p>

<br>

<h2> Written Report </h3>
<p>
  Click <b><a href="https://github.com/nenceh/3311-lab-3/files/7288150/Nancy.Hao.-.Lab.3.Report.pdf">here</a></b> to download a PDF version of my written report.

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
  
  <h3><strong> INTRODUCTION </strong> </h3>
  
  This software project is about combining the implementation of a Java graphical user interface (GUI) using <i>javax.swing</i> objects and components with object-oriented programming (OOP) and object-oriented design (OOD), while using design patterns. The goal for this software project is to allow users to load 6 shapes (rectangles, squares, circles) and has the functionality to sort the shapes by their areas, all displayed visually on a Java GUI.
  
  <br>
  
  Some challenges associated with the software project include:
  <ul>
    <li> Inheritance ➜ the children shape objects can inherit from the parent shape object </li>
    <li> Abstraction ➜ methods of a class is not exposed to other classes that are not relevant to it </li>
    <li> Positioning the GUI objects successfully and in the appropriate places </li>
    <li> Successfully applying some of the design patterns </li>
  </ul>

  <br>

  The OOD concepts I will use to carry out this software project are:
  <ul>
    <li> Abstraction ➜ I will hide the internal implementation of a class from other classes such that I will expose only the relevant methods with other relevant classes </li>
    <li> Inheritance ➜ I will make sure the shape objects of Rectangle, Square and Circle are the children classes of the generic object of Shape. I will also make sure the children can reuse the parent’s fields and methods. </li>
  </ul>

  I am going to structure the report by first doing the first two parts (introduction and design of the solution). Then, I will move on to part 3: implementation of the solution, where I will write my code in Java in Eclipse. Finally, after the entire coding and the unified modeling language (UML) diagrams have been completed, I will finish the report by writing part 4: conclusion.

  <br>

  <h3><strong> DESIGN </strong> </h3>

  The following image is a picture of my first class diagram that contains two design patterns.
  
  <br>

  ![uml_1](https://user-images.githubusercontent.com/45662855/135968656-55d3e55d-da3f-4f97-b571-9c53922bdeb3.png)
  <h6 align="center"> Figure 1: The image of my first UML diagram that implements two design patterns. </h6>

  <br>

  In the UML class diagram seen in Figure 1, I have designed this software project to incorporate OOP and OOD, and two design patterns: Singleton and Factory. I decided to make the <i>SortingTechnique</i> and <i>ShapeFactory</i> class have the Singleton design pattern because those two classes perform only one job each and do not need several instances for this software project to function properly. The <i>SortingTechnique</i> class will sort the list of shapes as its primary and only job. Therefore, having one instance will work the same as having several instances of this object, and so I decided to practice implementing the Singleton design pattern via this class. As well, <i>ShapeFactory</i>’s only job is to generate a random shape, and therefore this project only needs one “factory”/ random shape-generator. <i>ShapeFactory</i> also has the Factory pattern which also forms its relationships with the other classes. I feel this design pattern applies well to this software project because of the required “randomness” of shapes (random shapes generated with random dimensions; no pre-determined shapes). By implementing the Factory design pattern, my project will generate random shapes at runtime.

  <br>

  Figure 1 also details the four main OOD principles used:
  <ol>
    <li> Abstraction <br>
      In the classes, the fields and methods are private or protected, except for the public constructors. The visibility of private makes it so that the field or method cannot be accessed in other classes except the ones in which it is declared in. The visibility of protected means the field or method can be accessed by any class in the same package. There are setters and getters methods to access the value of the private fields.
    </li>
    <li> Encapsulation <br>
      In the classes, encapsulation is used to keep the data (fields and methods) in one class bundled. This is so that there is a restriction from accessing the data directly.
    </li>
    <li> Inheritance <br>
      The Rectangle, Square and Circle classes inherit from their respective parent class. Each child can reuse fields and methods that belong to the parent.
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
  
  My second diagram implements the Builder design pattern, where the <i>ShapeFactory</i> class supports the common building process of a “shape” and the <i>Shape</i> class is an interface with declared methods. Although this diagram allows the creation of different representations of “shapes” in the same constructive way, having an interface means the classes implementing it will each need complete concrete methods written separately. As <i>Square</i>, <i>Rectangle</i> and <i>Circle</i> implement from the <i>Shape</i> interface, they cannot use or reference from a parent class, and I feel this does not have the same level of OOD as the first diagram. In addition, the first diagram seems more user-friendly as viewers can clearly identify the object-oriented approach I took. Viewers can also clearly see which classes have the Singleton design pattern by identifying the private constructors, static references, and public <i>getInstance()</i> methods.

  <br>

  <h3><strong> IMPLEMENTATION </strong> </h3>

  The algorithm I used to sort the areas of the shapes in increasing order is a simple Selection sort algorithm. The algorithm for Selection sort sorts an array or list by continuously finding the minimum element from the list and places the element at beginning of the list. I decided to use Selection sort because it is very simple to implement and easy for viewers to understand.
  
  <br>
  
  I implemented this concept by going through the list of 6 shapes made and compared each of the shape’s areas. The list of 6 shapes is listed in increasing order by its x and y coordinate, such that at index 0 the shape’s coordinates are closest to the upper left corner, and at index 5 the shape’s coordinates are closest to the lower right corner. 
  
  <br>
  
  In each iteration, after finding the minimum, the algorithm will swap the x and y coordinates with the shape at the top of the sub list, such that the minimum shape will have its coordinates as close to the upper left corner as possible. Then, that minimum shape will also swap index positions with the shape at the top of the sub list, such that this will indicate this shape has been placed correctly and should not be looked at anymore.

  <br>
  
  I have implemented the first UML diagram as seen in Figure 1. As stated earlier in the report, a big reason is I feel the first UML diagram has a more user-friendly design. As well, I feel it will provide more flexibility in potential future expansions of this software project.

  <br>
  
  This implementation of the software project begins with the main method located in <i>ShapesGUI</i>. The main method only has one line `new ShapesGUI();`, which will instantiate a <i>ShapesGUI</i> object. The <i>ShapesGUI</i> constructor will build the GUI using javax.swing components, including two buttons: <i>Load shapes</i> and <i>Sort shapes</i>. When <i>Load shapes</i> button is clicked, <i>ShapesGUI</i> will create and instantiate a Singleton <i>ShapeFactory</i> object where it will generate six random <i>Shape</i> objects with random dimensions and a random colour associated with each shape, and <i>ShapesGUI</i> will store all six shapes inside an ArrayList. Determining what random shape is created is based on a random integer generated `int r = ran.nextInt(99);` If r ∈[0,32], a rectangle is created. If r ∈[33,65], a circle is created. If r ∈[66,98], a square is created. After the list is created, <i>ShapesGUI</i> will move to display the 6 shapes inside the list onto the interface. <i>ShapesGUI</i> will call the method `public void paintComponent (Graphics g)` inside <i>Shape</i>. Since each shape has the ability to draw itself, each shape will draw itself based on its respective x and y coordinates. The x and y coordinates are determined by the formula `i*75 + 100`, where <i>i</i> is the index of the list where the shape is located. That way, each shape will have an appropriate position inside the GUI dimensions of 600x600. When the <i>Sort shapes</i> button is clicked, <i>ShapesGUI</i> will instantiate a Singleton <i>SortingTechnique</i> object. When calling the <i>SortingTechnique</i> object, it will sort the list of shapes in increasing order by the value of their areas by switching around the x and y coordinates of each shape. Finally, <i>ShapesGUI</i> will again display the 6 shapes onto the interface by allowing each shape to draw itself.

  <br>
  
  In this software project, the tools I used <a href="https://www.eclipse.org/">Eclipse</a> IDE Version: 2021-06 (4.20.0), the Java programming language and JDK Version 11.0.9, Microsoft Word, the online tool <a href="https://www.diagrams.net/">diagrams.net</a> to draw the UML diagrams, <a href="https://github.com/">GitHub</a> to upload the necessary project files, and <a href="http://hypercam.uptodown.hyperionics.com/hc2/">HyperCam2</a> to capture my video demonstration.

  <br>
  
  The following are images of my interface when the code is executed.
  
  <br>
  
  ![fig3](https://user-images.githubusercontent.com/45662855/136064663-029dbc8b-f7b7-43c3-af38-188437c09a27.png)
  <h6 align="center"> Figure 3: An image of the freshly executed interface. </h6>
  
  <br>
  
  ![fig4](https://user-images.githubusercontent.com/45662855/136064712-94b91037-519d-44cd-87db-0495c834c88f.png)
  <h6 align="center"> Figure 4: An image of the interface when <i>Load shapes</i> button is clicked. </h6>
  
  <br>
  
  ![fig5](https://user-images.githubusercontent.com/45662855/136064740-8e4bd20a-1527-4399-a44f-6b2b7a44918f.png)
  <h6 align="center"> Figure 5: An image of the interface when <i>Sort shapes</i> button is clicked. </h6>
  
  <br>
  
  ![fig6](https://user-images.githubusercontent.com/45662855/136064769-4f3ec449-6624-4a4c-b190-0d1a35bcb559.png)
  <h6 align="center"> Figure 6: An image of the interface when <i>Sort shapes</i> button is clicked before <i>Load shapes</i> button. </h6>
  
  <br>
  
  <h3><strong> CONCLUSION </strong> </h3>
  
  Personally, what went well was coding the necessary specifics for the Java GUI. I have experience and used <i>javax.swing</i> before so I spent less time building the appropriate GUI and more time thinking about how I may go about implementing the design patterns.

  <br>

  In the beginning stages of this software project, I rushed through the UML drawing phase to get to the implementation phase because I was eager to start coding. After bouncing a bit back and forth between Eclipse and my UML diagram, I realized that my UML diagram lacked a lot of specificity in terms of methods, parameters and method signatures. I then went back to UML drawing phase to refine the drawings.
  
  <br>
  
  I learned a lot more about the different design patterns and why a specific design pattern works in different contexts. I usually learn better by doing instead of just reading about it, so after coding them I feel the idea of the design patterns has cemented into my brain.
  
  <br>

  My top three recommendations to ease the completion of the software project are:
  <ol>
    <li> Spend time on your UML diagrams ➜ for those who do not have a strong background in OOP, the UML diagram drawing phase can help you visualize OOP and OOD </li>
    <li> Look at as many examples for design patterns to get an idea as to which design patterns work in which contexts </li>
    <li> Find and try out a simple tutorial on simple shape drawing on a Java GUI without any add-ons (like buttons). Once you get familiar with how the GUI works, you can move on to learning how to draw 6 shapes, build buttons and clear the canvas when needed. </li>
  </ol>
  
</p>
