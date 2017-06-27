package problemset6;

public class Optometrist {

	public static void main(String[] args) {
		//random letters on an eye chart
		optometrist(6);
	}
	public static void optometrist (int rowCount) {
		int row=0;
		int col=0;
		int width = (rowCount + 1) * 2;
		String rowString="";
		for (row = 0; row <= 6; row++) {
			for (col = 0; col <= row; col++) {
				rowString=rowString+randomLetter()+" ";
			}
			System.out.printf("%"+((width/2)+(rowString.length()/2))+"s\n", rowString);
			rowString="";
		}
	}
	public static Character randomLetter () {
		return (char) ( ( (int) ( Math.random() * 26 ) ) + 65 ) ; //upper case alphabet starts at ascii position 65
	}
}
