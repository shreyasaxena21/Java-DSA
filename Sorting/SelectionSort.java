class SelectionSort{

    static void selectionSort(int nums[]){
        int n = nums.length;
        for(int i=0; i<n; i++){
            int minIndex = i;
            for(int j = i+1; j<n; j++){
                if(nums[j] < nums[minIndex]){
                    minIndex = j;
                }
            }

            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums={5, 3, 8, 4, 2};
        selectionSort(nums);
        for(int num : nums) {
            System.out.print(num + " ");
        }
    }
}