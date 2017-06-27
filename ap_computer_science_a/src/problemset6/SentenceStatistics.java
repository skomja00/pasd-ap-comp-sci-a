package problemset6;

public class SentenceStatistics {

	public static void main(String[] args) {
		// report statistics about words in an input sentence
		scanner("The quick brown fox jumped over the lazy dog.");
	}
	public static void scanner (String phrase) {
		int sentenceLen=phrase.length();
		int wordLen=0;
		int wordCount=0;
		double avgWordLen=0;
		for (int i=0;i<=phrase.length()-1;i++) {
			if (Character.isWhitespace(phrase.charAt(i)) || phrase.charAt(i)=='.') {
				avgWordLen=avgWordLen+wordLen;
				wordCount++;
				wordLen=0;
			} else {
				wordLen++;
			}			
		}
		avgWordLen=avgWordLen/wordCount;
		System.out.println("There are "+wordCount+" words in your sentence with a total length of "+sentenceLen+" characters.");
		System.out.println("Your sentence has an average word length of "+avgWordLen+" letters.");
	}
}
