/*sparktour*/
public class eq {
	public static boolean eqcs(int[] a, int[] b) {
		int t = 0;
		if (a.length == b.length) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] != b[i]) {
					t = 1;
				} else
					continue;
			}
		} else
			t = 1;
		if (t == 0)
			return true;
		else
			return false;
	}
}
