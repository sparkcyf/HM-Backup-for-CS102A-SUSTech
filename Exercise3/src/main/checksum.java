
public class checksum {
	public static void main(String[] args) {
		String ip = args[0];
		// even digit
		int ed = 0;
		for (int e = 1; e < 10; e = e + 2) {
			char charat = ip.charAt(e);
			int edc = 2 * Integer.parseInt(String.valueOf(charat));
			if (edc < 10) {
				ed = ed + edc;
			} else {
				String tedc = String.valueOf(edc);
				int sume = Integer.parseInt(String.valueOf(tedc.charAt(0)))
						+ Integer.parseInt(String.valueOf(tedc.charAt(1)));
				ed = ed + sume;
			}
		}
		// odd digit
		int od = 0;
		for (int o = 0; o < 10; o = o + 2) {
			od = od + Integer.parseInt(String.valueOf(ip.charAt(o)));
		}
		int sum = ed + od;
		int d = 0;
		for (; d <= 9; d++) {
			if ((sum + d) % 10 == 0)
				break;
		}
		String ans = ip + String.valueOf(d);
		System.out.print(ans);
	}
}
