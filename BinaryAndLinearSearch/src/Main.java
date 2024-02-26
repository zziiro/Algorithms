public class Main {
    public static void main(String[] args) {

        int[] nums = new int[1000];
        int target = 900;

        int linearSearchResult = linearSearch(nums, target);
        int binarySeachResult = binarySearch(nums, target);
        int recursiveBinarySearchResult = recursiveBinarySearch(nums, target, 0, nums.length-1);
        if(linearSearchResult != -1){
            System.out.println("Element found at Index: " + linearSearchResult);
        } else {
            System.out.println("Element not found..");
        }
    }

    public static int linearSearch(int[] nums, int target){
        int steps = 0;
        for(int i = 0; i < nums.length; i++){
            steps++;
            if(nums[i] == target){
                System.out.println("Steps taken by Linear Search Algorithm: " + steps);
                return i;
            }
        }
        System.out.println("Steps taken by Linear Search Algorithm: " + steps);
        return -1;
    }

    public static int binarySearch(int[] nums, int target){
        // 5,7,9,11,13
        int steps = 0;
        int start = 0; // starting point
        int end = nums.length - 1; // end point

        while(start <= end){
            steps++;
            int mid =  (start + end) / 2;
            if(nums[mid] == target){
                System.out.println("Steps taken by Binary Search Algorithm: " + steps);
                return mid;
            } else if(nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println("Steps taken by Binary Search Algorithm: " + steps);
        return -1;
    }

    public static int recursiveBinarySearch(int[] nums, int target, int left, int right){
        if(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] == target){
                return mid;
            } else if(nums[mid] < 1) {
                return recursiveBinarySearch(nums, target, mid+1, right);
            } else {
                return recursiveBinarySearch(nums, target, left, mid-1);
            }
        }
        return -1;
    }
}