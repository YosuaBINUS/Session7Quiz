package session_7;

class Bicycle{
	public int gear;
	public int speed;
	
	public Bicycle(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}
	
	public void applyBreak(int decrement) {
		speed -= decrement;
	}
	
	public void speedUp(int increment) {
		speed += increment;
	}
	
	public String toString() {
		return ("No of gears are "+ gear + "\n" + "Speed of bicycle is "+ speed);
	}
}

class mountainBike extends Bicycle{
	public int seatHeight;
	
	public mountainBike(int gear, int speed, int seatHeight) {
		super(gear, speed);
		this.seatHeight = seatHeight;
	}
	
	public void setHeight(int newValue) {
		seatHeight = newValue;
	}
	
	public String toString() {
		return (super.toString() + "\nSeat height is " + seatHeight + "\n");
	}
}

public class TestInheritance {

	public static void main(String[] args) {
		mountainBike mb = new mountainBike(2, 40, 25);
		System.out.println(mb.toString());
		mb.speedUp(1);
		System.out.println("after speed up: " + mb.toString());
	}

}
