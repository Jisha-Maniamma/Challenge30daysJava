import java.util.Scanner;

/*
 * To check if an input character is a string or not
 */
public class Day9_Vowel {
	public static void main(String[] args) {
		System.out.println("Enter a acharcter");
		Scanner s=new Scanner(System.in);
		boolean b=false;
		/*
		 * takes the initial character to check for vovel
		 */
		char a=s.next().charAt(0);
		
		switch(a) {
		/*
		 * agar a , e,i,o,u ho toh only one case statement is required
		 */
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':b=true;
		}
		if (b) {
			System.out.println("its a vovel");
		}
		if(a>='a'&& a<='z'|| a>='A'&& a<='Z')
			System.out.println("its a valid consonant");
		else
			System.out.println("not a valid consonent");
		
	}

}
