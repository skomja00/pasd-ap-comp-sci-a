package other;
import java.util.Scanner;
public class quadrant {

	public static void main(String[] args) {
		double x,y;
		int i=0,ii=0,iii=0,iv=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an ordered pair...");
        x = input.nextDouble();
        y = input.nextDouble();
		while (x<100) {
			if (quadrant(x,y)==1){i++;
			} else if (quadrant(x,y)==2){ii++;
			} else if (quadrant(x,y)==3){iii++;
			} else if (quadrant(x,y)==4){iv++;
			}			
			System.out.println("Enter an ordered pair. ");
			x = input.nextDouble();
			y = input.nextDouble();
		}
		System.out.println("Quadrant I point count is "+i);
		System.out.println("Quadrant II point count is "+ii);
		System.out.println("Quadrant III point count is "+iii);
		System.out.println("Quadrant IV point count is "+iv);
	}
	private static int quadrant (double x, double y) {
		int result=0;
		if (x>0.0 && y>0.0) {result = 1;
		} else if (x>0.0 && y<0.0) {result = 4;
		} else if (x<0.0 && y>0.0) {result = 2;
		} else if (x<0.0 && y<0.0) {result = 3;
		} else if (x==0.0 || y==0.0) {result = 0;
		} else if (x==0.0 && y==0.0) {result = 0;
		}
		return result;
	}
}
