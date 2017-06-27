package weekender_14;

public class questions {

	public static void main(String[] args) {
		int [] [] m = 
		{ 
				{0, 1, 2}, //row0-col0, row0-col1, row0-col2
				{4, 5, 6}, //row1 
				{7, 8, 9}, //row2 
		}; 
		//(B)
		for (int [] r : m) {
			for (int c : r) {
				System.out.print(c+" ");
			}
			System.out.println("");
		}
		//(E) NO!
		for (int c = 0; c < m.length; c++) {
			for (int r = 0; r < m[c].length; r++) {
				int x = m [r] [c];
				System.out.print(x+" ");
			}
			System.out.println("");
		}
		int [] [] mat =
			{ 
					{2,1,3,4}, //row0-col0, row0-col1, row0-col2
					{9,7,2,1}, //row1 
					{0,2,5,6}, //row2 
			}; 
		for (int r = 1; r < mat.length; r++) {
			for (int c = 1; c < mat[0].length; c++) {
				if ((r + c) % 2 == 0 ) {
					mat [r][c] = 2 * mat[r - 1][c - 1] + c;
				}
			}
		}
		System.out.println(mat[2][2]);

			int [] [] pixelValues = 
				{
					{221, 184, 178,  84, 129},
					{ 84, 255, 255, 130,  84},
					{ 78, 255,   0,   0,  78},
					{ 84, 130, 255, 130,  84} 
				};
			GrayImage g = new GrayImage(pixelValues);
			g.print();
		
	}
	public static void swap (Integer a, Integer b) {
		Integer temp = a; a = b; b = temp;
	}
	public static void swap (int [] a) {
		int temp = a [0]; a [0] = a[1]; a[1] = temp;
	}
	public static void swap (int [] a, int [] b) {
		int temp = a [0]; a[0] = b[0]; b [0] = temp;
	}
}
