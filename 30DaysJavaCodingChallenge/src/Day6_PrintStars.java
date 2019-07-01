/*
 * To print-
 *  * * * * * * * * * * * * * * * * * * * * 1
 *  * *   *   *   *   *   *   *   *   *   * 2
 *  *   *     *     *     *     *     *     3
 *  * *   *       *       *       *       * 4
 *  *       *         *         *         * 5
 *  * * *     *           *           *     6
 *  *           *             *             7
 *  * *   *       *               *         8
 *  *   *           *                 *     9
 *  * *     *         *                   * 10
 *  *                   *                   11
 *  * * * *   *           *                 12
 *  *                       *               13
 *  * *         *             *             14
 *  *   *   *                   *           15
 *  * *   *       *               *         16
 *  *                               *       17
 *  * * *     *     *                 *     18
 *  *                                   *   19
 *  * *   * *         *                   * 20
 * 
 */
public class Day6_PrintStars {
public static void main(String[] args) {
	int n=Integer.parseInt("20");
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++)
		{
			if(j%i==0 || i%j==0)
				System.out.print("*");
			else 
				System.out.print(" ");
				}
	System.out.println(" "+i);}
}
}
