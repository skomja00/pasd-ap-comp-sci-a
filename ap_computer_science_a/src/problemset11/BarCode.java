package problemset11;

public class BarCode {

	private String myZipCode = "";
	private String myBarCode = "";
		
	public BarCode (String code) {
		if (code.indexOf("|") >= 0) {
			//given a bar code. decode to a zip
			setBarCode (code);
			setZipCode (decode(code));
		} else { 
			//given a numeric zip code. encode as bar
			setZipCode (code);
			setBarCode (encode(code));
		}
 	}
	private String decode (String code) {
		/*tests the 32 symbol bar code myBarCode and returns the 5 digit zip code as a String. If invalid return "". */
		String temp = getBarCode();
		if (isValidBarCode(code)) {
			temp =  codeToDigit(temp.substring(01,06)) +
					codeToDigit(temp.substring(06,11)) +
					codeToDigit(temp.substring(11,16)) +
					codeToDigit(temp.substring(16,21)) +
					codeToDigit(temp.substring(21,26));
			return temp;
		}
		return "invalid bar code";
	}
	private String codeToDigit (String code) {
		/*each sum computed by weight of individual bars. The weights are 7, 4, 2, 1, and 0. */
		int digit = 0;
		if (code.compareTo("||:::") == 0) {
			return "0"; } 
		else {	
			if (code.charAt(0) == '|') {
				 digit = digit + 7;
			}
			if (code.charAt(1) == '|') {
				 digit = digit + 4;
			}
			if (code.charAt(2) == '|') {
				 digit = digit + 2;
			}
			if (code.charAt(3) == '|') {
				 digit = digit + 1;
			}
			if (code.charAt(4) == '|') {
				 digit = digit + 0;
			}
			return Integer.toString(digit);
		}
	}
	private boolean isValidBarCode (String code) {
		if (code.length() == 32) {
			if ((code.charAt(0) == '|' && code.charAt(31) == '|') &&      //each digit is encoded with 2 pipes and 3 : in some order
			    (code.substring(01,06).replace(":","").length() == 2) &&  //replace all : should be left a string of only 2 | (i.e. len=2)
			    (code.substring(01,06).replace("|","").length() == 3) &&  //replace all | should be left a string of only 3 : (i.e. len=3) 
			    (code.substring(06,11).replace(":","").length() == 2) &&  //check 2nd code/digit... 
			    (code.substring(06,11).replace("|","").length() == 3) &&    
			    (code.substring(11,16).replace(":","").length() == 2) &&  //3rd... 
			    (code.substring(11,16).replace("|","").length() == 3) &&    
			    (code.substring(16,21).replace(":","").length() == 2) &&  //4th... 
			    (code.substring(16,21).replace("|","").length() == 3) &&    
			    (code.substring(21,26).replace(":","").length() == 2) &&  //5th... 
			    (code.substring(21,26).replace("|","").length() == 3) &&   
			    (code.substring(26,31).replace(":","").length() == 2) &&  //check the check digit... 
			    (code.substring(26,31).replace("|","").length() == 3)) {    
					return true;
			}			
		}
		return false;
	}
	private String encode (String number) {
		/* tests 5 digit zip code and code myZipCode and returns the 32 symbol bar code */
		return 
			"|"+ //frame bar
			digitToCode(Character.getNumericValue(number.charAt(0))) +		
			digitToCode(Character.getNumericValue(number.charAt(1))) +		
			digitToCode(Character.getNumericValue(number.charAt(2))) +		
			digitToCode(Character.getNumericValue(number.charAt(3))) +
			digitToCode(Character.getNumericValue(number.charAt(4))) +
			digitToCode(getCheckDigit(number)) +
			"|"; //frame bar
	}
	private String digitToCode (int digit) {
		String [] codeTable = {
				"||:::",//0
				":::||",//1
				"::|:|",//2
				"::||:",//3
				":|::|",//4
				":|:|:",//5
				":||::",//6
				"|:::|",//7
				"|::|:",//8
				"|:|::" //9
		};
		return codeTable[digit];
	}
	private int getCheckDigit (String zip) {
		int total = 
				Character.getNumericValue(zip.charAt(0)) +
				Character.getNumericValue(zip.charAt(1)) +
				Character.getNumericValue(zip.charAt(2)) +
				Character.getNumericValue(zip.charAt(3)) +
				Character.getNumericValue(zip.charAt(4)) ; 
		if (total <=50 && total > 40) {
			return 50 - total;
		}
		if (total <=40 && total > 30) {
			return 40 - total;
		}
		if (total <=30 && total > 20) {
			return 30 - total;
		}
		if (total <=20 && total > 10) {
			return 20 - total;
		}
		if (total <=10 ) {
			return 10 - total;
		}
		return total;
	}
	public String toString () {
		return getZipCode()+" "+getBarCode();
	}
	private int getCheckDigit () {
		return 0;
	}
	public void setBarCode (String code) {
		myBarCode = code;
	}
	public void setZipCode (String code) {
		myZipCode = code;
	}
	public String getBarCode () {
		return myBarCode;
	}
	public String getZipCode () {
		return myZipCode;
	}
}
 