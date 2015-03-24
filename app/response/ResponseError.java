package response;

import java.util.List;

public class ResponseError extends Response {
	
	boolean esito;
	
	public  ResponseError(String message, List data){
		super(message, data);
		esito = false;
	}

}
