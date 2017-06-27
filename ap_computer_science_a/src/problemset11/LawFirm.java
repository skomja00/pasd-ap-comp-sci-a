package problemset11;

public class LawFirm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Secretary stan = new Secretary();
		stan.takeDictation("hello");

		LegalSecretary ophelia = new LegalSecretary();
		ophelia.fileLegalBrief();

		HarvardLawyer dershowitz = new HarvardLawyer();
		dershowitz.sue();
		
	}

}
