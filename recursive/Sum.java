package recursive;

public class Sum {

    public static void main(String[] args) {
        System.out.println(sum(10));
    }

    static int sum(int n) {
        int partialSum = 0;
        if (n == 1)
            return 1;
        partialSum = sum(n - 1);
        return partialSum + n;
    }
}
