package session_7;

class PersonOne{
	int PersonAttr = 5;
	
	PersonOne(){
		System.out.println("Person Class Contributor");
	}
	
	void message() {
		System.out.println("This message from person Class");
	}
}

class StudentOne extends PersonOne{
	int PersonAttr = 6;
	
	StudentOne(){
		super();
		System.out.println("Student Class Contributor: " + super.PersonAttr + "\nthis / var: " + "" + this.PersonAttr);
	}
	
	void message() {
		System.out.println("This message from student Class");
	}
	
	void display() {
		this.message();
		message();
		super.message();
	}
}

public class TestSuperConstructorVariable {

	public static void main(String[] args) {
		StudentOne s = new StudentOne();
		s.display();
	}

}
