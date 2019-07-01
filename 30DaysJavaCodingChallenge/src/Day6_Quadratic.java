/*
 * given a b c solve ax^2+bx+c ka roots
 * (-b+sqrt(b^2-4ac))/2
 * (-b-sqrt(b^2-4ac))/2
 */
public class Day6_Quadratic {
	public static void main(String[] args) {
		double a=Double.parseDouble("-4");
		double b=Double.parseDouble("-8");
		double c=Double.parseDouble("3");
		
		double Root=b*b-4*a*c;
		double SquareRoot=Math.sqrt(Root);
		double r1=(-b+SquareRoot)/2;
		double r2=(-b-SquareRoot)/2;
		System.out.println(r1+" ;"+r2);
		
	}

}
