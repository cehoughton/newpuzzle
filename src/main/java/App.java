import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args){
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

   get("/", (request, response) -> {
     Map<String, Object> model = new HashMap<String, Object>();
     model.put("template", "templates/index.vtl");

     return new ModelAndView(model, layout);
  }, new VelocityTemplateEngine());

  get("/output", (request, response) -> {
    Map<String, Object> model = new HashMap<String, Object>();
    model.put("template", "templates/output.vtl");

    String inputString = request.queryParams("word");
    String puzzleOut = puzzleConverter(inputString);

    model.put("word", inputString);
    model.put("pword", puzzleOut);
    return new ModelAndView(model, layout);
 }, new VelocityTemplateEngine());



}




public static String puzzleConverter (String inputString) {

     String  puzzleOut = inputString.toUpperCase();

     puzzleOut = puzzleOut.replace("A", "-");
     puzzleOut = puzzleOut.replace("E", "-");
     puzzleOut = puzzleOut.replace("I", "-");
     puzzleOut = puzzleOut.replace("O", "-");
     puzzleOut = puzzleOut.replace("U", "-");

      return puzzleOut;

    }
  }
