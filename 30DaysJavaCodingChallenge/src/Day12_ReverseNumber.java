import java.util.Scanner;

public class Day12_ReverseNumber {
static int reverse=0;
	public static void main(String[] args) {

Scanner a=new Scanner(System.in);
int aa=a.nextInt();
/*while(aa!=0) {
	reverse=reverse*10;
    reverse+=aa%10;
    aa/=10;
	}*/

reverse(aa);

System.out.println(reverse);

	}
	
	static void reverse(int s) {
		if(s<10) {
			System.out.print(s);
		    return;}
		else
			System.out.print(s%10);
		    reverse(s/10);
	}

}
