package problemset11;

public class LegalSecretary extends Secretary {

	LegalSecretary () {
		setHours (40.0);
		setSalary (getSalary() + 5000.00);
		setVacationDays (10.0);
		setVacationForm ("yellow");
	}
	public void fileLegalBrief () {
		System.out.println("File, file, file legal briefs.");
	}

}
