package session_7_quiz;

class Person{
	String name;
	String born_date;
	
	public Person(String name, String born_date) {
		this.name = name;
		this.born_date = born_date;
	}
	
	public void sleep() {
		System.out.println("This person is sleeping");
	}
	
	void Display() {
		System.out.println("Person Name: "+ name + "\nPerson Born Date: "+ born_date);
	}
}

class Mahasiswa extends Person{
	String student_id;
	int point = 0;
	
	public Mahasiswa(String name, String born_date, String student_id, int point) {
		super(name, born_date);
		this.student_id = student_id;
		this.point = point;
	}
	
	public void helpingDosen() {
		point += 10;
	}
	
	void Display() {
		System.out.println("Student Name: "+ super.name + "\nStudent Born Date: "+ super.born_date);
		System.out.println("Student Code: "+ student_id + "\nStudent Point: "+ point + "\n");
	}
}

class Dosen extends Person{
	String code_dosen;
	int point = 0;
	
	public Dosen(String name, String born_date, String code_dosen, int point) {
		super(name, born_date);
		this.code_dosen = code_dosen;
		this.point = point;
	}
	
	public void selfDev() {
		point += 3;
	}
	public void teach() {
		point += 8;
	}
	public void p2m() {
		point += 5;
	}
	public void research() {
		point += 15;
	}
	public void otherWorks() {
		point += 1;
	}
	
	void Display() {
		System.out.println("Dosen Name: "+ super.name + "\nDosen Born Date: "+ super.born_date);
		System.out.println("Dosen Code: "+ code_dosen + "\nDosen Point: "+ point + "\n");
	}
}

public class main {

	public static void main(String[] args) {
		Dosen d1 = new Dosen("Anto", "3/4/2000", "D103", 10);
		d1.Display();
		d1.teach();
		d1.p2m();
		d1.otherWorks();
		d1.Display();
		
		Mahasiswa m1 = new Mahasiswa("James", "12/10/2009", "25250921", 4);
		m1.Display();
		m1.helpingDosen();
		m1.Display();
		
		Person p1 = new Person("Rando", "1/11/1999");
		p1.Display();
	}

}
