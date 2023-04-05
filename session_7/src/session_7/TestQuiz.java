package session_7;

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
		System.out.println("Student Code: "+ student_id + "Student Point: "+ point);
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
		System.out.println("Dosen Code: "+ code_dosen + "Dosen Point: "+ point);
	}
}

public class TestQuiz {

	public static void main(String[] args) {
		Dosen d1 = new Dosen("Anto", "3/4/2000", "D103", 10);
		d1.Display();
	}

}
