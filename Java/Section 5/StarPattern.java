public class StarPattern {
    public static void main(String args[]) {

        for (int i = 1; i <= 4; i++) { // number of rows
            for (int j = 1; j <= i; j++) { // number of stars in a row
                System.out.print("*");
            }

            System.out.println();
        }
    }
}