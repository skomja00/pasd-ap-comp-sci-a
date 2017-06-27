package problemset11;

public class Secretary extends Employee {
	
	private String dictation = "";

	Secretary () {
		setHours (40.0);
		setSalary (40000.00);
		setVacationDays (10.0);
		setVacationForm ("yellow");
	}
	public void takeDictation (String d) {
		dictation = d;
		System.out.println("Dictating text: "+dictation);
	}
}
