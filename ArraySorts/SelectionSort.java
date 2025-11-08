// Details : 
// Sorts the array by moving the smallest element to the smallest index available 

// Key points
// 1)Outer loop is same in both bubble and selection sort 
// 2)Inner loop goes from j=i+1 to j<array.length
// 3)Comparison is in between the ith and jth element


public class SelectionSort {

    static public void printArray(int[] arr){
        for(int n : arr){
            System.out.print(n+" ");
        }
    }

    public static void main(String[] args){

        int[] array = {7,8,3,1,2};

        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    // Swap
                    int temp = array[j];
                    array[j]=array[i];
                    array[i]=temp;
                }
            }
        }

        printArray(array);

    }
}
