package controllers;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;
import java.util.Vector;





import models.Temperature;
import play.mvc.Controller;
import play.mvc.Result;
import play.libs.Json;
import response.Response;
import response.ResponseError;
import response.ResponseSuccess;
import utils.DataFactory;
import utils.ModelFactory;
import views.html.index;
import play.mvc.BodyParser;

import com.fasterxml.jackson.databind.JsonNode;

public class TemperatureController extends Controller {

	public static Result index() {
		
		JsonNode responseJson = null;
		Response response = null;
		
		try{
			response = new ResponseSuccess("OK",Temperature.all());
			
			/*DEBUG*/
			//System.out.println("DEBUG: "+response);
		}
		catch(Exception e){
		
			response = new ResponseError("Something wrong happened, come back later",null);
			
			System.out.println("Qualcosa è andato storto con il database: "+e.getMessage());
		}
		finally{
			responseJson = Json.toJson(response); 
			
			/*DEBUG*/
			//System.out.println(responseJson);
		}
		
		
		if(response.esito){
			return ok(responseJson);
		}

		return internalServerError(responseJson);
    }
	
	public static Result show(long data){
		/*DEBUG*/
		//System.out.println(data);
		
		String datas = DataFactory.createWithFormat(data,"Y-m-d");
		/*DEBUG*/
		//System.out.println(datas);
		JsonNode responseJson = null;
		Response response = null;
		
		try{
			response = new ResponseSuccess("OK",Temperature.where("data",datas));
			
			/*DEBUG*/
			//System.out.println("DEBUG: "+response);
		}
		catch(Exception e){
		
			response = new ResponseError("Something wrong happened, come back later",null);
			
			System.out.println("Qualcosa è andato storto con il database: "+e.getMessage());
		}
		finally{
			responseJson = Json.toJson(response); 
			
			/*DEBUG*/
			//System.out.println(responseJson);
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(response.esito){
			return ok(responseJson);
		}

		return internalServerError(responseJson);
	}

	
	public static Result delete(long id){

		return  status(403, "Access Denied");
	}

	@BodyParser.Of(BodyParser.Json.class)
	public static Result create(){
		
		JsonNode json = request().body().asJson();
		
		
		JsonNode responseJson = null;
		
		try{
			ModelFactory.createModel(Temperature.class,json);
			responseJson = Json.toJson(new HashMap<String,String>().put("Message", "JSON parsed succesfully"));
		}
		catch(Exception e){
			responseJson = Json.toJson(new HashMap<String,String>().put("Message",e.getMessage()));
		}
		
		return ok(responseJson);
		

	}

	public static Result update(long id){
		return status(403, "Access Denied");
	}	

	public static Result edit(long id){
		return status(403, "Access Denied");
	}

}
