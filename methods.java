/**
 * 
 * @author NPokhrel
 *
 */
public class methods {

	public static long methodA(long x) { // setting methodA
		long sum = 0;
		for (long i = 1; i <= x; i++) {
			sum = sum + i;
		}
		return sum;

	}

	// using second method
	public static long methodB(long x) { // setting methodB
		long sum = 0;
		for (long i = 1; i <= x; i++) {
			for (long j = 1; j <= i; j++) {
				sum = sum + 1;
			}
		}
		return sum;
	}

	// using third method
	public static long methodC(long x) { // setting methodC
		long sum = x * (x + 1) / 2;
		return sum;

	}
}
