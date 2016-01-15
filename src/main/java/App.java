import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args){
  }

public String puzzleConverter (String inputString) {

     String  puzzleOut = inputString.toUpperCase();

     puzzleOut = puzzleOut.replace("A", "-");

      return puzzleOut;

    }
  }
