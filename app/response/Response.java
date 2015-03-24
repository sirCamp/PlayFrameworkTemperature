package response;

import java.util.List;

public class Response {
	
	public String message;
	public List data;
	public boolean esito;
	
	public Response(){
		
	}
	public Response(String message, List data){
		this.message = message;
		this.data = data;
	}
	
	public void setMessage(String message){
		this.message = message;
	}
	
	public String getMessage(String message){
		return this.message;
	}
	
	public void setData(List data){
		this.data = data;
	}
	
	public List getData(){
		return this.data;
	}
}
