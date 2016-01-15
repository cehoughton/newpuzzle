import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args){
  }
<<<<<<< HEAD

public String puzzleConverter (String inputString) {

     String  puzzleOut = inputString.toUpperCase();


      return puzzleOut;

    }
  }
=======
  //  String layout = "templates/layout.vtl";

  //get("/form", (request,response) -> {
    //HashMap model = new HashMap();

  //  model.put("templates/form.vtl");
  //  return new ModelAndView(model, layout);
//  }, new VelocityTemplateEngine());

  //get("/output", (request, response)  -> {
    //HashMap model = new HashMap();
    //String input = request.queryParams("S_word");



    //return new ModelAndView(model, layout);
  //}, new VelocityTemplateEngine());

public static String puzzleConverter (String input) {
     String  wordPuzzle = input.replace("a", "-");
    
     
      return wordPuzzle;

    }
  }









>>>>>>> 227101e41e42542545ce039cd9d7cab04b82a7e2
