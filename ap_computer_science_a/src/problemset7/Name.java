package problemset7;

public class Name {
	private String firstName;
	private String middleInitial;
	private String lastName;
	Name (String f, String m, String l) {
		firstName=f;
		middleInitial=m;
		lastName=l;
	}
	public String getFirstName () {
		return firstName;
	}
	public String getMiddleInitial () {
		return middleInitial;
	}
	public String getLasttName () {
		return lastName;
	}
	public void setFirstName (String firstName) {
		this.firstName=firstName;
	}
	public void setMiddleInitial (String middleInitial) {
		this.middleInitial=middleInitial;
	}
	public void setLasttName (String lastName) {
		this.lastName=lastName;
	}
	public String getNormalOrder() {
	//This method should return the person’s name in normal order, with the first name followed by the middle initial and last name. 
	//For example, if the first name is “John”, the middle initial is “Q”, and the last name “Public”, returns “John Q. Public”.
		return firstName+" "+middleInitial+". "+lastName;
	}
	public String getReverseOrder() {
	//Returns the person’s name in reverse order, with the last name preceding the first name and middle initial. 
	//For example if the first name is “John”, the middle initial is “Q”, and the last name “Public”, returns “Public, John Q.”
		return lastName+", "+firstName+" "+middleInitial+".";
	}
	public boolean equals(Name otherName) {
	//returns true if this name is the same as otherName. Comparisons should not be case sensitive. 
		if (this.lastName.equalsIgnoreCase(otherName.lastName) && 
			this.firstName.equalsIgnoreCase(otherName.firstName) &&
			this.middleInitial.equalsIgnoreCase(otherName.middleInitial)) {
			return true; }
		else {
			return false;
		}
	}
	public String initials() {
	//returns the person's initials (a 3-character string). The initials should be all in upper case, regardless of what case the name was entered in. 
		return firstName.substring(0, 1)+middleInitial.substring(0, 1)+lastName.substring(0, 1);
	}
	public int length() {
	//returns the total number of characters in the full name, not including spaces.
		return firstName.length()+middleInitial.length()+lastName.length();
	}

}
