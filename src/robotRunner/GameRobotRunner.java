package robotRunner;

import java.awt.AWTException;
 

public class GameRobotRunner
{
	
	public static int WindowRunner = 0;
	public static int WindowTeamLeader = 1;
	
  
 
  public static void main(String[] args) throws AWTException
  {
	  GameRobot robot = new GameRobot();

	    robot.leftClick(207, 754);
	    robot.delay(500);
	    robot.leftClick(207, 554);
		
		robot.delay(2000);

		try {
			if (robot.screenNpcDialogueVisible()) {
				System.out.println("SUCCESS");
			} else {
				System.out.println("NotVisible");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
				
//	  System.out.println("click 1");
//		robot.mouseMove(780, 332);
//		robot.delay(1000);
//	    robot.mousePress(InputEvent.BUTTON1_MASK);
//		robot.mouseRelease(InputEvent.BUTTON1_MASK);
//		
//		
//		robot.delay(2000);
//		
//		System.out.println("click 2");
//		robot.mouseMove(780, 150);
//		robot.delay(1000);
//	    robot.mousePress(InputEvent.BUTTON1_MASK);
//		robot.mouseRelease(InputEvent.BUTTON1_MASK);
  }

}
