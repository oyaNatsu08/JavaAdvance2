import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    Map<Integer, Long> cache = new HashMap<>();

    public Fibonacci() {
        Map<Integer, Long> cache = new HashMap<>();
    }

    public Fibonacci(Map<Integer, Long> cache) {
        this.cache = cache;
    }

    public long calc(int num) {
        if (num <= 0) {
            return 0;
        } else if (num == 1 || num == 2) {
            return 1;
        }

        if (cache.containsKey(num)) {
            return cache.get(num);
        } else {
            long a = calc(num-1);
            long b = calc(num-2);
            long sum = a + b;
            cache.put(num, sum);
            return sum;
        }
    }
}
