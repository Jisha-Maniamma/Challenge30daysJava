/*
 * two objects circle and square
 */
import java.awt.Color;
import java.util.Random;

public class Day8_BouncingObjects {
	static double rx=0.480,ry=0.860, radius=0.05, perimeter=0.02;
	 static double vx=0.015,vy=0.0260,vvx,vvy,rry,rrx;
public static void main(String[] args) {
	Color c=new Color(100,100,100);
	Color c1=new Color(200,150,100);
	
	StdDraw.setXscale(-1.0,1.0);
	StdDraw.setYscale(-1.0,1.0);
	StdDraw.enableDoubleBuffering();
	 while(true) {
		 StdDraw.clear(c);
		/*
		 * touching bounday
		 * change direction
		 */
		 if(Math.abs(rx+vx)>1-radius) vx=-vx;
		 if(Math.abs(ry+vy)>1-radius) vy=-vy;
		 rx+=vx;
		 ry+=vy;
		rrx+=-vx;
		rry+=-vy;
		
		 StdDraw.setPenColor(c1);
		 StdDraw.filledCircle(rx, ry, radius);
		 StdDraw.filledSquare(rrx, rry, radius);
		 StdDraw.show();
		 StdDraw.pause(5);
		if((Math.abs((rx+radius)-(rry+radius))<=0.2) && (Math.abs((radius+ry)-(radius+rry))<=0.2)) {
			vx=-vx;
			
			c=randomColor();c1=randomColor();
		}
			 }
	
}
public static Color randomColor() {
	Random rand=new Random();
	int r=rand.nextInt(255);
	int g=rand.nextInt(255);
	int b=rand.nextInt(255);
	return new Color(r,g,b);
}
}
