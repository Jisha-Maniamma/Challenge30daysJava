import java.io.FileWriter;
import java.util.Scanner;

public class day7_average {
public static void main(String[] args) {
	try {

	int sum=0;
	int count=0;
	
	FileWriter f=new FileWriter("Numbers1.txt");
	f.write("1,2");
	f.close();
		
	
	Scanner a=new Scanner(System.in);
	int num=a.nextInt();
	while(a.hasNextInt()) {
		sum+=num;
		count++;
		//System.out.println(sum/count);
	}
	System.out.println(sum/count);
	}

catch(Exception e) {
	System.out.println(e);

}}}

