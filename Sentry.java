

import org.asl.karelx.Uberbot;

/**
 * Patrols an area defined by four beepers.
 * 
 */
public class Sentry extends Uberbot {
    public Sentry(){
    super(int x, int y, Display.NORTH, 0);
}
    /**
     * Patrol an area in a clockwise direction.  
     * 
     * Move forward until next to a beeper then turn right.  Repeat indefinitely.
     *
     */
    public static void Patrol{
    boolean on = true;
        while(on == true){
            move();
            move();
            move();
            move();
            move();
            turnLeft();
            move();
            move();
            move();
            move();
            move();
            turnLeft();
            move();
            move();
            move();
            move();
            move();
            turnLeft();
            move();
            move();
            move();
            move();
            move();
        }
    }
    
    public void patrol() {
        // TODO You implement this method.
    }
}
