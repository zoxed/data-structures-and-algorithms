package com.zoxed;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        quickSort(intArray,0 , intArray.length);



        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
//        partition(intArray,0 , intArray.length);

    }

    public static void quickSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int pivotIndex = partition(input, start, end);
        quickSort(input,start,pivotIndex);
        quickSort(input,pivotIndex + 1, end);



    }

    public static int partition(int [] input, int start, int end){
        //this is using the first element as the pivot
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j ) {
            //empty loop (left to right) for I
            while (i < j && input[--j] >= pivot);

                if (i < j){
                    input[i] = input[j];
            }
                //NOTE : empty loop (right to left) for J
            while (i < j && input[++i] <= pivot);

            if (i < j){
                input[j] = input[i];
            }

        }

        input[j] = pivot;
        return  j ;
    }


}
