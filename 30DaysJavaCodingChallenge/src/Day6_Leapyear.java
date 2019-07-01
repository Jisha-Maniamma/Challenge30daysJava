/*
 * To find a year is leap year or not
 * 
 * leap year ->divisiable by 4 , never divisible by 100, sometimes dvisible by 400
 * 
 * best approach && pehlae khatam karo then ||
 * order change karnae se output 1900 ka change ho raha hae
 * 
 */
public class Day6_Leapyear {
public static void main(String[] args) {
	
	int[] years= {2004,1991,1900,2001,2000};
	for(int y:years) {
		if(y%4==0 && y%100!=0|| y%400==0 ) {
			System.out.println("leap year");
		}
		else
		    System.out.println("not leap year");
	}
}
}
