import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionUsingJava {

	public static void main(String[] args) {
		
		System.out.println("Regular Expression using Java");
		String inputString ="hey  hello 0 1, how subramanian 1 , 7m3";
		//declare pattern
		// "\\+d\\+d\\*d ^\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}$
		String regex = "\\d+";  // \+d 
		Pattern pattern=Pattern.compile(regex);
		Matcher digitMatcher =pattern.matcher(inputString);
		System.out.println("Source String "+ inputString);
		while(digitMatcher.find()) {
			System.out.println(digitMatcher.group());

		}
		
		
	}

}
