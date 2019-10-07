package thisEx;
/*
 * this �� �ϴ� ��
 * - ������ �������� �ν��Ͻ� �޸𸮸� ����Ŵ
 * - �����ڿ��� �ٸ� �����ڸ� ȣ��
 * - �ڽ��� �ּҸ� ��ȯ
 */

class Birthday{
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year;
	}
	
	/* this �� �Ʒ��� ���� ��Ȳ�� �� ���̴µ�,
	 * 
	 * public void setYear(int y) {
			year = y;
		}
		
	 * java������ ���� ��κ� �Ű������� ��������� ���� �̸����� ����ϰ�, this�� �������� ǥ���ϹǷ� �˾ƾ��Ѵ�
	 * this.year�� �ǹ� : ���� �ִ� �� Ŭ������ ������, �ν��Ͻ� �޸𸮿� �ִ�  year�� ã�ƶ�.
	 * this.year == Birthday.year  �� ���� �ǹ�
	 * 
	 *  
	 */
	
	public void printThis() {
		System.out.println(this); // this : �� ���� �ν��Ͻ��� �ּҰ��̴�.
								//��� ! Ŭ������ �ϳ����� Ŭ������ ������� ���� �ν��Ͻ��� ���������.
	}
}

public class ThisEx {

	public static void main(String[] args) {
		
		Birthday b1 = new Birthday();
		Birthday b2 = new Birthday();
		//
		System.out.println(b1); //  b1 ���� ���  : �����ִ� �ν��Ͻ�b1�� �ּҸ� ������ ����
		b1.printThis();		// this���� ��� : ���� �ִ� Ŭ����(�ν��Ͻ�)b1�� �ּҰ��� ������ ����
		
		System.out.println(b2); //  b2 ���� ���  : �����ִ� �ν��Ͻ�b2�� �ּҸ� ������ ����
		b2.printThis();		// this���� ��� : ���� �ִ� Ŭ����(�ν��Ͻ�)b2�� �ּҰ��� ������ ����
	}

}
