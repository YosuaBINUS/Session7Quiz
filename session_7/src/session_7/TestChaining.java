package session_7;

class Person{
	public Person() {
		System.out.println("(1) Perform Person Task");
	}
}

class Employee extends Person{
	
	public Employee(String s) {
		System.out.println(s);
	}
	
	public Employee() {
		this("(2) Invokes Employee's Overloaded Constructor");
		System.out.println("(3) Perform Employee Task");
	}
}

public class TestChaining extends Employee{

	public static void main(String[] args) {
		new TestChaining();
	}
	
	public TestChaining() {
		System.out.println("(4) Perform TestChaining Task");
	}

}
