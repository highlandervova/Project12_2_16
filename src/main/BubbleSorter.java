package main;

public class BubbleSorter implements Sorter {
    @Override
    public void sort(int[] arr) {
        for (int j = 0; j < arr.length-1; j++){
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    arr[i] = arr[i] + arr[i + 1];
                    arr[i + 1] = arr[i] - arr[i + 1];
                    arr[i] = arr[i] - arr[i + 1];
                }
            }
        }
    }
}
