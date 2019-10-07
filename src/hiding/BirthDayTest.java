package hiding;

class BirthDay {
	private int day; // public���� �ϸ� ������ ���Ἲ�� ħ��(����)�� �� �ִٰ��Ͽ� private���� ���� ���� public �޼��带 �����ؼ�, 
	private int month; //public �޼��带 ���� ����� �� �ֵ��� �� ���´�
	private int year; // ��׵��� hiding�� ������ �Ʒ� ������ getter,setter �޼��带 ���ؼ� �� �� �ִ�
						// ���� private�� ����� �� setYear(int year)���� setter�Լ����� �������� �ʴ´ٸ� read-only�����Ͱ� �Ǵ� ���̴�
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		
		if(month == 2)
		{
			if( day<1 || day>28 )
			{
				System.out.println("��¥ �����Դϴ�.");
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
		
		day.setYear(2018);	// �� �� ������ �޼��带 �̿��ؼ� �� �� �ִ�
		day.setMonth(2);
		day.setDay(30);		
		
	}
	
}

/*
Java�� ���� �������� ���� (4����)
-public :  �ܺ�Ŭ������ �� ���� �� �� �ִ�
-private : �� Ŭ���� �ȿ����� �� �� �ִ�. �ܺο��� ���� �Ұ�
-(none) : ����Ʈ ��� ��. ���� ��Ű�� �������� �׼��� ������. ��������Ƽ�� �ȴ�
-protected : ��� ���迡���� �ٸ�Ŭ������ private�� ��Ӱ��迡���� publicó�� ����� �� �ִ� ..


*/