import org.fluentlenium.adapter.FluentTest;
import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;
import static org.fluentlenium.assertj.FluentLeniumAssertions.assertThat;

public class AppAssertionTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

   @ClassRule
   public static ServerRule server = new ServerRule();

   @Test
   public void rootTest() {
     goTo("http://localhost:4567");
   assertThat(pageSource()).contains("newpuzzle");



  //  @Test public void puzleCreatedTest() {
  //    goTo("http://localhost:4567/");
  //    fill("#tag").with("inputString");
  //    submit(".btn");
  //   assertThat(pageSource()).contains("inputString");
     //This tests if a tagged fill is outputing correctly with the user input in the right place.
   }
   }
