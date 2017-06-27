package other;

public class Question {
	private static String no = "No";
	private String answer;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void flip (Question q) {
		//answer = "yes"; //Cannot make a static reference to the non-static field answer
		q.no = "yes";
		q.answer = "yes";
	}

}
