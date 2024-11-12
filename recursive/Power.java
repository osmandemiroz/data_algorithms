package recursive;

public class Power {

    public static void main(String[] args) {
        System.out.println(
                power(2, 4));
    }

    static double power(double a, int n) {
        double partialResult;

        if (n == 0)
            return 1;
        else if (n == 1)
            return a;

        partialResult = power(a, n - 1);

        return partialResult * a;
    }
}
