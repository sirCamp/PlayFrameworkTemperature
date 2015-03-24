package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;
import play.mvc.Result;
import play.libs.Json;
import response.Response;
import response.ResponseError;
import response.ResponseSuccess;
import utils.DataFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.libs.Json;

import models.Failure;

import com.fasterxml.jackson.databind.JsonNode;

public class FailureController extends Controller{
	
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
			response = new ResponseSuccess("OK",Failure.where("data",datas));
			
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
