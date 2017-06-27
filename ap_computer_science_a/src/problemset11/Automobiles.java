package problemset11;

public class Automobiles {

	public static void main(String[] args) {
		Car myCar = new Car(); //nothing prints to the console in myCar instantiation
		Truck myTruck = new Truck();//nothing prints to the console in myTruck instantiation

		System.out.println(myCar); //prints "vroom". System.out.println(Object) method will call toString() of the 
									//class for Car toString() 
		myCar.m1(); //prints “car 1” per m1() method in Car
		myCar.m2(); //prints “car 2” per m2() method in Car

		System.out.println(myTruck); //prints "vroom". System.out.println(Object) method will call toString() of 
									//the class Truck toString() method inherited from Car
		myTruck.m1(); //prints “truck1” per m1() method in Truck
		myTruck.m2(); //prints "car 2" per m2() method inherited from Car

	
	}

}
