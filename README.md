# Swing hands-on

Welcome to the repository containing examples used in the Java Desktop Development with Swing classes taught by Rodrigo Martins Pagliares in the Computer Science undergraduate course at UNIFAL-MG, Brazil. 

I thinnk this repository is a valuable resource for students who want to review class examples or further explore Swing development. I hope you find it helpful and informative!


## Outline

### Part I - First steps with Swing
<p><a href="https://github.com/pagliares/swing-hands-on#01---first-jframe-composition">01 - First JFrame - Composition</a></p>
<p><a href="https://github.com/pagliares/swing-hands-on#02---first-jframe-inheritance">02 - Second JFrame - Inheritance</a></p>
<p><a href="https://github.com/pagliares/swing-hands-on#03---first-jpanel">03 - JPanel example</a></p>
<p><a href="https://github.com/pagliares/swing-hands-on#04---one-more-jpanel-example">04 - One more JPanel example</a></p>

## Part II - Layout managers
<p><a href="https://github.com/pagliares/swing-hands-on#05---flowlayout-example">05 - FlowLayout example</a></p>
<p><a href="https://github.com/pagliares/swing-hands-on#06---borderlayout-example">06 - BorderLayout example</a></p>



## Part I - First steps with Swing

### 01 - First JFrame (Composition)

- <small><a href="https://github.com/pagliares/swing-hands-on#outline">Back to Outline</a></small>
- <strong>Project source:</strong> first-jframe

<strong>Summary</strong>

This example creates a basic GUI window using the Swing framework. It is organized into a single class called PrimeiraJanela, which contains a single method called main().

The main() method is the entry point of the program and is the first method to be executed when the program is run. It creates a new JFrame object and sets its title to "Primeira janela" using the constructor.

Next, it sets the size of the window using the setSize() method, which takes two arguments: the width and height of the window in pixels. In this case, the width is set to 300 pixels and the height is set to 250 pixels.

Finally, the program sets the visibility of the window to true using the setVisible() method, which shows the window on the screen.

In summary, this code creates a basic Swing GUI window with a specified size and title and makes it visible on the screen. It's a simple but essential starting point for creating more complex GUI applications in Java.

<p align="center"> <img src="Images/First_JFrame.png" width=291 height="246" alt="Example output" title="First JFrame"></p>

### 02 - First JFrame (Inheritance)

- <small><a href="https://github.com/pagliares/swing-hands-on#outline">Back to Outline</a></small>
- <strong>Project source:</strong> second-jframe

<strong>Summary</strong>

This example is identical to the first except that this time I use inheritance instead of composition.

### 03 - First JPanel  

- <small><a href="https://github.com/pagliares/swing-hands-on#outline">Back to Outline</a></small>
- <strong>Project source:</strong> panel-example

<strong>Summary</strong>

This Java Swing example creates a window with a red panel inside of it.

First, the necessary classes are imported: Color and JFrame from java.awt package and JPanel from javax.swing package.

Then, the ExemploPainel class is defined, which has a JFrame and a JPanel as its fields. The constructor takes a string parameter titulo which is used as the title of the JFrame. In the constructor, a new JFrame is created with the provided title and a new JPanel is created.

The configurarJanela method sets up the window. First, the size of the window is set to 300 x 200 using jFrame.setSize(300, 200). Then, the layout is disabled by calling jFrame.setLayout(null). The size of the panel is set to 100 x 100 using jPanel.setSize(100, 100) and the background color of the panel is set to red using jPanel.setBackground(Color.RED).

Finally, the panel is added to the frame using jFrame.add(jPanel) and the window is made visible by calling jFrame.setVisible(true).

The main method creates an instance of the ExemploPainel class, passing in the title "Adicionado um painel", and calls the configurarJanela method on that instance to display the window.

<p align="center"> <img src="Images/Exemplo_Painel.png" width=291 height="246" alt="Example output" title="Panel example"></p>


### 04 - One more JPanel example 

- <small><a href="https://github.com/pagliares/swing-hands-on#outline">Back to Outline</a></small>
- <strong>Project source:</strong> panel-demo-example

<strong>Summary</strong>

This is a Java Swing code that creates a window with two panels, each panel containing three buttons.

The first line declares a public class called ExemploPainelDemo. The second line declares a static main method, which is the entry point for the program. The third line creates a new JFrame object, which is the main window of the program. It has a title of "Demo".

The fourth line sets the size of the JFrame to 350 pixels wide and 250 pixels tall. The fifth line sets the layout of the JFrame to a GridLayout with 2 rows and 1 column. This means that there will be two panels stacked on top of each other.

The sixth line begins a for loop that will create two panels. The seventh line creates a new JPanel object, which is a container for the buttons. The eighth line sets the background color of the panel to orange if i is 0, or cyan if i is 1.

The ninth line begins a for loop that will create three buttons and add them to the panel. The text of each button is "Button" followed by the value of j. The tenth line adds the panel to the JFrame.

The eleventh line ends the for loop that creates the panels. The twelfth line sets the JFrame to be visible.

Overall, this code creates a simple Swing program with a window containing two panels, each panel containing three buttons. The background color of the first panel is orange, while the background color of the second panel is cyan.

<p align="center"> <img src="Images/Exemplo_Painel_Demo.png" width=291 height="246" alt="Example output" title="One more panel example"></p>

## Part II - Layout managers

### 05 - FlowLayout example 

- <small><a href="https://github.com/pagliares/swing-hands-on#outline">Back to Outline</a></small>
- <strong>Project source:</strong> flow-layout-example

<strong>Summary</strong>

This Java code creates a simple window with three buttons using the FlowLayout layout manager.

The FlowLayoutExemplo class defines a constructor that initializes the JFrame object with the title passed as an argument and creates three JButton objects.

The configuraJanela() method sets the JFrame layout to FlowLayout and adds the three buttons to it. Then it packs the components to calculate the preferred size of the window and makes it visible.

The main method creates an instance of FlowLayoutExemplo and calls its configuraJanela() method to display the window with the three buttons.

Overall, this code demonstrates the use of the FlowLayout layout manager to arrange components in a single row, wrapping them to the next line if necessary.

<p align="center"> <img src="Images/Flow_Layout_Example.png" width="483" height="99" alt="Example output" title="FlowLayout"></p>


### 06 - BorderLayout example 

- <small><a href="https://github.com/pagliares/swing-hands-on#outline">Back to Outline</a></small>
- <strong>Project source:</strong> border-layout-example

<strong>Summary</strong>

This Java code creates a simple window with five buttons using the BorderLayout layout manager.

The BorderLayoutExemplo class defines a constructor that initializes the JFrame object with the title passed as an argument and creates five JButton objects for the different regions of the border layout.

The configuraJanela() method sets the JFrame layout to BorderLayout and adds the five buttons to their respective positions. The BorderLayout manager divides the container into five areas: North, South, East, West, and Center. The JButton objects are added to their respective positions by calling add() method with the button and the corresponding position constant from the BorderLayout class.

The setSize() method sets the size of the window and the setVisible() method makes the window visible.

The main method creates an instance of BorderLayoutExemplo and calls its configuraJanela() method to display the window with the five buttons.

Overall, this code demonstrates the use of the BorderLayout layout manager to arrange components in five regions of a container.

<p align="center"> <img src="Images/Border_Layout_Example.png" width="355" height="232" alt="Example output" title="BorderLayout"></p>
