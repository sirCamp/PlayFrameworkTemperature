package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

public class FailureController extends Controller{
	
	public static Result index() {
        return ok(index.render("Your new application is ready."));
    }
	
	public static Result show(long data){
		/*simulazione load dati*/
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ok();
	}
	
}
