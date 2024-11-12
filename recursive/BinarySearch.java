package recursive;

public class BinarySearch {

    public static void main(String[] args) {
        int A[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(binarySearch(A, 0, A.length, 12));
    }

    static boolean binarySearch(int A[], int index1, int index2, int key) {
        int middle = (index1 + index2) / 2;
        int N = index2 - index1;

        if (key == A[middle])
            return true;
        if (N == 1)
            return false;

        else if (key < A[middle])
            return binarySearch(A, index1, middle, key);
        else
            return binarySearch(A, middle, index2, key);
    }
}
