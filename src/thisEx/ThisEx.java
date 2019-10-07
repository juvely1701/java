package thisEx;
/*
 * this 가 하는 일
 * - 생선된 스스로의 인스턴스 메모리를 가리킴
 * - 생성자에서 다른 생성자를 호출
 * - 자신의 주소를 반환
 */

class Birthday{
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year;
	}
	
	/* this 는 아래와 같은 상황일 때 쓰이는데,
	 * 
	 * public void setYear(int y) {
			year = y;
		}
		
	 * java에서는 거의 대부분 매개변수를 멤버변수와 같은 이름으로 사용하고, this로 구분지어 표현하므로 알아야한다
	 * this.year의 의미 : 지금 있는 이 클래스가 생성된, 인스턴스 메모리에 있는  year를 찾아라.
	 * this.year == Birthday.year  와 같은 의미
	 * 
	 *  
	 */
	
	public void printThis() {
		System.out.println(this); // this : 그 때의 인스턴스의 주소값이다.
								//기억 ! 클래스는 하나지만 클래스를 기반으로 여러 인스턴스가 만들어진다.
	}
}

public class ThisEx {

	public static void main(String[] args) {
		
		Birthday b1 = new Birthday();
		Birthday b2 = new Birthday();
		//
		System.out.println(b1); //  b1 값을 출력  : 힙에있는 인스턴스b1의 주소를 가지고 있음
		b1.printThis();		// this값을 출력 : 현재 있는 클래스(인스턴스)b1의 주소값을 가지고 있음
		
		System.out.println(b2); //  b2 값을 출력  : 힙에있는 인스턴스b2의 주소를 가지고 있음
		b2.printThis();		// this값을 출력 : 현재 있는 클래스(인스턴스)b2의 주소값을 가지고 있음
	}

}
