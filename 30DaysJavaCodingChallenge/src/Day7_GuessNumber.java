import java.util.Scanner;

/*
 *  I'm thinking of a number between 1 and 1,000,000 
 *  What's your guess? 500000 
 *  Too high 
 *  What's your guess? 250000 
 *  Too low 
 *  What's your guess? 375000 
 *  Too high 
 *  What's your guess? 312500 
 *  Too high 
 *  What's your guess? 300500 
 *  Too low 
 */
public class Day7_GuessNumber {
	static int n=1,m=25;
	static int secret;
public static void main(String[] args) {
	System.out.println("I'm thinking of a number between"+n+" and "+m);
	//System.out.print("What's your guess");
		secret=n+(int)(Math.random()*m);
		int guess=0;
		while(guess!=secret)
		 {
			Scanner a=new Scanner(System.in);
			int num=a.nextInt();
			if(num<secret)
				System.out.println("Too low");
			else if (num> secret)
				System.out.println("Too high");
			else
				System.out.println("you win");
		}
	}
}
