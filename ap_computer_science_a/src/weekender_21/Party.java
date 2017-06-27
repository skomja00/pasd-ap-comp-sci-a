package weekender_21;

import java.util.List;

public abstract class Party {
	private List<String> theGuests;
	public abstract String getOccasion();
	public String getMessage () {return "Happy";}
	public String greetings () {return getMessage() + " " + getOccasion();}
	public Party () { theGuests = null; }
	public Party (List<String> guests) { theGuests = guests; }
	public void setGuests (List<String> guests) { theGuests = guests; }
	public String toString () {return "";}
	
}
