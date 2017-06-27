package weekender_21;

import java.util.ArrayList;
import java.util.List;

public class PartyTest {

	public static void main(String[] args) {
		List<String> guests = new ArrayList<String>();
		guests.add("Alice");
		guests.add("Ben");
		guests.add("Candy");
		
		//OK Party [] celebrations = new Party [2];
		//OK Party [] celebrations = { new Party (guests), new Party () };
		//Not OK. BDayParty is-a Party "uni-directional" BDayParty [] celebrations = { new BDayParty ("Malika", guests), new Party (guests) };
		//OK BDayParty [] celebrations = { new BDayParty ("Lee", guests), new BDayParty ("Henry",guests) };
		
		BDayParty birthday = new BDayParty ("Aaron", guests);
		System.out.println(birthday.greetings());
	}

}
