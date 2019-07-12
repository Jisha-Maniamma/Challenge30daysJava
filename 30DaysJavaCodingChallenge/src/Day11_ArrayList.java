import java.util.ArrayList;
import java.util.Iterator;

public class Day11_ArrayList {

	public static void main(String[] args) {
		ArrayList<Address> a=new ArrayList<Address>();
		Address a1=new Address(120, "aghra", "UP", 456789);
		a.add(a1);
		for(Address b:a) {
		System.out.println(b.HouseNo+" "+b.location+" "+b.street+" "+b.pin);
		}	
		ArrayList<String>aa=new  ArrayList<String>();
		aa.add("Jisha");
		aa.add("Jispy");
		aa.add(0,"pillai");
		System.out.println(aa);
		Iterator aa1=aa.iterator(); 
		
		while(aa1.hasNext()) {
			
			System.out.println(aa1.next());
		}

	}

}
