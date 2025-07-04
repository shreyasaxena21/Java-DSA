class InsertionSort {

    static void insertionSort(int nums[]){
        int n = nums.length;
        for(int i = 1; i < n; i++) {
            int key = nums[i];
            int j = i - 1;

            // Move elements of nums[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while(j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j = j - 1;
            }
            nums[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] nums={5, 3, 8, 4, 2};
        insertionSort(nums);
        for(int num : nums) {
            System.out.print(num + " ");
        }
    }
}