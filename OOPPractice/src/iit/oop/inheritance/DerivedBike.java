package iit.oop.inheritance;

public class DerivedBike extends MountainBike {
	public DerivedBike(int gear, int speed, int startHeight) {
		super(gear, speed, startHeight);
	}

	public DerivedBike() {
		// TODO Auto-generated constructor stub
	}
	public void ChildDerivedBike() {
		System.out.println("This is Derived Class");
	}

}
