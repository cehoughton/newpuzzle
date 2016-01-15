import org.junit.*;
import static org.junit.Assert.*;


public class AppTest {

  @Test
  public void puzzleConverter_returnUpperCaseForbt_BT(){
    App app = new App();
    assertEquals("BT", app.puzzleConverter("bt"));
   }

   @Test
 		public void puzzle_returnDashForA_B_Dash_T() {
 		  App app = new App();
 		  assertEquals("B-T", app.puzzleConverter("BAT"));
 		  }




 }
