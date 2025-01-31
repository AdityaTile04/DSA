public class InternMethod {
    public static void main(String args[]) {
        String str1 = "Aditya";
        String str2 = "Aditya";
        String str3 = new String("Aditya");
        String str4 = str3.intern();
        System.out.println(str1 == str2); // true
        System.out.println(str1 == str3); // false
        System.out.println(str1 == str4); // true
    }
}