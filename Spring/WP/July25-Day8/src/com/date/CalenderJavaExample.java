package com.date;
import java.util.Calendar;  
public class CalenderJavaExample {
	   public static void main(String[] args) {  
	   Calendar calendar = Calendar.getInstance();  
	   System.out.println("The current date is : " + calendar.getTime());  
	   calendar.add(Calendar.DATE, -15);  
	   System.out.println("15 days ago: " + calendar.getTime());  
	   calendar.add(Calendar.MONTH, 4);  
	   System.out.println("4 months later: " + calendar.getTime());  
	   calendar.add(Calendar.YEAR, 2);  
	   System.out.println("2 years later: " + calendar.getTime());  
	   
	   calendar = Calendar.getInstance();  
	   System.out.println("At present Calendar's Year: " + calendar.get(Calendar.YEAR));  
	   System.out.println("At present Calendar's Day: " + calendar.get(Calendar.DATE));  
	   
	   int maximum = calendar.getMaximum(Calendar.DAY_OF_WEEK);  
	   System.out.println("Maximum number of days in week: " + maximum);  
	   maximum = calendar.getMaximum(Calendar.WEEK_OF_YEAR);  
	   System.out.println("Maximum number of weeks in year: " + maximum);  
	   
	
	   int minimum = calendar.getMinimum(Calendar.DAY_OF_WEEK);  
	   System.out.println("Minimum number of days in week: " + minimum);  
	   minimum = calendar.getMinimum(Calendar.WEEK_OF_YEAR);  
	   System.out.println("Minimum number of weeks in year: " + minimum);  
	   }
}  

