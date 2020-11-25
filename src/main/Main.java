package main;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2,-50,15,68,0,15,51};

        System.out.println(Arrays.toString(arr));
        Sorter sorter = new MinMaxSorter();
        arr = sorter.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
