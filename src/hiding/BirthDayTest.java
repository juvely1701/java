package hiding;

class BirthDay {
	private int day;
	private int month;
	private int year; // ��׵��� hiding�� ������ �Ʒ� ������ getter,setter �޼��带 ���ؼ� �� �� �ִ�
	
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
	
	
	

}

public class BirthDayTest{
	public static void main(String[]args) {
		BirthDay day = new BirthDay();
		
		day.month = 2;
		day.year = 2018;
		day.day = 30;
	}
	
}
