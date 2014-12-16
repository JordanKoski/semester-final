import org.asl.karelx.Farmer;


public class BeepFarmer extends Farmer {

	 public BeepFarmer()
      {
         super (x, y, Display.NORTH);
      }

	public void reap(int width, int height) 
   {
		putBeeper();
      if (frontIsClear());
      {
      move();
      putBeeper();
      }
      else if (!frontIsClear && !leftIsClear());
      {
      turnRight();
      move();
      turnRight();
      putBeeper();
      }
      else if (!frontIsClear && !rightIsClear());
      turnLeft();
      move();
      turnLeft();
      putBeeper();
	   }
	
	public void sow(int width, int height) {
		int startX = this.getX();
		int startY = this.getY();
		for (int i = 0; i< width; i++) {
			for (int j = 0; j<height; j++) {
				teleport(startX+i, startY+j);
				if (this.hasBeepers()) {
					putBeeper();
				}
			}
		}
	}
}
