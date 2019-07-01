/*
 * lesson learned-
 * 1/j !=1.0/j 
 * 
 * double mae zyada results milta hae (jyada decimal points)
 * than float
 * than int
 */
public class Day6_HarmonicNumber {
	public static void main(String[] args) {
		int i=10,j;
		double sum=0;
		for(j=1;j<=i;j++) {
			sum+=1.0/j;}
		System.out.println(sum);
	}

}
