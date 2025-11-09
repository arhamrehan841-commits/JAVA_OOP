public class QuickSort {

    // This function just prints the array
    static public void printArray(int[] arr) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }

    // This function does the "partition" work:
    // It places the pivot in its correct sorted position
    // and rearranges smaller numbers on its left, bigger on its right
    public static int partition(int arr[], int low, int high) {

        int pivot = arr[high];  // Choose the last element as the pivot
        int i = low - 1;        // i keeps track of the "smaller section" boundary

        // Loop through the array (except the pivot)
        for (int j = low; j < high; j++) {

            // If current element is smaller than pivot
            if (arr[j] < pivot) {
                i++;  // move the small-section boundary forward

                // Swap arr[i] and arr[j] so the smaller element goes to left side
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // After the loop ends:
        // Place the pivot right after the last smaller element
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        // Return the pivot’s correct index
        return i;
    }

    // The main quickSort function (recursive)
    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            // Get the pivot index (partition point)
            int pivotIdx = partition(arr, low, high);

            // Sort the left half (elements smaller than pivot)
            quickSort(arr, low, pivotIdx - 1);

            // Sort the right half (elements greater than pivot)
            quickSort(arr, pivotIdx + 1, high);
        }
    }

    // Main function to test the code
    public static void main(String[] args) {
        int[] arr = {7, 8, 3, 1, 2};

        int low = 0;
        int high = arr.length - 1;

        // Start quick sorting
        quickSort(arr, low, high);

        // Print the sorted array
        printArray(arr);
    }
}
