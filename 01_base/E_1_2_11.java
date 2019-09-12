
public class E_1_2_11 {
/**
 * 根据Date的API 实现一个SmartDate类型
 * 在日期非法时抛出一个异常
*/
	public static class SmartDate {
	    private final int[] DAYS = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	    private final int month;   // month (between 1 and 12)
	    private final int day;     // day   (between 1 and DAYS[month]
	    private final int year;    // year

	    public SmartDate(int month, int day, int year) {
	        if (!isValid(month, day, year)) throw new IllegalArgumentException("Invalid date");
	        this.month = month;
	        this.day   = day;
	        this.year  = year;
	    }
	    
	    public int getday() {
	    	return day;
	    }
	    public int getmonth() {
	    	return month;
	    }
	    public int getyear() {
	    	return year;
	    }
	    
	    private boolean isValid(int month, int day, int year) {
	    	if(month >12 || month<0 ) return false;
	    	if(day<0 || day>DAYS[month]) return false;
	    	if (month==2 && day==29 && isLeapYear(year)) return false;
	    	return true;
		}

		private boolean isLeapYear(int year) {
			if(year%400 == 0) return true;
			if(year%100 == 0) return false;
			return year%4 == 0;
		}
	
		public String toString() {
			return month + "/" + day + "/" + year;
		}

	}
	public static void main(String[] args) {
		SmartDate date = new SmartDate(4, 22, 2012);
		System.out.println(date);
	}

}
