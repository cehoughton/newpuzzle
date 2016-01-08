import org.junit.*;
import static org.junit.Assert.*;

public class NewPuzzleTest{
  @Test
  public void puzzleConverter_returnLowerCaseForBOOT_boot(){
    PuzzleConverter PuzzleConverter = new PuzzleConverter();
    String word = "boot";
    assertEquals(word, PuzzleConverter.puzzleConverter("BOOT"));
   }
 }


  //
//   @Test
//   public void scrabbleScoreCounter_return
// }
