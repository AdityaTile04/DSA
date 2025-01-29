public class Substring {

    public static String printSubstring(String str, int si, int ei) {
        String res = "";
        for (int i = si; i < ei; i++) {
            res += str.charAt(i);
        }
        return res;

    }

    public static void main(String args[]) {
        String str = "HelloWorld";
        System.out.println(printSubstring(str, 0, 5)); // inbuilt function
        System.out.println(str.substring(5, 10)); // created funtion

        String name = "AdityaTile";
        System.out.println(name.substring(0, 6));
        System.out.println(name.substring(6, 10));
    }
}
