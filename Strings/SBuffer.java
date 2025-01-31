public class SBuffer {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb);

        StringBuffer alphabets = new StringBuffer("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            alphabets.append(ch + " ");
        }
        System.out.println(alphabets);
    }
}
