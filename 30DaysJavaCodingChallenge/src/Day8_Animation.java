/*
 * Not able to display text on screen!
 * only prints cought on console :(
 */
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;

public class Day8_Animation {
	static double xx=0.234, xy=0.534,radius=0.05;
	static double vx=0.0234, vy=0.1534;
public static void main(String[] args) {
	StdDraw.text(0.2, 0.2, "cought");
	//StdDraw.setXscale(-1.0,+1.0);
	//StdDraw.setYscale(-1.0,+1.0);
	StdDraw.enableDoubleBuffering();
	int count=1;
	while(count<100) {
	if(Math.abs(xx+vx)>1.0-radius) vx=-vx;
	if(Math.abs(xy+vy)>1.0-radius)vy=-vy;
	xx+=vx;
	xy+=vy;
	
	PointerInfo a=MouseInfo.getPointerInfo();
	Point b=a.getLocation();
	double x=b.getX();double x1=Math.round(x/500);
	double y=b.getY();double y1=Math.round(y/500);
	
	StdDraw.clear();
	StdDraw.filledCircle(xx, xy, radius);
	StdDraw.setPenColor(StdDraw.BLUE);
	
	StdDraw.show();
	StdDraw.pause(105);
	/*
	 * check
	 */
	//System.out.println((Math.round(xx+radius)==x1) && (Math.round(xy+radius)==y1));
	//System.out.println((Math.abs(xx+radius)));
	//System.out.println((Math.abs(x1)));
	if((Math.round(xx+radius)==x1) && (Math.round(xy+radius)==y1))
		System.out.println("Cought");
	
	count++;
}
}}
