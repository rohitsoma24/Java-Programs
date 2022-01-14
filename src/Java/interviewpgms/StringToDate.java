package Java.interviewpgms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.Calendar;  

public class StringToDate {

	public static void main(String[] args) {
		
		String s = "23/12/2021";
		
		/*System.out.println(s+"  "+s.hashCode());
		
		s="Hello";
		System.out.println(s+"  "+s.hashCode());*/
		
		
		try {
			// string to date
			Date d = new SimpleDateFormat("dd/MM/yyyy").parse(s);
			
			System.out.println(s+"\t"+d);
			
			
			//Date to string
			
			Date dt = Calendar.getInstance().getTime();
			
			DateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
			
			String sd = sdf.format(dt);
			
			System.out.println(sd);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
