import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Day7_average {
	static int sum=0;static int count=0;
public static void main(String[] args) {
	try {
		FileWriter fileIn=new FileWriter("UserInput.txt");
		fileIn.write("1,2,3,4,5,6,7,9,10");
		fileIn.close();	
	FileReader fileOut=new FileReader("UserInput.txt");
	Scanner a=new Scanner(fileOut);
	a.useDelimiter(",");
	while(a.hasNext()) {
		sum+=a.nextInt();
		count++;
	}
	System.out.println("the average of numbers is "+(sum/count));
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}}