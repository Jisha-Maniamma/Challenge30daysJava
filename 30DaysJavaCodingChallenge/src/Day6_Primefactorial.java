/*
 * to fing out the prim factor of a given number 
 * for 8=2*2*
 * if 8%4==0 print 4/2
 * then(8/2) becomes n
 */
public class Day6_Primefactorial {
	  public static void main(String[] args) { 
    int n=8;
    System.out.print("The prime factorization of " + n + " is: ");
    
    for(int fact=2;fact*fact<=n;fact++) {
    	while(n%fact==0) {
    		System.out.print(fact+"");
    		n=n/fact;
    	}
    	
    }
 
    
	  }
}