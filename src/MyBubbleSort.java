import java.util.Arrays;

public class MyBubbleSort {
    public static void main(String[] args) {

        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr ,arr.length);

    }

    // An optimized version of Bubble Sort
    static void bubbleSort(int[] arr, int n)
    {
        int i, j;
        boolean swapped;
        //Pass loop
        for (i = 0; i < n-1; i++)
        {
            //inside each pass loop
            swapped = false;
            for (j = 0; j < n-i-1; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swapped = true;
                }
            }

            if (!swapped)
                break;
        }
        System.out.println("The sorted array is "
                + Arrays.toString(arr));
    }
}
