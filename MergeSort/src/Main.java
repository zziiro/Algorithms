public class Main {
    public static void main(String[] args) {

        int[] arr = {8,5,9,1,6,7};
        int arrLength = arr.length;


        // print contents of the unsorted array
        for(int n : arr){
            System.out.print(n + " ");
        }

        System.out.println("");
        // call the mergeSort() function
        mergeSort(arr, 0, arrLength-1);

        for(int n : arr){
            System.out.print(n + " ");
        }
    }

    static void mergeSort(int[] arr, int left, int right){
        if(left < right){
            int mid = (left + right) / 2;
            // breaking the array down into smaller p   ar ts
            mergeSort(arr, left, mid);
            mergeSort(arr,mid+1, right);

            merge(arr, left, mid, right);
        }
    }

    // method that merges the sub arrays
    static void merge(int[] arr, int left, int mid, int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // create sub arrays
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for(int x=0; x<n1; x++){
            leftArr[x] = arr[left + x];
        }
        for(int x=0; x<n2; x++){
            rightArr[x] = arr[mid + 1 + x];
        }
        // merge
        int i = 0;
        int j = 0;
        int k = left;

        while(i<n1 && j<n2){
            if(leftArr[i] <= rightArr[j]){
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while(j<n2){
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}