package iit.oop.driverclass;

import iit.oop.inheritance.DerivedBike;
import iit.oop.inheritance.MountainBike;
import iit.oop.inheritance.hierarchical.ChildClassOne;
import iit.oop.inheritance.hierarchical.ChildClassTwo;
import iit.oop.inheritance.mutiple.ChildClassSecond;

public class OOPDriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MountainBike bike = new MountainBike(3, 200, 0);
//		bike.setHeight(12);
//		System.out.println(bike.toString());
//		DerivedBike a = new DerivedBike();
//		a.parentClass();
//		a.mountainBikeInter();
//		a.ChildDerivedBike();
	
	
//	//Hierarchical Class
//		ChildClassOne classOne = new ChildClassOne();
//		classOne.baseClassPrint();
//		classOne.childClassOnePrint();
//		
//		ChildClassTwo classTwo = new ChildClassTwo();
//		classTwo.baseClassPrint();
//		classTwo.childClassTeoPrint();
		
	//Multiple Inheritance
		ChildClassSecond classSecond = new ChildClassSecond();
		classSecond.getT();
		classSecond.getParentClass();
				
	}
}