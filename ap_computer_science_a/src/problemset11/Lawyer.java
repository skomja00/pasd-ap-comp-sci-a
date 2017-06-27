package problemset11;

public class Lawyer extends Employee {

	Lawyer () {
		setHours (40.0);
		setSalary (40000.00);
		setVacationDays (15.0);
		setVacationForm ("pink");
	}
	void handleLawSuits () {
		System.out.println("Handle lawsuit.");
	}
	void sue () {
		System.out.println("I lied. Sue me.");
	}
	
}
