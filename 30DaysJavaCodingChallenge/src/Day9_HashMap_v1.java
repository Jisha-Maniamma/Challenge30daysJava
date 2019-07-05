import java.util.HashMap;
import java.util.Map;

public class Day9_HashMap_v1 {
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		System.out.println("Initializing the list of elements.."+hm);
		hm.put(100, "Jisha");
		hm.put(200,"Krishnan");
		hm.put(300, "Radha");
		System.out.println("\r\nasking put() method"+hm);
		
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		hm.putIfAbsent(400, "India");
		System.out.println("\r\nafter adding putIfAbscent"+" "+hm);
		
		for(Map.Entry m: hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
			
		HashMap<Integer,String> hmm=new HashMap<Integer,String>();
		hmm.put(500, "hello");
		hmm.putAll(hmm);
		for(Map.Entry m:hmm.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		hmm.remove(100);
		System.out.println("\r\n"+hmm);

		hmm.remove(200,"Krishnan");
		System.out.println("\r\n"+hmm);

	}

}
