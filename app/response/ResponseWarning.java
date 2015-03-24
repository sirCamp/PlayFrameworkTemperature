package response;

import java.util.List;

public class ResponseWarning extends Response {
	
	boolean esito;
	
	public  ResponseWarning(String message, List data){
		super(message, data);
		esito = true;
	}

}