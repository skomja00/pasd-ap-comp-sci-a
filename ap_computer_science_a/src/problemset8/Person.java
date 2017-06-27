package problemset8;

public class Person {
	private String gender="";
	private int age=18;
	private String name="";
	public Person (String s, String g, int a) {
		this.name = s;
		this.age = a;
		this.gender = g;		
	}
	public String getGender () {
		return this.gender;
	}
	public int getAge () {
		return this.age;
	}
	public String getName () {
		return this.name;
	}
	
}
