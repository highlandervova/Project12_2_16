package main;

public class MinMaxSorter implements Sorter{
    @Override
    public int[] sort(int[] arr) {

            int k,j;

         int[] tmp = new int[arr.length];

         for (int i = 0; i <  arr.length; i++) {
             k=arr[0];
             j=0;
                for (int n = 1; n < arr.length; n++) {
                 if (k > arr[n]) {
                    k = arr[n];
                    j = n;
                 }
                }

//comment
            tmp[i]=k;
            arr[j]=Integer.MAX_VALUE;
            }

        arr=tmp;
        return arr;
         }
}
