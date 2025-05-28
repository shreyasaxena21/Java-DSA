class Solution {
    // Function to remove duplicates from the given array
    public int removeDuplicates(int[] arr) {
        // Code Here
        //maintain writer pointer
        int writer = 0;
        // maintain reader
        for(int reader=1; reader<arr.length; reader++){
            if(arr[writer]!=arr[reader]){
                writer++;
                arr[writer] = arr[reader];
            }
        }
        return writer+1;
    }
}