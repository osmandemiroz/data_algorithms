package search;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch {

    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arr.add((int) (Math.random() * 100));
        }
        System.out.println(arr);
        System.out.println(binarySearch(arr, arr.size(), 12));
    }

    static int binarySearch(List<Integer> arr, int N, int key) {
        int left = 0;
        int right = N - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2; // Index of the key to test against
            if (arr.get(mid) == key) {
                return mid; // Key found
            } else if (arr.get(mid) < key) {
                left = mid + 1; // Eliminate the right side
            } else {
                right = mid - 1; // Eliminate the left side
            }
        }
        return -1;
    }
}
