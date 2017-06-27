package problemset11;

public class HarvardLawyer extends Lawyer {

	HarvardLawyer () {
		setSalary (getSalary() * 1.20);
		setVacationDays (getVacationDays() + 3.0);
		setVacationForm ("pinkpinkpinkpink");
	}
}
