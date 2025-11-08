// Details : 
// Sorts the array by moving the largest element to the largest index available 

// Key points
// 1)Outer loop is same in both bubble and selection sort 
// 2)Inner loop goes from j=0 to j<array.length-i-1
// 3)Comparison is in between the jth and j+1th element


public class BubbleSort {

    static public void printArray(int[] arr){
        for(int n : arr){
            System.out.print(n+" ");
        }
    }

    public static void main(String[] args){

        int[] array = {7,8,3,1,2};

        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    // Swap
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }

        printArray(array);

    }
}
