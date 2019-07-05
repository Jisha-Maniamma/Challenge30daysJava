/*
 * To convert character to string and vice versa
 *  author{@Jisha}
 */
public class Day9_Conversion {
	static int count=0;
	public static void main(String[] agrs) {
		/*
		 * Method1 using Character as obj.
		 */
		char a='a';
		String s=Character.toString(a);
		System.out.println(s);
		
		/*
		 * Method2 using String as object
		 */
		String s1=String.valueOf(a);
		System.out.println(s1);
		
		/*
		 * to convert string to character
		 */
		String ss="hello Jisha";
		char p=ss.charAt(3);
		System.out.println(p);
		
		/*
		 * To print all the characters
		 */
		for(int i=0;i<ss.length();i++) {
			System.out.print(ss.charAt(i));
		    System.out.print(",");}
		
		/*
		 * to count the occurrence of 'h' in string
		 */
		for(int i=0;i<ss.length();i++) {
			if(ss.charAt(i)=='h')
				count++;
				
		} System.out.println("\nOccurrence of h is"+" "+count);
	}

}
