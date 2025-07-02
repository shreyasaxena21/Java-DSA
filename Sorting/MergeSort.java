import java.util.ArrayList;
import java.util.List;

class MergeSort {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
        return nums;

    }

    void mergeSort(int [] nums, int low, int high){
        //base case
        if(low>=high){
            return ;
        }
        int mid = low+(high-low)/2;
        mergeSort(nums, low, mid);
        mergeSort(nums, mid+1, high);

        //merge
        merge(nums, low, mid, high);


    }
    void merge(int [] nums, int low, int mid, int high){
        List<Integer> result = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while(left<=mid && right<=high){
            if(nums[left]<=nums[right]){
                result.add(nums[left]);
                left++;
                

            }

            else{
                 result.add(nums[right]);
                right++;
            }
        }
        //hanle
        while(left<=mid){
            result.add(nums[left]);
            left++;
        }
         while(right<=high){
            result.add(nums[right]);
            right++;
        }

        //copy the list value
        for(int i = low; i<=high; i++){
            nums[i] = result.get(i-low);
        }
    }

    public static void main(String[] args) {
        int[] nums = {5, 3, 8, 4, 2};
        MergeSort mergeSort = new MergeSort();
        mergeSort.sortArray(nums);
        for(int num : nums) {
            System.out.print(num + " ");
        }
    }
}