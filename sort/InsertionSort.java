package sort;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort {
    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add((int) (Math.random() * 100));
        }
        System.out.println(arr);
        System.out.println(insertionSort(arr, arr.size()));
    }

    static List<Integer> insertionSort(List<Integer> arr, int N) {
        int j, P, TMP;
        for (P = 1; P < N; P++) {
            TMP = arr.get(P);
            for (j = P; j > 0 && arr.get(j - 1) > TMP; j--) {
                arr.set(j, arr.get(j - 1));

            }
            arr.set(j, TMP); // Found a spot for A[P] ( = TMP )
        }
        return arr;
    }
}
