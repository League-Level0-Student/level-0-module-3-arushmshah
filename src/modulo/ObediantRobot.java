package modulo;

import org.jointheleague.graphical.robot.Robot;

public class ObediantRobot {
public static void main(String[] args) {
	Robot r2d2 = new Robot();
}
void drawSquare() {
Robot r2d2 = new Robot();
r2d2.setSpeed(100);
r2d2.setPenWidth(5);
r2d2.penDown();
r2d2.move(150);
r2d2.turn(-90);
r2d2.move(150);
r2d2.turn(-90);
r2d2.move(150);
r2d2.turn(-90);
r2d2.move(150);
r2d2.turn(-90);
}
void drawTriangle() {
	Robot r2d2 = new Robot();
	r2d2.setSpeed(100);
	r2d2.turn(90);
	r2d2.penDown();
	r2d2.move(175);
	r2d2.turn(-135);
	r2d2.move(175);
	r2d2.turn(75);
	r2d2.turn(180);r2d2.move(175);
}
void drawCircle() {
	
}
}
