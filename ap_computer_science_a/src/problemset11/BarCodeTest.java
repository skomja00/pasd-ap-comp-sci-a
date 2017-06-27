package problemset11;

public class BarCodeTest {

	public static void main(String[] args) {

		
		//1. Instantiate a BarCode object using the zip code 19460 and print the bar code using the BarCode method getBarCode() .
		BarCode zip19460 = new BarCode ("19460");
		System.out.println(zip19460.getBarCode());
		
		//2. Instantiate a BarCode object using ||:|:::|:|:||::::::||:|::|:::||| 
		//If the bar code is valid, print the zip code using the BarCode getZipCode() method. Otherwise print an error message.
		BarCode zip95014 = new BarCode("||:|:::|:|:||::::::||:|::|:::|||");
		System.out.println(zip95014.getZipCode());
		
		//3. Instantiate a BarCode object using some other zip code and print the bar code.
		BarCode zip08109 = new BarCode ("08109"); 
		System.out.println(zip08109.getBarCode());
		
		//4. Instantiate a BarCode object using your bar code in #3 and print the equivalent zip code.
		BarCode bar3 = new BarCode ("|||:::|::|::::||||:::|:|::::|:||"); 
		System.out.println(bar3.getZipCode());
		
		//5. Instantiate a BarCode object using ||:::||::|:::|:|:|::|||:::||:::|
		//If the bar code is valid print the zip code using the BarCode getZipCode() method. Otherwise print an error message.
		BarCode bar5 = new BarCode ("||:::||::|:::|:|:|::|||:::||:::|"); 
		System.out.println(bar5.getZipCode());
		
		//7. Instantiate a BarCode object using ||:|:::|:|:||::::::||:|::|:::||
		//If the bar code is valid, print the zip code using the BarCode getZipCode() method. Otherwise print an error message.
		BarCode bar7 = new BarCode ("||:|:::|:|:||::::::||:|::|:::||"); 
		System.out.println(bar7.getZipCode());
		
		//8. Instantiate a BarCode object using ||:|:::|:|:||::::::||:|::|:::||:
		//If the bar code is valid, print the equivalent zip code using the BarCode getBarCode() method. Otherwise print an error message.
		BarCode bar8 = new BarCode ("||:|:::|:|:||::::::||:|::|:::||:"); 
		System.out.println(bar8.getZipCode());


	
	}
	
	
	

}
