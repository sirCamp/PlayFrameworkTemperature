import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.*;

import play.mvc.*;
import play.test.*;
import play.data.DynamicForm;
import play.data.validation.ValidationError;
import play.data.validation.Constraints.RequiredValidator;
import play.i18n.Lang;
import play.libs.F;
import play.libs.F.*;
import play.twirl.api.Content;

import static play.test.Helpers.*;
import static org.fest.assertions.Assertions.*;


/**
*
* Simple (JUnit) tests that can call all parts of a play app.
* If you are interested in mocking a whole application, see the wiki for more details.
*
*/
public class ApplicationTest {

    @Test
    public void simpleCheck() {
        int a = 1 + 1;
        assertThat(a).isEqualTo(2);
    }

    @Test
    public void renderTemplate() {
        Content html = views.html.index.render("TemperatureMonitor");
        assertThat(contentType(html)).isEqualTo("text/html");
        assertThat(contentAsString(html)).contains("TemperatureMonitor");
    }
    
    @Test
    public void javascriptAssets(){
    	
    	Content html = views.html.index.render("TemperatureMonitor");
        
    	assertThat(contentType(html)).isEqualTo("text/html");
        assertThat(contentAsString(html)).contains("javascripts/jquery-2.1.3.min.js");
        assertThat(contentAsString(html)).contains("javascripts/materialize.min.js");
        assertThat(contentAsString(html)).contains("javascripts/main.js");
        
        assertThat(contentAsString(html)).contains("javascripts/excanvas.min.js");
        assertThat(contentAsString(html)).contains("javascripts/jquery.flot.min.js");
        assertThat(contentAsString(html)).contains("javascripts/jquery.flot.time.min.js");
        assertThat(contentAsString(html)).contains("javascripts/jquery.flot.resize.min.js");
    }
    
    @Test
    public void stylesheetAssets(){
    	
    	Content html = views.html.index.render("TemperatureMonitor");
        
    	assertThat(contentType(html)).isEqualTo("text/html");
    	assertThat(contentAsString(html)).contains("stylesheets/materialize.min.css");
    	assertThat(contentAsString(html)).contains("stylesheets/main.css");
    	assertThat(contentAsString(html)).contains("stylesheets/font-awesome.min.css");	
    }


}
