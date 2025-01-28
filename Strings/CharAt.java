public class CharAt {
    public static void printCharacters(String str) { // to print individual characters or to access any caharacters
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }

    public static void main(String args[]) {
        String fullName = "Aditya Tile";
        printCharacters(fullName);
    }
}
