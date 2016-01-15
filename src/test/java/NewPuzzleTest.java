import org.junit.*;
import static org.junit.Assert.*;

public class NewPuzzleTest{

  @Test
  public void converter_returnLowerCaseForBOOT_boot(){
    NewPuzzle newPuzzle = new NewPuzzle();


    assertEquals("boot", newPuzzle.puzzleConverter("BOOT"));
   }

  @Test
  public void converter_returnDashForA_Dash(){
  	NewPuzzle newPuzzle = new NewPuzzle();

  	assertEquals("-", newPuzzle.puzzleConverter("A"));
  }
 }


  //
//   @Test
//   public void scrabbleScoreCounter_return
// }
