interface shows{
	void show();
}
public class Day11_NestedClass implements shows{
public void show() {
	System.out.println("hai...");
}
public static void main(String[] args) {
//static method anaengil matram i can write as
// System.out.println(show())
shows a=new Day11_NestedClass();
a.show();
}
}
