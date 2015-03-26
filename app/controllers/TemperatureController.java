package controllers;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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
import views.html.index;

import com.fasterxml.jackson.databind.JsonNode;

public class TemperatureController extends Controller {

	public static Result index() {
        return ok(index.render("Your new application is ready."));
    }
	
	public static Result show(long data){
		
		System.out.println(data);
		String datas = DataFactory.createWithFormat(data,"Y-m-d");
		System.out.println(datas);
		JsonNode responseJson = null;
		Response response = null;
		
		try{
			response = new ResponseSuccess("OK",Temperature.where("data",datas));
			
			System.out.println("DEBUG: "+response);
		}
		catch(Exception e){
		
			response = new ResponseError("KO",null);
			
			System.out.println("Qualcosa è andato storto con il database: "+e.getMessage());
		}
		finally{
			responseJson = Json.toJson(response); 
			System.out.println(responseJson);
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

		return badRequest(responseJson);
	}

	
	public static Result delete(long id){
		return badRequest();
	}

	public static Result create(){
		return badRequest();
	}

	public static Result update(long id){
		return badRequest();
	}	

	public static Result edit(long id){
		return badRequest();
	}

}
