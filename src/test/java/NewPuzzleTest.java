import org.junit.*;
import static org.junit.Assert.*;

public class NewPuzzleTest{

  @Test
  public void converter_returnLowerCaseForBOOT_boot(){
    Converter converter = new Converter("");


    assertEquals("boot", converter.puzzleConverter("BOOT"));
   }
 }


  //
//   @Test
//   public void scrabbleScoreCounter_return
// }
