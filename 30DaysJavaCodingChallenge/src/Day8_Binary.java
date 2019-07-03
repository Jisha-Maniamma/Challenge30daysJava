import java.util.Scanner;

public class Day8_Binary {
	static int carry=0;static int i=0;
public static void main(String[] args) {
	int sum[]=new int[10];
	/*
	 * get inputs
	 */
	Scanner a=new Scanner(System.in);
	long binary1=a.nextLong();
	long binary2=a.nextLong();
	a.close();
	//System.out.println(binary1+""+binary2);
	while(binary1!=0 || binary2!=0)
	{
		/*
		 * %10 gets the last bit
		 * %2 gets the sum
		 * %2 gets the carry 
		 */
		sum[i]=(int)(((binary1%10)+(binary2%10)+carry)%2);
		carry=(int)(((binary1%10)+(binary2%10)+carry)/2);
		binary1/=10;
		binary2/=10;i++;
		}
	/*
	 * save carry to last bit
	 */
	if(carry!=0) {
		sum[i++]=carry;
	}
	/*
	 * print all the binary bits
	 */
	while(i>=0) {
		System.out.print(sum[i--]);
	}
}
}
