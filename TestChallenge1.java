/**
 * Read and implement all of the TODO items in the main method, below.
 * 
 */
import org.asl.karelx.Squarebot;
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class TestChallenge1 {
	// TODO Complete the provided Sentry class by implementing its patrol() method

	public static void main(String[] args) {
		// TODO Load a default map 
		Display.setSize(10,10);
		// TODO Create a Squarebot and have it place beepers at the corners of a rectangle
		//   	with bottom right corner at (9, 3) and sized for 5 beepers on each side (see picture)
		Squarebot placer = new Squarebot();
		placer.move();
		placer.move();
		placer.turnRight();
		placer.move();
		placer.move();
		placer.move();
		placer.move();
		placer.move();
		placer.move();
		placer.move();
		placer.move();
		placer.turnLeft();
		placer.layCorners(5);
		// TODO Create a Sentry and have it patrol clockwise around the beepers, indefinitely
		Sentry guard = new Sentry(9,3);
		Sentry.Patrol();
		
		
	}

}
