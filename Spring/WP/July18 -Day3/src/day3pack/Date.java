package day3pack;

public class Date {
	int day;
	int month;
	int year;
	public Date() {
		this.day = 01;
		this.month = 01;
		this.year = 1948;
	}
	public Date(int day, int month, int year) {
		if((day>0&&day<=31)&&(month>0&&month<13)) {
			this.day = day;
			this.month = month;
			this.year = year;
		}
	}
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Date addDay(Date d)
	{
		   if(d.day==30&&(d.month==4||d.month==5||d.month==9||d.month==11))
		   {
			   d.day=1;
			   d.month=(d.month+1)%12;
			   return d;
		   }
		   else if(d.day==28 && d.month ==2)
		   {
			   d.day=1;
			   d.month=3;
			   return d;
		   }
		   else if(d.day==31 && d.month==12)
		   {
			   d.day=1;
			   d.month=(d.month+1)%12;
			   d.year+=1;
			   return d;
		   }
		   else if(d.day==31)
		   {
			   d.day=1;
			   d.month=(d.month+1)%12;
			   return d;		   }
		   else 
			   d.day+=d.day;
		   
		   return d;
	}
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
}
