/*
 * Day2 Java challenge
 * calling a static method from inside the class
 * this method print out - Hello world
 * 
 * print1 method calls print2 method (which prints - you are printing this message)
 * 
 */
public class Day2_callMethod {
	public static void main(String[] args) {
		helloWorld();
		//calling a method print1
		print1();
	}
static void helloWorld() {
	System.out.println("Hello world");
}
static void print1() {
	//calling a method print2
	print2();
}

static void print2() {
	System.out.println("you are printing this message\r\n");
	System.out.println("Bye..");
}
}
