package problemset11;

public abstract class Employee extends LawFirm {
	
	private double hours=40.0; 
	private double salary=40000.00;
	private double vacationDays=10.0;
	private String vacationForm = "yellow";

	public void setHours (double h) {
		hours = h;
	}
	public double getHours () {
		return hours;
	}
	public void setSalary (double s) {
		salary = s;
	}
	public double getSalary () {
		return salary;
	}
	public void setVacationDays (double v) {
		vacationDays = v;
	}
	public double getVacationDays () {
		return vacationDays;
	}
	public void setVacationForm (String vf) {
		 vacationForm = vf;
	}
	public String getVacationForm () {
		 return vacationForm;
	}
	
}
