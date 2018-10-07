/*sparktour*/
public class sqrt {
	public static double ntsqrt(double ip) {
		double t = ip;
		double eps = 1e-12;
		while (Math.abs(t*t-ip) > eps) {
			t = ((ip / (2 * t)) + 0.5 * t);
		}
		return t;
	}

	public static void main(String[] args) {
		double a = Double.parseDouble(args[0]);
		double op = ntsqrt(a);
		System.out.println(op);
	}
}
