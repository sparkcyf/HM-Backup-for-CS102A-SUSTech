/*sparktour*/
public class Reverse {
    public static void main(String[] args) {
        String ip = args[0];
        int len = ip.length();
        char[] ar = new char[len];
        for (int c = 0; c < len; c++) {
            ar[c] = ip.charAt(len - c - 1);
        }
        System.out.print(ar);
    }
}
