package weekender_14;

public class GrayImage {

	public static final int BLACK = 0;
	public static final int WHITE = 255;
	
	/** The 2-dimensional representation of this image. Guaranteed not to be null. 
	 * All values in the array are within the range [BLACK,WHITE] inclusive.
	 */
	//private static int [] [] pixelValues = 
	//	{
	//			{255, 184, 178,  84, 129},
	//			{ 84, 255, 255, 130,  84},
	//			{ 78, 255,   0,   0,  78},
	//			{ 84, 130, 255, 130,  84} 
	//	};
	private int [] [] pixelValues; 
	//	{
	//			{221, 184, 178,  84, 129},
	//			{ 84, 255, 255, 130,  84},
	//			{ 78, 255,   0,   0,  78},
	//			{ 84, 130, 255, 130,  84} 
	//	};
	
	GrayImage (int [][] pV) {
		pixelValues = pV;
		processImage();
	}
	
	public void print() {
		for (int [] row : pixelValues) {
			for (int col : row ) {
				System.out.print(col+" ");
			}
			System.out.println("");
		}
	}
	
	/** @return the total number of white pixels in this image. 
	 * Postcondition: this image has not been changed. 
	 */
	public int countWhitePixels () {
		int count = 0;
		for (int [] row : pixelValues) {
			for (int col : row) {
				if (col == WHITE) {
					count++;
				}
			}
		}
		return count;
	}
	
	/** process this image in row-major order and decreases the values of each pixel at 
	 * position (row,col) by the value at position (row+2, col+2) if it exists. 
	 * resulting in values that would be less than BLACK are replaced by BLACK. 
	 * Pixels for which there is no pixel at position (row+2, col+2) are unchanged. 
	 */
	private void processImage () {
		for (int row = 0; row < pixelValues.length; row++) {
			for (int col = 0; col < pixelValues[0].length; col++) {
				if ((row + 2) < pixelValues.length 
				&&  (col + 2) < pixelValues[0].length) {
					pixelValues [row] [col] -= pixelValues [row + 2] [col + 2];
				}
				if (pixelValues [row] [col] < BLACK) {
					pixelValues [row] [col] = BLACK;
				}
			}
		}
	}

}
