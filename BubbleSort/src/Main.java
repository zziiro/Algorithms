public class Main {
    public static void main(String[] args) {

        int nums[] = {6,5,2,8,9,4};
        int arrLength = nums.length;
        int temp = 0; // temp variable for swapping

        System.out.println("Before Bubble Sort:");
        for(int num : nums){
            System.out.print(num + ", ");
        }

        System.out.println("\nAfter Bubble Sort:");
        // bubble sort function
        for(int i=0; i<arrLength; i++){
            for(int j=0; j<arrLength-i-1; j++){
                if(nums[j] > nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        for(int n : nums){
            System.out.print(n + ", ");
        }
    }
}



