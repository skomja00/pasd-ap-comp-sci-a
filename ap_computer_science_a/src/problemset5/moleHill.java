package problemset5;

public class moleHill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		drawFigure();
	}
	public static void drawFigure() {
		final int N = 5;
		for (int line=1;line<=N;line++) {
			
			for (int i=1;i<=(N-line)*4;i++){
				System.out.print("/");
			}
			for (int i=1;i<(line-1)*8;i++){
				System.out.print("*");
			}
			for (int i=1;i<=(N-line)*4;i++){
				System.out.print("\\");
			}
			System.out.println();
		}
	}
}
