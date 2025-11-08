// Details : 
// Sorts by moving the sorted part to the left 

// Key points
// 1)Outer loop gioes from i=1 to i<array.length \
// 2)Variable named Current = array[i]
// 3)j=i-1
// 4)Inner loop has two conditions j>=0 && current<array[j]
// 5)If inner loop runs it does array[j+1] = array[j] and j--
// 6)If inner loop doesn't runs then array[j+1] = current


public class InsertionSort {

    static public void printArray(int[] arr){
        for(int n : arr){
            System.out.print(n+" ");
        }
    }

    public static void main(String[] args){

        int[] array = {7,8,3,1,2};

        for(int i=1;i<array.length;i++){
            
            int current = array[i];
            int j= i-1;
            while(j>=0 && current<array[j]){
                array[j+1] = array[j];
                j--;
            }

            array[j+1] = current;

        }

        printArray(array);

    }
}
