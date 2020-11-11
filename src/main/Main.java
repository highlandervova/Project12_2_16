package main;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2,-50,15,68,0,15,51};

        Sorter sorter = new InsertSorter();
        arr = sorter.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
