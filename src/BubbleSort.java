
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {15, 16, 6, 8, 5};
        int n = arr.length;
        for (int p = 0; p < n - 1; p++) {
            for (int i = 0; i < n - 1 - p; i++) {
                if (arr[i] > arr[i + 1]) {
                    int t = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = t;
                }
            }
        }
        for (
                int j : arr) {
            System.out.print(j + ",");
        }

    }
}