package ctci.util;

import java.util.Random;

public class Util {

    public static int[] randIntegerArray(int n) {
        var rand = new Random();
        var arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] =rand.nextInt();
        }

        return arr;
    }
}
