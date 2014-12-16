import java.lang.Object;
import edu.fcps.karel2.Item;
import edu.fcps.karel2.Robot;
import org.asl.karelx.Uberbot;
import org.asl.karelx.Squarebot;

public class TestChallenge1 {
	
	public static void main(String[] args) {
		 Display.setSize(10, 10);
		 
       Uberbot jordan = new Squarebot(9, 3, Display.NORTH, INFINITY);
       Uberbot lisa = new Sentry (4, 4);
       
       jordan.layCorners(5);
       lisa.patrol();
		 
	}

}
