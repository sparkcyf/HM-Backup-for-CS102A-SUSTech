/*sparktour*/
public class lg {
	public static int lgcs(int n) {
		double tmp = 1;
		int x = 0;
		if (n < 1) {
			while (tmp > n) {
				tmp = tmp * 0.5;
				x = x - 1;
			}
		} else if (n > 1) {
			while (tmp < n) {
				tmp = tmp * 2;
				x = x + 1;
			}
		} else {
			x = 0;
		}
		return x;
	}
}
