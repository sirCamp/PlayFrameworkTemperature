package controllers;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Vector;

import com.orientechnologies.orient.object.db.OObjectDatabaseTx;

import model.Item;
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
	
		System.out.println(mydate.get(Calendar.DAY_OF_MONTH)+" "+mydate.get(Calendar.MONTH)+" "+mydate.get(Calendar.YEAR));
		
		int day = mydate.get(Calendar.DAY_OF_MONTH);
		int month = mydate.get(Calendar.DAY_OF_MONTH);
		int year = mydate.get(Calendar.YEAR);

		OObjectDatabaseTx db = new OObjectDatabaseTx("remote:localhost/test").open("root", "a");
		db.getEntityManager().registerEntityClass(Person.class);

		Person p = db.newInstance(Person.class);
		//p.setName( "Luca" );
		//p.setSurname( "Garulli" );
		//p.setCity( new City( "Rome", "Italy" ) );

		db.save( p );
		db.close();
		//Item.all();
		
		/*Vector<long> c = new Vector<long>();
		int[] obj;
		for(int i = 0; i < 24; i++){
			Calendar mydate2 = Calendar.getInstance();
				mydate2.set(year, month, day, i, 0);
				c.push(new Integer(mydate2.getTimeInMillis()));
				System.out.println(mydate2.getTimeInMillis());
				Random rn = new Random();
				System.out.println(rn.nextInt(40 - (-10) +1));
						
		}*/
		
		/*simulazione load dati*/
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ok();
	}


	public static Result showMock(long data){
		
		Calendar mydate = Calendar.getInstance();
		mydate.setTimeInMillis(data);
		//System.out.println(mydate.getDay()+" "+mydate.getMonth() +" "+mydate.getYear());
		
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
