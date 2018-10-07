
public class majority {
	public static boolean majoritycs(boolean a, boolean b, boolean c) {
		boolean x = (a && b) || c;
		boolean y = (b && c) || a;
		boolean z = (c && a) || b;
		boolean w = (x || y || z);
		return w;
	}
}
