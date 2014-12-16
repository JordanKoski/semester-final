import org.asl.karelx.Uberbot;

public class Sentry extends Uberbot {

	public Sentry()
      {
         super (1, 1, Display.NORTH, Display.INFINITY);
      }
      public void patrol()
      {
      if(!nextToABeeper());
      move();
      else if(turnRight());
   }
}
