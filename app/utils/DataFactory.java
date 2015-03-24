package utils;

import java.util.Calendar;

public class DataFactory {
	
	
	public static String createWithFormat(long milliseconds, String format){
		
		String convertedDate = "";
		Calendar mydate = Calendar.getInstance();
		mydate.setTimeInMillis(milliseconds);

		String umanMonth = "";
		String umanDay = "";
		int day = mydate.get(Calendar.DAY_OF_MONTH);
		if(day <10){
			umanDay = "0"+String.valueOf(day);
		}
		else{
			umanDay = String.valueOf(day);
		}
		int month = mydate.get(Calendar.MONTH)+1;
		if(month <10){
			umanMonth = "0"+String.valueOf(month);
		}
		else{
			umanMonth = String.valueOf(month);
		}
		int year = mydate.get(Calendar.YEAR);
		
		int hour = mydate.get(Calendar.HOUR);
		int minute = mydate.get(Calendar.MINUTE);
		int second = mydate.get(Calendar.SECOND);
		int millisecond = mydate.get(Calendar.MILLISECOND);
		
		if(format.equals("Y-m-d")){
			
			convertedDate = year+"-"+umanMonth+"-"+umanDay;
		}
		else if(format.equals("Y-m-d H:i:s")){
			convertedDate = year+"-"+umanMonth+"-"+umanDay+" "+hour+":"+minute+":"+second;
		}
		else{
			convertedDate = "";
			//possiamo lancirare un invalid argument
		}
		
		return convertedDate;
	}
}
