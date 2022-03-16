
public class cubesome {
    static int Check(int n, int sum) {
        for (int i = 0; i <= n; i++) {
            sum = sum + n * n * n;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 100, sum = 0;
        System.out.println(Check(n, sum));
    }
}