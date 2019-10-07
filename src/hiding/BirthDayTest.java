package hiding;

class BirthDay {
	private int day; // public으로 하면 데이터 무결성이 침범(위배)될 수 있다고하여 private으로 감춰 놓고 public 메서드를 제공해서, 
	private int month; //public 메서드를 통해 사용할 수 있도록 해 놓는다
	private int year; // 얘네들은 hiding이 됐지만 아래 생성한 getter,setter 메서드를 통해서 쓸 수 있다
						// 또한 private를 사용할 때 setYear(int year)같은 setter함수들을 제공하지 않는다면 read-only데이터가 되는 것이다
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		
		if(month == 2)
		{
			if( day<1 || day>28 )
			{
				System.out.println("날짜 오류입니다.");
			}
			else
			{
				this.day = day;
			}
			
		}
		
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
		
		day.setYear(2018);	// 쓸 수 있지만 메서드를 이용해서 쓸 수 있다
		day.setMonth(2);
		day.setDay(30);		
		
	}
	
}

/*
Java의 접근 제어자의 종류 (4가지)
-public :  외부클래스를 다 갖다 쓸 수 있다
-private : 내 클래스 안에서만 쓸 수 있다. 외부에서 접근 불가
-(none) : 디폴트 라고 함. 같은 패키지 내에서는 액세스 가능함. 비저빌리티가 된다
-protected : 상속 관계에서는 다른클래스에 private만 상속관계에서만 public처럼 사용할 수 있는 ..


*/