package problemset6;

public class RemoveTag {

	public static void main(String[] args) {
		// remove matching mark up tags
		System.out.println(removeTag("<b>Strings are immutable</b>"));
		System.out.println(removeTag("<CENTER>All About Joel Embiid</CENTER>"));
		System.out.println(removeTag("<h1>All tags do not match</h2>"));
		System.out.println(removeTag("No HTML here!"));
	}
	public static String removeTag(String s) {
		String tag="";
		String endTag="";
		int beg=s.indexOf("<")+1;
		if (s.indexOf("<")<0) return s;
		int end=s.indexOf(">");
		tag=s.substring(beg,end);
		endTag="</"+tag+">";
		if (s.indexOf(endTag)>0) {
			return s.substring(end+1,s.indexOf(endTag,end));} 
		else {
			return s;			
		}
	}
}
