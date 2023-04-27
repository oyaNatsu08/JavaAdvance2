public class CombinationCalc {
    public static int Calculate(int n, int r) {
        if (n <= 0 || r <= 0) {
            return -1;
        } else if (r > n) {
            return -1;
        } else {
            int result;
            int nSum = 1;
            int rSum = 1;
            int nrSum = 1;
            for (int i = n; i > 0; i--) {
                nSum *= i;
            }
            for (int j = r; j > 0; j--) {
                rSum *= j;
            }
            for (int k = n - r; k > 0; k--) {
                nrSum *= k;
            }

            result = nSum / (nrSum * rSum);

            return result;
        }
    }
}
