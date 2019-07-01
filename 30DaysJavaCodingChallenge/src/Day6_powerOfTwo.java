/*
 * printing power of two 
 * 
 * for input n=6, print all the power of two from 2^0,2^1....2^6
 */
public class Day6_powerOfTwo {
	public static void main(String[] args) {
		int n=Integer.parseInt("10");
		int i=0;
		int two=2;
		int power=1;
		while (i<=n) {
			System.out.println(i+" "+power);
			power*=two;
			i++;
		}
		
	}

}
