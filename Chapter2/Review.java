

/* 

UNDERSTANDING CONCEPTS



1)
  Models help programmer better visualize and understand there work flow and how they will go about solving a problem. The 2 types of models are flowcharts and algorithms which can be lebeled with squares, slanted squares, triangles, and dimonds all used for different puropses 

2)
  A class is a blueprint of an object. You can think of a class as a concept, and the object is the embodiment of that concept and an instance of the class. You need to have a class before you can create an object. So, let's say you want to use a person in your program. You want to be able to describe the person and have the person do something. A class called 'person' would provide a blueprint for what a person looks like and what a person can do. To actually use a person in your program, you need to create an object. You use the person class to create an object of the type 'person.' Now you can describe this person and have it do something. Classes are very useful in programming. Consider the example of where you don't want to use just one person but 100 people. Rather than describing each one in detail from scratch, you can use the same person class to create 100 objects of the type 'person.' You still have to give each one a name and other properties, but the basic structure of what a person looks like is the same.

3)
  Association is when there is a relationship between two objects that interact with one another such as ordering something online on amazon then having to change all sorts of things such as stock, packaging getting shipped, cards being charged all interacting with one another to create a complete and working system. Composition is another type of relationship and is when there is sub objects of the parent object. In this case you would be able to have one parent object and a few child objects that are all slightly different but are what make up the parent object. A good example would be a computer, a computer is not composed of one big piece that works all on its own. It requires other necessary parts for it to work such as the CPU, memory, keyboard, mouse, monitor, and much more. These would all be  examples of child objects which is actually what makes the parent object which would be the whole computer. The more detail you want your the more you would break down your objects.

4)
  Language keywords and punctuation and the order of terms would be called syntax,it is the structure or form of expressions, statements, and program units but Semantics is the meaning of those expressions, statements, and program units. Semantics follow directly from syntax. Syntax refers to the structure/form of the code that a specific programming language specifies but Semantics deal with the meaning assigned to the symbols, characters and words.

5)
  Applets are small Java programs that are designed to be included with the HTML container and web document. They require a Java-enabled web browser for execution. Applets do not require a main function for its execution. Applets can only access the browser specific services. They don’t have access to the local system. Applets cannot execute programs from the local machine. Applications are just like Java programs that can be executed independently without using the web browser. Application programs requires a main function for its execution. Java application programs have the full access to the local file system and network. Applications can access all kinds of resources available on the system. Applications can execute the programs from the local system.



APPLYING TECHNOLOGY SKILLS

1)
  public class Apple{
    //^this is the class

    Apple a = new Apple();
    Apple b = new Apple();
    Apple c = new Apple();
    //^ these are the objects
  }


2)
  public class Apple{
    private int color;
    private int type;
    //^ both color and type would be examples of fields

    public int getColor(){
      return color;
    }
    //^ getColor() is a method

    public int getType(){
      return type;
    }
    //^ getType() is another method
  }


3)
  public class Apple extends Fruit{
    //^ when creating the class the 'extends' key word is the sepcialization which allows you to inherit the parent component and make it more detailed

    private Stem stem;
    private Peel peel;
    private Core core;

    private int size = Orange.size();
    //^ "Orange" this is an example of assosiation as it interacts with another class. The ".size()" is the composition as the current class has direct access to it.

    private int Type();

    public int getType(){
      return type;
    }
  }

4)
  x = a + b;              //good
  x equals a plus b;      //syntax error
  x = a - b;              //semantic error
  c = b + a;              //symantic error
  x = (b + a);            //good
  a + b = x;              //syntax error
  x = a * b;              //semantic error
  assign (a + b) to x;    //syntax error


5)
  <HTML>
    <HEAD>
      <TITLE>Java Programming ins Fun!</TITLE>
      //^ the title tag indicates that there will be title at the top saying 'Java Programming is Fun!'
    </HEAD>

    <BODY>
    //^ body tag indicates that there is a main part to the applet
      <APPLET CODE="example.class" WIDTH=320 HEIGHT=200></APPLET>
      //^ applet tag indiactes it is a java applet and not an application

      //^ the part that says CODE="example.class" mean it will be running a file called example

      // the WIDTH and HEIGHT indicate the dimentions of the applet GUI in pixel dimensions
    </BODY>
  </HTML>


*/
