public class SB {
    public static void main(String arg[]) {
        StringBuilder sb = new StringBuilder("");
        sb.toString();

        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch + " ");
        }
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.reverse());
    }
}
