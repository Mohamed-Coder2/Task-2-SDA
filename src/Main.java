import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {12, 11, 13, 5, 6, 7};
        int[] arr2 = {12, 11, 13, 5, 6, 7};
        int[] arr3 = {12, 11, 13, 5, 6, 7};
        Sorting mergeSort = new MergeSort();
        Sorting bubbleSort = new BubbleSort();
        Sorting insertionSort = new InsertionSort();

        System.out.println("Array 1");
        System.out.println(Arrays.toString(arr1));

        mergeSort.sort(arr1);

        System.out.println("Merge Sorted Array");
        System.out.println(Arrays.toString(arr1));

        System.out.println("\nArray 2");
        System.out.println(Arrays.toString(arr2));

        bubbleSort.sort(arr2);

        System.out.println("Bubble Sorted Array");
        System.out.println(Arrays.toString(arr2));

        System.out.println("\nArray 3");
        System.out.println(Arrays.toString(arr3));

        insertionSort.sort(arr3);

        System.out.println("Insertion Sorted Array");
        System.out.println(Arrays.toString(arr3));
    }
}
