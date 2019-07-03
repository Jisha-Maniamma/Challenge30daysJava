
public class Day8_BouncingBall_V1 {
	static double rx=0.480,ry=0.860, radius=0.05;
	 static double vx=0.015,vy=0.0260;
	public static void main(String[] args) {
		StdDraw.setXscale(-1.0, 1.0);
        StdDraw.setYscale(-1.0, 1.0);
        StdDraw.enableDoubleBuffering();
		
		while(true) {
			if (Math.abs(rx + vx) > 1.0 - radius) vx = -vx;
            if (Math.abs(ry + vy) > 1.0 - radius) vy = -vy;
		
			rx=rx+vx;
			ry=ry+vy;
			StdDraw.clear(StdDraw.LIGHT_GRAY);

	StdDraw.setPenColor(StdDraw.BLACK);
	StdDraw.filledCircle(rx, ry, radius);
	StdDraw.show();
	 StdDraw.pause(20);
}
}}
