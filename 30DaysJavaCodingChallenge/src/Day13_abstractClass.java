/*
 * Example of abstract class
 * 
 */
 abstract class Dog{
	abstract void makesound();
	
}
public class Day13_abstractClass extends Dog{
	void makesound() {
		System.out.println("Boww");
	}
	public static void main(String[] args) {
		Dog d=new Day13_abstractClass();
		d.makesound();
	}
}