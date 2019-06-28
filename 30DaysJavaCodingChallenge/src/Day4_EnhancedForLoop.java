/*
 * This program uses the enhanced for loop
 * 
 * create a list and manupulate the list in following ways-
 * 
 * 1.print the list
 * 2.add all the elemnets in the list
 * 3.find the maximum number in the given list
 * 4.add 1 to each element of the list and print the list
 * 
 */
public class Day4_EnhancedForLoop {
	static int sum=0; static int[] c;
public static void main(String[] args) {
	int[] list= {1,2,3,4,5,6};
	
	print(list);
	System.out.println("\r\n"+"elements addition is..."+addElements(list));
	System.out.println("max. of elements in list is..."+maxOfList(list));
	addone(list);print(list);
	System.out.println("\r\n"+"elements addition is..."+addElements1(list));
	//error...addOne1(list);print(list);
	}
static void print(int[] b) {
	for(int i=0;i<b.length;i++) 
		System.out.print(b[i]);
	}
static int addElements(int[] b) {
	for(int c: b)
		sum+=c;
    return sum;
}
static int maxOfList(int[] b) {
	int max = b[0];
	for(int i=1;i<b.length;i++) {
		if(max<b[i]) {
			max=b[i];
		}
		else {
			max=b[i+1];
		}
	}
	return max;
}
static void addone(int[] b) {
	for(int i=0;i<b.length;i++)
	b[i]++;	
}
///////////////////////////////////////////////////
static int addElements1(int[] b) {
	int sum=0;
	for(int i=0;i<b.length;i++) {
	sum+=b[i];	
	}
	return sum;
}

/////////////
/*
 * is wrong coding
 */
/*static void addone1(int[] b) {
	for(int c: b) {
		b=b+1;
	}
}*/
}
