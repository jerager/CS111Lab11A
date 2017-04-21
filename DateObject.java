
public class DateObject {

	private int day;
	private int month;
	private int year;
	private String calendar;
	
	private static String[] names = {"No Month Zero","January","February","March",
			"April","May","June","July","August","September","October",
			"November","December"};
			
			
	public static int monthToInt(String name) {
		for (int i=1; i<13; i++) {
			if (name.equals(names[i]))
				return i;
		}
		return -1;
	}
		
	public void setDay(String m, int d, int y) {
		
		day = d;
		year = y;
		month = monthToInt(m);
		calendar = "Gregorian";
	}
	
public void setDay(String m, int d, int y, String cal) {
		

	}
		
	public void bump() {
		day = day + 1;
	}
		
	
	public String printRep() {
		return names[month]+"/"+day+"/"+year;
	}
	
	// calculate the days in the month  Use isLeap
	public int daysInMonth() {
		return 0;
	}
	
	// call one of isLeapGregorian and isLeap Julian
	public boolean isLeap() {
		return false;
	}
	
	// leap year if divisible by 400, or if divisible by 4 and not 100
	public boolean isLeapGregorian() {
		return false;
	}
	
	// leap year if divisible by 4
	public boolean isLeapJulian() {
		return false;
	}
	
	public boolean sameDate(DateObject other) {
		if (day == other.day && year == other.year && month == other.month)
			return true;
		else
			return false;
	}
	
	// return true if December 31
	public boolean isLastDayInYear() {
		return false;
	}

	// return a new Date with the same fields as this one
	public DateObject generateCopy() {
	    DateObject new1 = new DateObject();
	    return new1;
	}
	
	// return a new Date with the same fields as this one's tomorrow
	public DateObject generateTomorrow() {
	    DateObject new1 = new DateObject();
	    return new1;
	}
	
	//return the year
	public int getYear() {
	    return year;
	}
	// return the day
	public int getDay() {
		return day;
		
	}
	
	// return the month
	public String getMonth() {
		
		
		return names[month];	
	}
	
	// finish this - check for the end of a month use daysinmonth
	public void makeTomorrow() {
	
		
		if (isLastDayInYear()) {
			day = 1;
			month = 1;
			year = year+1;
		}
		else {
			bump();
		}
	
	
	}

	// move forward n days (use makeTomorrow
	public void makeTomorrow(int n){
	}

	// return true if this is after other
	public boolean after(DateObject other) {
		return false;
	}
	
	// return true if this is before other 
	public boolean before(DateObject other) {
		return false;
	}
	
	
}
