package ctci.util;

import java.util.Random;

public class Util {

    public static int[] randIntegerArray(int n, int bound) {
        var rand = new Random();
        var arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] =rand.nextInt(bound);
        }

        return arr;
    }
}
