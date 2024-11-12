package sort;

import java.util.ArrayList;
import java.util.List;

public class SelectionSort {
    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add((int) (Math.random() * 100));
        }
        System.out.println(arr);
        System.out.println(new SelectionSort().selectionSort(arr, arr.size()));
    }

    List<Integer> selectionSort(List<Integer> arr, int N) {
        for (int i = 0; i < N; i++) {
            int maxIndex = i; // max index
            for (int j = i + 1; j < N; j++) {
                if (arr.get(j) > arr.get(maxIndex)) {
                    maxIndex = j;
                }
                if (maxIndex != i) {
                    int temp = arr.get(i);
                    arr.set(i, arr.get(maxIndex));
                    arr.set(maxIndex, temp);
                }
            }
        }
        return arr;
    }
}
