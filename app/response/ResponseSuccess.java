package response;

import java.util.List;

public class ResponseSuccess extends Response {
	
	
	
	public ResponseSuccess(String message, List data){
		super(message, data);
		esito = true;
	}

}
