
public class Day8_BouncingObjects {
	static double rx=0.480,ry=0.860, radius=0.05, perimeter=0.02;
	 static double vx=0.015,vy=0.0260;
public static void main(String[] args) {
	StdDraw.setXscale(-1.0,1.0);
	StdDraw.setYscale(-1.0,1.0);
	StdDraw.enableDoubleBuffering();
	 while(true) {
		 if(Math.abs(rx+vx)>1-radius) vx=-vx;
		 if(Math.abs(ry+vy)>1-radius) vy=-vy;
		 rx+=vx;
		 ry+=vy;
		
		 StdDraw.clear(StdDraw.YELLOW);
		 StdDraw.setPenColor(StdDraw.BLACK);
		 StdDraw.circle(rx, ry, radius);
		 StdDraw.square(rx+0.12, ry+0.12, radius);
		 StdDraw.show();
		 StdDraw.pause(20);
			 }
	
}
}
