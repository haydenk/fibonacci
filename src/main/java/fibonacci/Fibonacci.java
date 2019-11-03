package fibonacci;

import java.util.ArrayList;
import java.util.Arrays;

public class Fibonacci {
    public int recurse(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return this.recurse(n - 1) + this.recurse(n - 2);
    }
    public int optimized(int n) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1));

        for (int i = 2; i < n+1; i++) {
            list.add(list.get(i -1) + list.get(i - 2));
        }

        return list.get(n);
    }
}
