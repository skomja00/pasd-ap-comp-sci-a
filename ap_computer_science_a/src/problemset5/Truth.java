package problemset5;

import java.util.Scanner;

public class Truth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printTruthTable();
		
	}
	public static void printTruthTable () {
		System.out.println("AmPm  |  WeekDay  |  Result");
		System.out.println("---------------------------");
		for (int a=1;a<=cardinality("amPm");a++) {
			for (int b=1;b<=cardinality("weekDay");b++) {
				System.out.println(member("amPm",a)+"    |   "+member("weekDay",b)+"     |  ");
			}
		}
	}
	private static int cardinality (String string) {
		//cardinality of a set is a measure of the "number of elements of the set"
		if (string.equals("weekDay")) {
			return 7;
		} else if (string.equals("amPm")){
			return 2;
		}
		return 0;
	}
	private static String member(String string, int a) {
		String value="";
		if (string.equals("weekDay")) {
			if (a==1) {value="Mon";
			} else if (a==2) {value="Tue";
			} else if (a==3) {value="Wed";
			} else if (a==4) {value="Thu";
			} else if (a==5) {value="Fri";
			} else if (a==6) {value="Sat";
			} else if (a==7) {value="Sun";
			}
		}
		if (string.equals("amPm")) {
			if (a==1) {value="AM";
			} else if (a==2) {value="PM";
			}
		}
		return value;
	}
}