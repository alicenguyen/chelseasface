
/*
* Name: Chelsea Pattee <<< --- Replace with Your Name
* Login: cs11fhc <<< --- Use your cs11f-specific account name
* Date: October 9, 2014
* File: CS11Turtle.java
* Sources of Help: ... (for example: names of people, books, websites, etc.)
*
* Describe what this program does here.
*/
import turtleClasses.*;
import java.awt.Color;
/*
* Name: Class name
* Purpose: Briefly describe the purpose of this class
*/
public class CS11Turtle extends Turtle
{
private final static int CHAR_WIDTH = 40;
private final static int LINE_HEIGHT = 80;
private final static int CHAR_PADDING = 40;
private final static int LINE_PADDING = 40;
private final static int LINE_SPACE = LINE_HEIGHT + LINE_PADDING;
private final static int CHAR_SPACE = CHAR_WIDTH + CHAR_PADDING;
private final static int START_X_1 = 30; // starting x offset for line 1
private final static int START_X_2 = 70; // starting x offset for line 2
private final static int START_X_3 = 150; // starting x offset for line 3
private final static int START_Y = 38; // starting y offset
private final static int PEN_WIDTH = 10;
private final static Color PEN_COLOR = Color.GREEN;
private final static int WORLD_WIDTH = 600;
private final static int WORLD_HEIGHT = 400;
/*
* Delay between turtle actions (turns, moves) in milliseconds.
* 1000 = 1 sec. so 100 = 0.1 sec.
*/
private final static int DELAY = 100; //change back to 100
/*
* Name: Constructor name
* Purpose: Briefly describe the purpose of this constructor
* Parameters: List all parameters and their types and what they represent.
* If no parameters, just state None.
*/
public CS11Turtle(World w, int delay){
super(w, delay);
}
/*
* Name: drawC
* Purpose: draw the letter C
* Parameters: int x and int y
* Return: void
*/
private void drawC(int x, int y)
{
penUp();
moveTo(x, y); // always start in upper left corner of this char block
turnToFace(getXPos() + 1, getYPos()); // face right
penDown();
forward(40);
penUp();
backward(40);
turnRight();
penDown();
forward(80);
turnLeft();
forward(40);
}
/*
* Name: drawS
* Purpose: draw the letter S
* Parameters: int x and int y
* Return: void
*/
private void drawS(int x, int y)
{
penUp();
moveTo(x, y);
turnToFace(getXPos() + 1, getYPos());
penDown();
forward(40);
penUp();
backward(40);
turnRight();
penDown();
forward(40);
turnLeft();
forward(40);
turnRight();
forward(40);
turnRight();
forward(40);
}
/*
* Name: drawOne
* Purpose: draws the number "1" 
* Parameters: int x, int y. Specifies x,y coordinates for drawing canvas
* Return: void 
*/
private void drawOne(int x, int y)
{
penUp();
moveTo(x, y);
turnToFace(getXPos() + 1, getYPos());
forward(20);
turn(135);
penDown();
forward(28);
backward(28);
turn(-135);
turnRight();
forward(80);
turnRight();
forward(20);
backward(40);
}

/*
* Name: drawOne
* Purpose: Briefly describe the purpose of this method
* Parameters: List all parameters and their types and what they represent.
* If no parameters, just state None.
* Return: Specify the return type and what it represents.
* If no return value, just specify void.
*/
private void drawF(int x, int y)
{
penUp();
moveTo(x, y);
turnToFace(getXPos() + 1, getYPos());
penDown();
forward(40);
penUp();
backward(40);
turnRight();
penDown();
forward(40);
turnLeft();
forward(40);
backward(40);
turnRight();
forward(40);
}

/*
* Name: drawOne
* Purpose: Briefly describe the purpose of this method
* Parameters: List all parameters and their types and what they represent.
* If no parameters, just state None.
* Return: Specify the return type and what it represents.
* If no return value, just specify void.
*/
private void drawH(int x, int y)
{
penUp();
moveTo(x, y); // always start in upper left corner of this char block
turnToFace(getXPos() + 1, getYPos()); // face right
turnRight();
penDown();
forward(80);
backward(40);
turnLeft();
forward(40);
turnLeft();
forward(40);
backward(80);
}


/*
* Name: drawOne
* Purpose: Briefly describe the purpose of this method
* Parameters: List all parameters and their types and what they represent.
* If no parameters, just state None.
* Return: Specify the return type and what it represents.
* If no return value, just specify void.
*/
private void drawE(int x, int y)
{
penUp();
moveTo(x, y); // always start in upper left corner of this char block
turnToFace(getXPos() + 1, getYPos()); // face right
penDown();
forward(40);
penUp();
backward(40);
turnRight();
penDown();
forward(80);
turnLeft();
forward(40);
turnLeft();
penUp();
forward(40);
turnLeft();
penDown();
forward(40);
}

/*
* Name: drawI
* Purpose: Briefly describe the purpose of this method
* Parameters: List all parameters and their types and what they represent.
* If no parameters, just state None.
* Return: Specify the return type and what it represents.
* If no return value, just specify void.
*/
private void drawI(int x, int y)
{
penUp();
moveTo(x, y);
turnToFace(getXPos() + 1, getYPos());
penDown();
forward(40);
backward(20);
turnRight();
forward(80);
turnRight();
forward(20);
backward(40);
}

/*
* Name: drawN
* Purpose: Briefly describe the purpose of this method
* Parameters: List all parameters and their types and what they represent.
* If no parameters, just state None.
* Return: Specify the return type and what it represents.
* If no return value, just specify void.
*/
private void drawA(int x, int y)
{
penUp();
moveTo(x, y);
turnToFace(getXPos() + 1, getYPos()); //face right
forward(10);
//turnLeft();
turn(105);
penDown();
forward(90);
backward(90);
turn(-30);
forward(90);
}


/*
* Name: drawT
* Purpose: Briefly describe the purpose of this method
* Parameters: List all parameters and their types and what they represent.
* If no parameters, just state None.
* Return: Specify the return type and what it represents.
* If no return value, just specify void.
*/
private void drawL(int x, int y)
{
penUp();
moveTo(x, y);
turnToFace(getXPos() + 1, getYPos());
penDown();
forward(40);
backward(20);
turnRight();
forward(80);
}


/*
* Name: drawR
* Purpose: Briefly describe the purpose of this method
* Parameters: List all parameters and their types and what they represent.
* If no parameters, just state None.
* Return: Specify the return type and what it represents.
* If no return value, just specify void.
*/
private void drawR(int x, int y)
{
penUp();
moveTo(x, y);
turnToFace(getXPos() + 1, getYPos());
turnRight();
penDown();
forward(80);
backward(80);
turnLeft();
forward(40);
turnRight();
forward(40);
turnRight();
forward(40);
turn(225);
forward(56);
}

/*
* Name: drawTwo
* Purpose: draw the letter S
* Parameters: int x and int y
* Return: void
*/
private void drawTwo(int x, int y)
{
penUp();
moveTo(x, y);
turnToFace(getXPos() + 1, getYPos());
penDown();
forward(40);
turnRight();
forward(40);
turnRight();
forward(40);
turnLeft();
forward(40);
turnLeft();
forward(40);
}

/*
* Name: drawZero
* Purpose: draw the number 0 
* Parameters: int x and int y
* Return: void
*/
private void drawZero(int x, int y)
{
  penUp();
  moveTo(x, y);
  turnToFace(getXPos() + 1, getYPos());
  turnRight();
  penDown();
  forward(80);
  turnLeft();
  forward(40);
  turnLeft();
  forward(80);
  turnLeft();
  forward(40);
}

/*
* Name:drawFour 
* Purpose: draw the number 4 
* Parameters: int x and int y
* Return: void
*/
private void drawFour(int x, int y)
{
penUp();
moveTo(x, y);
turnToFace(getXPos() + 1, getYPos());
forward(40);
turnRight();
penDown();
forward(80);
backward(50);
turnRight();
forward(40);
turnRight();
forward(30);
}

/*
* Name: drawSwirl
* Purpose: draw a decoration
* Parameters: int x and int y
* Return: void
*/
private void drawSwirl(int x, int y)
{
penUp();
moveTo(x, y);
turnToFace(getXPos() + 1, getYPos());
forward(40);
turnRight();
forward(40);
penDown();
forward(10);
turnRight();
forward(10);
turnRight();
forward(20);
turnRight();
forward(20);
turnRight();
forward(30);
turnRight();
forward(45);
turnRight();
forward(50);
turnRight();
forward(70);
turnRight();
forward(90);
turnRight();
forward(400);
}
/* TODO: Add any remaining methods to draw all the other characters */
/*
* Name: Method name
* Purpose: Briefly describe the purpose of this method
* Parameters: List all parameters and their types and what they represent.
* If no parameters, just state None.
* Return: Specify the return type and what it represents.
* If no return value, just specify void.
*/
public static void main(String [] args)
{
int startX1 = START_X_1, // starting x offset for line 1
startX2 = START_X_2, // starting x offset for line 2
startX3 = START_X_3; // starting x offset for line 3
int startY = START_Y; // starting y offset
int x, y;
World w = new World(WORLD_WIDTH, WORLD_HEIGHT);
CS11Turtle myTurtle = new CS11Turtle(w, DELAY);
myTurtle.setPenWidth(PEN_WIDTH);
myTurtle.setPenColor(PEN_COLOR);
myTurtle.drawC(x = startX1, y = startY);
myTurtle.drawS(x += CHAR_SPACE, y);
myTurtle.drawOne(x += CHAR_SPACE, y);
myTurtle.drawOne(x += CHAR_SPACE, y);
myTurtle.drawF(x += CHAR_SPACE, y);
myTurtle.drawH(x += CHAR_SPACE, y);
myTurtle.drawC(x += CHAR_SPACE, y);
myTurtle.drawF(x = startX2, y = startY+120);
myTurtle.drawA(x += CHAR_SPACE, y);
myTurtle.drawL(x += CHAR_SPACE, y);
myTurtle.drawL(x += CHAR_SPACE, y);
myTurtle.drawTwo(x = startX3, y = startY+240);
myTurtle.drawZero(x += CHAR_SPACE, y);
myTurtle.drawOne(x += CHAR_SPACE, y);
myTurtle.drawFour(x += CHAR_SPACE, y);
myTurtle.drawSwirl(x += CHAR_SPACE, y);
/* TODO: Complete this main method to draw the remaining text */
}
} // End of public class CS11Turtle extends Turtle

