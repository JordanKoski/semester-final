import java.lang.Object;
import edu.fcps.karel2.Item;
import edu.fcps.karel2.Robot;
import org.asl.karelx.Uberbot;
import org.asl.karelx.Squarebot;

public class TestChallenge2 {

	public static void main(String[] args) {
		   Display.openWorld("maps/pasture.map");
         Display.setSize(15, 15);
         Display.setSpeed(7);
         
         Uberbot jordan = new Squarebot(9, 3, Display.NORTH, INFINITY);

      // TODO Load the "pasture" map at size 15 by 15
		// TODO Create an instance of a Horse inside the pasture
		// TODO Have the horse wander for 36 steps with a timer of 7
		// TODO Have the horse explode()
	}

}
