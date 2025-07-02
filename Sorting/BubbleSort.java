class BubbleSort{

    static void bubbleSort(int nums[]){
        int n = nums.length;
        for(int i = 0; i<n; i++){
            for(int j=0; j<n-1;j++){
                if(nums[j]>nums[j+1]){
                    // swap
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums={5, 3, 8, 4, 2};
        bubbleSort(nums);
        for(int num : nums) {
            System.out.print(num + " ");
        }
    }
}