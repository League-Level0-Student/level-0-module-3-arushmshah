
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot R2D2 = new Robot();
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.
R2D2.setX(55);
R2D2.setY(55);
		// 2. Make the robot draw a star shape. Hint: 144.
R2D2.penDown();
R2D2.setSpeed(35);
R2D2.setPenColor(Color.YELLOW);
for (int i = 0; i < 5 ; i++) {
	R2D2.move(30);
	R2D2.turn(144);
}

		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/walkOfFame
		 
		 
		 
		 * Hint: The distance between stars is 50.
		 */

R2D2.penUp();
R2D2.turn(120);
R2D2.move(135);
R2D2.setSpeed(35);
R2D2.penDown();
R2D2.setPenColor(Color.YELLOW);
for (int i = 0; i < 5 ; i++) {
	R2D2.move(55);
	R2D2.turn(144);
}
R2D2.penUp();
R2D2.move(135);
R2D2.setSpeed(35);
R2D2.penDown();
R2D2.setPenColor(Color.YELLOW);
for (int i = 0; i < 5 ; i++) {
	R2D2.move(80);
	R2D2.turn(144);
}
R2D2.penUp();
R2D2.move(135);
R2D2.setSpeed(35);
R2D2.penDown();
R2D2.setPenColor(Color.YELLOW);
for (int i = 0; i < 5 ; i++) {
	R2D2.move(105);
	R2D2.turn(144);

	}

R2D2.penUp();
R2D2.move(135);
R2D2.setSpeed(35);
R2D2.penDown();
R2D2.setPenColor(Color.YELLOW);
for (int i = 0; i < 5 ; i++) {
	R2D2.move(130);
	R2D2.turn(144);
	}
R2D2.penUp();
R2D2.move(60);
}
}