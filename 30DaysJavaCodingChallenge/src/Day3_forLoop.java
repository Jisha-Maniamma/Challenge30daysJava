/*
 * this program gives an introduction to for loop
 * 
 * To output the factorial of a number
 * for a given number num.. the factorial id displayed as fact
 */
//////////////////////////////////////////////////////////////////////
//METHOD1
/*public class Day3_forLoop {
	static int num=10;
	static int fact=1;
	public static void main(String[] args) {
		System.out.println(fact(num));
	}
	static int fact(int n) {
		//if (n==1)
		//	fact=1;
		//else {
			for(int i=2;i<=n;i++) {
			fact*=i;
	//		}
		}
		return fact;
		}
		
}
*/
/////////////////////////////////////////////////////////////////////////
//METHOD2
/*public class Day3_forLoop{
	public static void main(String[] args) {
		final int num=1;
		for(int i=0;i<num;i++)
			System.out.println(fact(i));
	}
	public static int fact(int n) {
		int result =1;
		for (int i=2;i<=n;i++)
			result*=i;
		return result;
	}
}
*/
//////////////////////////////////////////////////////////////////////////
//METHOD3
public class Day3_forLoop{
	static int num=3;
	static int fact;
	public static void main(String[] args) {
	System.out.println(fact(num));
		
	}
	static int fact(int n) {
		if (n==0) {
			fact=1;
		}
		else {
			fact=n*fact(n-1);
			
		}
	return fact;
	}
	}