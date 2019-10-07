package thisEx;

class Person{
	String name;
	int age;
	
	public Person() {
		
		this("이름없음", 25 );
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}



public class CallAnotherConsT {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		System.out.println(p1.name +" "+ p1.age);
	
		
	}

}
