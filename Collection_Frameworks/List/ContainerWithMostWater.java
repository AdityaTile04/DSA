package List;

import java.util.ArrayList;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(optimized(list));
    }

    public static int bruteForce(ArrayList<Integer> list) {
        int n = list.size();
        int water = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int height = Math.min(list.get(i), list.get(j));
                int width = j - i;
                int currWater = height * width;
                water = Math.max(water, currWater);
            }
        }
        return water;
    }

    public static int optimized(ArrayList<Integer> height) {
        int lp = 0, rp = height.size() - 1;
        int maxWater = 0;
        while (lp < rp) {
            int h = Math.min(height.get(lp), height.get(rp));
            int w = rp - lp;
            int currWater = h * w;
            maxWater = Math.max(maxWater, currWater);

            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;
    }
}
