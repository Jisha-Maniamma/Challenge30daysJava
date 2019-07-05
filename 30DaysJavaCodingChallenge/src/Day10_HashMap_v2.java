import java.util.HashMap;
import java.util.Map;

public class Day10_HashMap_v2 {

	public static void main(String[] args) {
	HashMap<Integer,Address>a=new HashMap<Integer,Address>();
	//adding data to HashMap
	Address a1=new Address(305,"Hibikino",8081035);
	Address a2=new Address(304,"AnuVijay",627120);
	a.put(1, a1);
	a.put(2,a2);
	for(Map.Entry<Integer,Address> m:a.entrySet()) {
		
		Address aa=m.getValue();
		//System.out.println(m.getKey());
		System.out.println(m.getKey()+" "+aa.roomNo+" "+aa.place+" "+aa.postal);
	}
	
	}
	
		
	}

class Address{
	int roomNo;String place;int postal;
	public Address(int roomNo,String place,int postal) {
		this.roomNo=roomNo;
		this.place=place;
		this.postal=postal;
		
	}
}
