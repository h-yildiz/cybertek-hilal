package classes.repl_sorulari;

public class Question_178 {
	public static void main(String[] args) {
		
		System.out.println(mergeStrings("wooden", "spoon"));
		
	}
	public static String mergeStrings(String one, String two) {
	 String str = "";
	    int len = 0;

	    if (one.length() >= two.length())
	    {
	        len = one.length();
	    } else
	        len = two.length();

	    for (int i = 0; i < len; i++)
	    {

	        if (i < one.length())
	        {
	            str += one.charAt(i);
	        }

	        if (i < two.length())
	        {
	            str += two.charAt(i);
	        }

	    }
	    return str;
	}
}
