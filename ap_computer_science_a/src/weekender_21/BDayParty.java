package weekender_21;

import java.util.List;

public class BDayParty extends Party {
	private String theName;
	public BDayParty (String name, List<String> guests) {
		//theGuests = guests;//not OK. theGuests is private. 
		//super(guests);//OK
		setGuests(guests);
		
		theName = name;
	}
	public String getName () {
		return theName;
	}
	public String getOccasion() {
		return "Birthday "+getName();
	}
}
