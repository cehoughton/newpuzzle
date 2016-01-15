import org.junit.*;
import static org.junit.Assert.*;


public class AppTest {

  @Test
  public void puzzleConverter_returnUpperCaseForbt_BT(){
    App app = new App();
    assertEquals("BT", app.puzzleConverter("bt"));
   }





 }
