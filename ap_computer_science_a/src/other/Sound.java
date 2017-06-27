package other;

import java.util.Arrays;

public class Sound {

	/* the array of values in this sound; guaranteed not to be null */
	//private int [] samples = {40, 2532, 17, -2300, -17, -4000, 2000, 1048, -420, 33, 15, 2030, 3};
	private int [] samples = {0, 0, 0, 0, -14, 0, -35, -39, 0, -7, 16, 32, 37, 29, 0, 0};

	public void getSamples () {
		for (int i = 0; i <= this.samples.length-1; i++) {
			System.out.print(this.samples[i]+",");
		}
		System.out.println();
	}
	public int limitAmplitude (int limit) {
		/* change those values in this sound than have an amplitude greater than the limit 
		* values greater than the limit are changed to limit
		* values less then -limit are changed to -limit
		* @param limit the amplitude limit
		* Precondition: limit >= 0
		* @return the number of values in this sound that this method changed
		*/
		int count=0;
		for (int i = 0; i <= this.samples.length-1; i++) {
			if (this.samples[i] > limit) {
				this.samples[i] = limit;
				count++;
			}
			if (this.samples[i] < -limit) {
				this.samples[i] = -limit;
				count++;
			}
		}
		return count;
	}	
	public void trimSilenceFromBeginning () {
		/* removes all silence from the beginning of this sound
		 * silence is represented by a value of 0 
		 * Precondition: samples contain at least on nonzero value
		 * Postcondition: the length of samples reflects the removal of starting silence
		 */
		int i=0;
		while (this.samples[i] == 0 && i <= this.samples.length-1) {			
			i++;
		}
		int [] r = new int [this.samples.length - i];
		for (int j=0; j <= r.length-1; j++) {
			r[j] = this.samples[i];
			i++;
		}
		this.samples = r;
	}
	public static void main(String[] args) {
		
		Sound s = new Sound();
		s.getSamples();
		s.trimSilenceFromBeginning();
		s.getSamples();
	}

}
