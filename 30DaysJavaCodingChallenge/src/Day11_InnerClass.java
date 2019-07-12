
public class Day11_InnerClass {
private int age=27;private static int height=147;
	 class Day11_InnerInnerClass{
		void msg() {System.out.println("age:"+age);}
		}
	
	 //agar class static inside another class
	 // then,,,,variable must also be static
	 
	 static class Day11_InnerInnerrClass{
		void msgg() {
			System.out.println("height"+height);
		}
		static void msss() {
			System.out.println("this is my details");
		}
	
	}
	
	public static void main(String[] args) {
		Day11_InnerClass a=new Day11_InnerClass();
		Day11_InnerInnerClass in=a.new Day11_InnerInnerClass();
	
		
		//static class ko call karna ho toh->
		Day11_InnerClass.Day11_InnerInnerrClass inn= new Day11_InnerClass.Day11_InnerInnerrClass();
		//if method ansd inner class are static
		Day11_InnerClass.Day11_InnerInnerrClass.msss();
		in.msg();
		inn.msgg();
	}
}
