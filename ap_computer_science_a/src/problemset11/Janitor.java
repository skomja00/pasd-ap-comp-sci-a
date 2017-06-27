package problemset11;

public class Janitor extends Employee {

	Janitor () {
		setHours (getHours() * 2);
		setSalary (getSalary() - 10000.00);
		setVacationDays(getVacationDays() / 2.0);
		setVacationForm ("yellow");
	}
	public void clean () {
		System.out.println("Workin' for the man.");
	}	
}
