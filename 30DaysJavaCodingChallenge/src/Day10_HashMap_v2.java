import java.util.HashMap;
import java.util.Map;

public class Day10_HashMap_v2 {

	public static void main(String[] args) {
		//using new class Address instead of regular class string
		HashMap<Integer,Address> m=new HashMap<Integer,Address>();
		//creating object fro the class
		Address a=new Address(105,"Abc","xyz",12340);
		Address a1=new Address(110,"xyz","apg",14355);
		//inserting the values into HashMap
		m.put(1,a);
		m.put(2,a1);
		/*
		 * sirf h.getValue() gives address 
		 * toh us address ka value show karnae ke liyae  -
		 * Address aa=h.getValue()
		 * then aa.HouseNo
		 */
		
		for(Map.Entry<Integer, Address> h:m.entrySet()) {
			Address aa=h.getValue();
			System.out.println(h.getKey()+" "+aa.HouseNo+" "+aa.street+" "+aa.location+" "+aa.pin);
			
		}
		
	}}
//hum public nahi use kartae infront of this class nahi toh nayae file mae 
//banana padega
class Address {
	int HouseNo; int pin;
	String street; String location;
	// creating constructor for the class usedc in Has Map
	public Address(int HouseNo,String street,String location,int pin) {
		this.HouseNo=HouseNo;
		this.street=street;
		this.location=location;
		this.pin=pin;
	}
}
