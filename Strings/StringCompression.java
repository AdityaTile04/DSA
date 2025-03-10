public class StringCompression {

    public static String stringCompression(String str) {
        String newStr = "";
        int n = str.length();
        for (int i = 0; i < n; i++) {
            Integer count = 1;
            while (i < n - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if (count > 1) {
                newStr += count.toString();
            }
        }
        return newStr;
    }

    public static void main(String args[]) {
        String str = "aabbcc";
        System.out.println(stringCompression(str));
    }
}
