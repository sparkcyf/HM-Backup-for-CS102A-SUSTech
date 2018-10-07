/*sparktour*/
public class Deal {
	public static void main(String[] args) {
		// create the poker
		int n = Integer.parseInt(args[0]);
		String[] poker = new String[52];
		String[] suit = { "♠", "♥", "♣", "♦" };
		String[] num = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		// Suit LOOP
		for (int i = 0; i < 4; i++) {
			// Num LOOP
			for (int k = 0; k < 13; k++) {
				int pnum = (i) * 13 + (k);
				poker[pnum] = suit[i] + num[k];
			}
		}
		// shuffle
		for (int j = 0; j < 208; j++) {
			int r = (int) (52 * Math.random());
			int s = (int) (52 * Math.random());
			String temp = poker[r];
			poker[r] = poker[s];
			poker[s] = temp;
		}
		// print
		// LOOP PL
		for (int l = 0; l < n; l++) {
			// LOOP PS
			for (int m = 1; m <= 5; m++) {
				int ppn = l * 5 + m;
				if (m == 5) {
					System.out.println(" " + poker[ppn] + " ");
				} else if (m != 5) {
					System.out.print(" " + poker[ppn] + " ");
				}
			}
		}
	}
}
