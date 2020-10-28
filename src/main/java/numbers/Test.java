package numbers;

public class Test {
    public static void main(String[] args) {
        for (int i = 0; i <= 1000; i++) {
            int sum = Test.getSum(i);
            if ((i % 3 == 0) && (i % 5 != 0) && sum < 10)
                System.out.println(i);
        }
    }

    public static int getSum(int k) {
        int x = k;
        int sum = 0;
        while (x != 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }
}
