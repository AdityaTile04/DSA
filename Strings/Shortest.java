public class Shortest {

    public static float printShortestPath(String path) {

        int n = path.length();
        int x = 0, y = 0;
        for (int i = 0; i < n; i++) {
            char direction = path.charAt(i);
            if (direction == 'N') {
                y++;
            } else if (direction == 'S') {
                y--;
            } else if (direction == 'E') {
                x++;
            } else {
                x--;
            }
        }
        int X2 = x * x;
        int Y2 = y * y;
        return (float) Math.sqrt(X2 + Y2);
    }

    public static void main(String args[]) {
        String s = "WNEENESENNN";
        System.out.println("shortest path is : " + printShortestPath(s));
    }
}
