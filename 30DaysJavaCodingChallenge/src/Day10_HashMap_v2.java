import java.util.HashMap;
import java.util.Map;

public class Day10_HashMap_v2 {

	public static void main(String[] args) {
		HashMap<Integer,Address> m=new HashMap<Integer,Address>();
		Address a=new Address(105,"Abc","xyz",12340);
		Address a1=new Address(110,"xyz","apg",14355);
		
		m.put(1,a);
		m.put(2,a1);
		for(Map.Entry<Integer, Address> h:m.entrySet()) {
			Address aa=h.getValue();
			System.out.println(h.getKey()+" "+aa.HouseNo+" "+aa.street+" "+aa.location+" "+aa.pin);
			
		}
		
	}}

class Address {
	int HouseNo; int pin;
	String street; String location;
	 public Address(int HouseNo,String street,String location,int pin) {
		this.HouseNo=HouseNo;
		this.street=street;
		this.location=location;
		this.pin=pin;
	}
}
