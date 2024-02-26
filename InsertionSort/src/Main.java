public class Main {
    public static void main(String[] args) {
        int[] arr = {5,6,2,3,1};
        int arrLength = arr.length;

        insertionSort(arr, arrLength);
    }

    static void insertionSort(int[] arr, int arrLength){
        for(int i=1; i<arrLength; i++){
            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j] > key){
                // shifting happens in here
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        // print the contents of the array
        for(int n : arr){
            System.out.print(n + " ");
        }
    }
}