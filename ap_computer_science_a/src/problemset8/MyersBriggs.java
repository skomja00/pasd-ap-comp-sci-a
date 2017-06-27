package problemset8;

public class MyersBriggs {

	public static void main(String[] args) {
		String [][] chewbaccaResponses = {
			{"B","A","B","A","A","A","A"}, //row0col0 = B, row0col1 = A, row0col2 = B, etc...
			{"B","A","A","A","A","A","A"}, //row1col0 = B, row1col1 = A, row1col2 = A, etc...
			{"A","B","A","A","A","A","B"}, //row2 etc...
			{"B","A","A","A","A","A","A"}, //row3
			{"B","A","A","A","A","B","A"}, //row4
			{"B","A","A","B","A","A","A"}, //row5
			{"B","A","B","A","B","A","A"}, //row6
			{"B","A","A","A","A","A","A"}, //row7
			{"B","A","A","A","A","A","A"}, //row8
			{"B","A","A","A","A","A","A"}, //row9
		};
		String [][] hanSoloResponses = {
			{"A","A","B","B","A","A","B"}, //row0col0 = A, row0col1 = A, row0col2 = B, etc...
			{"B","B","B","B","A","B","A"}, //row1col0 = B, row1col1 = B, row1col2 = B, etc...
			{"B","A","A","A","A","A","B"}, //row2 etc...
			{"A","B","B","A","A","B","B"}, //
			{"A","A","A","A","B","B","B"}, //
			{"A","A","A","B","A","A","B"}, //
			{"A","A","B","A","B","A","A"}, //
			{"A","A","B","A","A","B","B"}, //
			{"B","B","A","A","A","B","B"}, //
			{"A","A","B","A","B","B","B"}  //
		};
		print("Chewbacca:",chewbaccaResponses);							//Chewbacca
		print("Han Solo:",hanSoloResponses);							//Han Solo
			
	}
	static void print (String name, String [][] responses) {
		double [] countA = {0, 0, 0, 0};
		double [] countB = {0, 0, 0, 0};
		//String [] dimensions = {"E","I","S","N","T","F","J","P"};
		for (String [] row : responses) {								//for each row of 10
			if (row[0]=="B") {countB[0]=countB[0]+1.0;}					//count each response dimension
			if (row[0]=="A") {countA[0]=countA[0]+1.0;}				
			if (row[1]=="B") {countB[1]=countB[1]+1.0;}
			if (row[1]=="A") {countA[1]=countA[1]+1.0;}
			if (row[2]=="B") {countB[1]=countB[1]+1.0;}
			if (row[2]=="A") {countA[1]=countA[1]+1.0;}
			if (row[3]=="B") {countB[2]=countB[2]+1.0;}
			if (row[3]=="A") {countA[2]=countA[2]+1.0;}
			if (row[4]=="B") {countB[2]=countB[2]+1.0;}
			if (row[4]=="A") {countA[2]=countA[2]+1.0;}
			if (row[5]=="B") {countB[3]=countB[3]+1.0;}
			if (row[5]=="A") {countA[3]=countA[3]+1.0;}
			if (row[6]=="B") {countB[3]=countB[3]+1.0;}
			if (row[6]=="A") {countA[3]=countA[3]+1.0;}
		}
		System.out.println(name);
		System.out.print  ((int)(countA[0])+"A-"+(int)countB[0]+"B ");	//print response counters
		System.out.print  ((int)(countA[1])+"A-"+(int)countB[1]+"B ");			
		System.out.print  ((int)(countA[2])+"A-"+(int)countB[2]+"B ");			
		System.out.println((int)(countA[3])+"A-"+(int)countB[3]+"B ");			

		System.out.print("["+(int)( countB[0] /  (countA[0]+countB[0])  * 100.00)+"%, ");		//print response percentages
		System.out.print(    (int)( countB[1] /  (countA[1]+countB[1])  * 100.00)+"%, ");
		System.out.print(    (int)( countB[2] /  (countA[2]+countB[2])  * 100.00)+"%, ");
		System.out.print(    (int)( countB[3] /  (countA[3]+countB[3])  * 100.00)+"%] = ");
		if ((countB[0] /  (countA[0]+countB[0])  ) < .50) {										//extroverted or introverted?
			System.out.print("E"); 
		} else {
			System.out.print("I");
		}
		if ((countB[1] /   (countA[1]+countB[1])  ) < .50) {									//senses or intuitions?
			System.out.print("S");
		} else {
			System.out.print("N");
		}
		if ((countB[2] /   (countA[2]+countB[2])  ) < .50) {									//thinking or feeling?
			System.out.print("T");
		} else {
			System.out.print("F");
		}
		if ((countB[3] /   (countA[3]+countB[3])  ) < .50) {									//judge or perception?
			System.out.println("J");
		} else {
			System.out.println("P");
		}
	}
}

