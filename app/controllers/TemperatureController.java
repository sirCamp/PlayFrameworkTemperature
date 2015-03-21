package controllers;

import java.util.Calendar;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

public class TemperatureController extends Controller {

	public static Result index() {
        return ok(index.render("Your new application is ready."));
    }
	
	public static Result show(long data){
		Calendar mydate = Calendar.getInstance();
		mydate.setTimeInMillis(data);
		System.out.println(mydate.toString());
		
		/*simulazione load dati*/
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ok();
	}
}
