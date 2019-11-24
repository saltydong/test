import static org.junit.Assert.*; 
import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Flower;

import java.awt.Color;
public class JumpBugTest {
   private static JumpBug jumpone = new JumpBug();

    @org.junit.Test 
    public void testInitialColor() throws Exception {
       Color color = jumpone.getColor();
       assertEquals(color, Color.YELLOW); 
    }

    @org.junit.Test
    public void testCanJump() throws Exception{
        boolean flat = jumpone.canMove();
        boolean result = false;
        if(jumpone.str == "can")
            result = true;
        assertEquals(flat,result);

    }

    @org.junit.Test
    public void testact() throws Exception {
        loc = getLocation();
        jumpone.act();
        next = getLocation();
        if(jumpone.str == "cannot")
            assertEquals(loc,next);
        else{
            int deltaX = next.getRow() - loc.getRow();
            int deltaY = next.getCol() - loc.getCol();
            if(deltaX < 0)
                deltaX *= -1;
            if(deltaY < 0)
                deltaY *= -1;
            assertEquals(deltaX+deltaY,2);
        }
    }

}
