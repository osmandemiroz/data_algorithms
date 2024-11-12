package recursive;

public class MiddleSum {

    public static void main(String[] args) {
        int A[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(new MiddleSum().middleSum(A, 0, A.length));
    }

    int middleSum(int A[], int index1, int index2) {
        if (index2 - index1 == 1)
            return A[index1];

        int middle = (index1 + index2) / 2;

        int localSum1 = (middleSum(A, index1, middle));
        int localSum2 = (middleSum(A, middle, index2));

        return localSum1 + localSum2;
    }
}
