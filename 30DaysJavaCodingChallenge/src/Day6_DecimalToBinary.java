/*
 * print decimal to binary
 * eg- 2 as 10;
 *     10 as 1010
 */
public class Day6_DecimalToBinary {
	static int pow=1; static int decimal=20;
	public static void main(String[] args) {
	
		/*
		 * get an decimal value
		 * 
		 * pow defines the power max closest power of 2 
		 * to this decimal value
		 * 
		 * for decimal 10->2^0,2^1,2^2,2^3 ..power is 8
		 * decimal/2 in while loop because it starts with 2 and not 2^0=1
		 * 
		 */
		while(pow<=decimal/2) {
			pow*=2;
			System.out.println(pow);
		}
		while(pow>0) {
			if(decimal<pow)
				{System.out.print(0);}
			else
				{System.out.print(1);
			    decimal-=pow;
				}
		/*
		 * power/2 for 8,4,2,1 change
		 */
			pow/=2;}
}
	
}
