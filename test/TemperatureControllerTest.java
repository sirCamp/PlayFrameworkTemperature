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
import play.libs.Json;
import play.libs.F.*;
import play.twirl.api.Content;
import controllers.TemperatureController;
import static play.test.Helpers.*;
import static org.fest.assertions.Assertions.*;


/**
*
* Simple (JUnit) tests that can call all parts of a play app.
* If you are interested in mocking a whole application, see the wiki for more details.
*
*/
public class TemperatureControllerTest {


    @Test
    public void testIndex() {
    	running(fakeApplication(inMemoryDatabase()), new Runnable() {
    	       public void run() {
			    	Result result = TemperatureController.index();
			        assertThat(contentType(result)).isEqualTo("application/json");
			        assertThat(charset(result)).isEqualTo("utf-8");
			        assertThat(contentAsString(result)).contains("message");
			        assertThat(contentAsString(result)).contains("data");
			        assertThat(contentAsString(result)).contains("esito");
    	       }
    	});
    }

    @Test
    public void testShow(){
    	
    	running(fakeApplication(inMemoryDatabase()), new Runnable() {
	 	       public void run() {
			        Long timestamp = Long.parseUnsignedLong("1427846400000");
			        Result result = TemperatureController.show(timestamp);
			        assertThat(contentType(result)).isEqualTo("application/json");
			        assertThat(charset(result)).isEqualTo("utf-8");
			        assertThat(contentAsString(result)).contains("message");
			        assertThat(contentAsString(result)).contains("data");
			        assertThat(contentAsString(result)).contains("esito");
	
	 	      }
    	});
    }
    
    @Test 
    public void testDelete(){
    	running(fakeApplication(inMemoryDatabase()), new Runnable() {
	 	       public void run() {
	 	    	  String FakeID = "12564789331";
	 	    	  Long LongFakeID = Long.parseUnsignedLong(FakeID);
	 	    	  Result result = TemperatureController.delete(LongFakeID);
	 	    	  assertThat(status(result)).isEqualTo(403);
	 	       }
	 	       
    	});
    }
    
    
    @Test 
    public void testUpdate(){
    	running(fakeApplication(inMemoryDatabase()), new Runnable() {
	 	       public void run() {
	 	    	  String FakeID = "12564789331";
	 	    	  Long LongFakeID = Long.parseUnsignedLong(FakeID);
	 	    	  Result result = TemperatureController.update(LongFakeID);
	 	    	  assertThat(status(result)).isEqualTo(403);
	 	       }
	 	       
    	});
    }
    
    
    public void testCreateArray(){
    	running(fakeApplication(inMemoryDatabase()), new Runnable() {
	 	       public void run() {
			    	System.out.println("run");
			        String temperatures = "{[{\"id\":\"55140008d067a2c94b8b4567\",\"data\":\"2015-04-01\",\"timestamp\":1427839200,\"temperature\":23.0},{\"id\":\"55140008d067a2c94b8b4568\",\"data\":\"2015-04-01\",\"timestamp\":1427842800,\"temperature\":14.0},{\"id\":\"55140008d067a2c94b8b4569\",\"data\":\"2015-04-01\",\"timestamp\":1427846400,\"temperature\":7.0},{\"id\":\"55140008d067a2c94b8b456a\",\"data\":\"2015-04-01\",\"timestamp\":1427850000,\"temperature\":6.0},{\"id\":\"55140008d067a2c94b8b456b\",\"data\":\"2015-04-01\",\"timestamp\":1427853600,\"temperature\":1.0},{\"id\":\"55140008d067a2c94b8b456c\",\"data\":\"2015-04-01\",\"timestamp\":1427857200,\"temperature\":32.0},{\"id\":\"55140008d067a2c94b8b456d\",\"data\":\"2015-04-01\",\"timestamp\":1427860800,\"temperature\":34.0},{\"id\":\"55140008d067a2c94b8b456e\",\"data\":\"2015-04-01\",\"timestamp\":1427864400,\"temperature\":16.0},{\"id\":\"55140008d067a2c94b8b456f\",\"data\":\"2015-04-01\",\"timestamp\":1427868000,\"temperature\":20.0},{\"id\":\"55140008d067a2c94b8b4570\",\"data\":\"2015-04-01\",\"timestamp\":1427871600,\"temperature\":20.0},{\"id\":\"55140008d067a2c94b8b4571\",\"data\":\"2015-04-01\",\"timestamp\":1427875200,\"temperature\":12.0},{\"id\":\"55140008d067a2c94b8b4572\",\"data\":\"2015-04-01\",\"timestamp\":1427878800,\"temperature\":30.0},{\"id\":\"55140008d067a2c94b8b4573\",\"data\":\"2015-04-01\",\"timestamp\":1427882400,\"temperature\":5.0},{\"id\":\"55140008d067a2c94b8b4574\",\"data\":\"2015-04-01\",\"timestamp\":1427886000,\"temperature\":7.0},{\"id\":\"55140008d067a2c94b8b4575\",\"data\":\"2015-04-01\",\"timestamp\":1427889600,\"temperature\":28.0},{\"id\":\"55140008d067a2c94b8b4576\",\"data\":\"2015-04-01\",\"timestamp\":1427893200,\"temperature\":35.0},{\"id\":\"55140008d067a2c94b8b4577\",\"data\":\"2015-04-01\",\"timestamp\":1427896800,\"temperature\":19.0},{\"id\":\"55140008d067a2c94b8b4578\",\"data\":\"2015-04-01\",\"timestamp\":1427900400,\"temperature\":7.0},{\"id\":\"55140008d067a2c94b8b4579\",\"data\":\"2015-04-01\",\"timestamp\":1427904000,\"temperature\":36.0},{\"id\":\"55140008d067a2c94b8b457a\",\"data\":\"2015-04-01\",\"timestamp\":1427907600,\"temperature\":34.0},{\"id\":\"55140008d067a2c94b8b457b\",\"data\":\"2015-04-01\",\"timestamp\":1427911200,\"temperature\":13.0},{\"id\":\"55140008d067a2c94b8b457c\",\"data\":\"2015-04-01\",\"timestamp\":1427914800,\"temperature\":38.0},{\"id\":\"55140008d067a2c94b8b457d\",\"data\":\"2015-04-01\",\"timestamp\":1427918400,\"temperature\":2.0},{\"id\":\"55140008d067a2c94b8b457e\",\"data\":\"2015-04-01\",\"timestamp\":1427922000,\"temperature\":8.0}]}";
			        JsonNode json = Json.parse(temperatures);
			        FakeRequest request = new FakeRequest(POST, "/temperature/create").withJsonBody(json);
			        Result result = callAction(controllers.routes.ref.TemperatureController.create(), request);
			        assertThat(status(result)).isEqualTo(500);
	 	       }
    	});
    }
    
    
    public void testCreateSingle(){
    	running(fakeApplication(inMemoryDatabase()), new Runnable() {
	 	       public void run() {
			    	System.out.println("run");
			        String temperatures = "{\"id\":\"55140008d067a2c94b8b4567\",\"data\":\"2015-04-01\",\"timestamp\":1427839200,\"temperature\":23.0}";
			        JsonNode json = Json.parse(temperatures);
			        FakeRequest request = new FakeRequest(POST, "/temperature/create").withJsonBody(json);
			        Result result = callAction(controllers.routes.ref.TemperatureController.create(), request);
			        assertThat(status(result)).isEqualTo(500);
	 	       }
    	});
    }


}
