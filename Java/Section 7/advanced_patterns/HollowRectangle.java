public class HollowRectangle {

    public static void hollowRectangle(int totRow, int totCol) {
        // for no.of lines
        for (int i = 1; i <= totRow; i++) {
            // for columns
            for (int j = 1; j <= totCol; j++) {
                // cell = (i,j)
                if (i == 1 || i == totRow || j == 1 || j == totCol) {
                    // boundary
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String args[]) {
        hollowRectangle(10, 10);
    }
}