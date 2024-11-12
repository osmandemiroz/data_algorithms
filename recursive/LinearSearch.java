package recursive;

public class LinearSearch {

    public static void main(String[] args) {
        int A[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(linearSearch(A, 0, A.length, 12));
    }

    static boolean linearSearch(int A[], int index, int N, int key) {
        if (N == 0)
            return false;
        if (key == A[index])
            return true;

        return linearSearch(A, index + 1, N - 1, key);
    }
}
