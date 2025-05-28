class Solution {
    int thirdLargest(int arr[]) {
        // Your code here
        int firstLargest = -1;
        int secondLargest = -1;
        int thirdLargest = -1;
        
        for(int i : arr){
            if(i>=firstLargest){
                thirdLargest = secondLargest;
                secondLargest = firstLargest;
                firstLargest = i;
            }
            
            else if(i>=secondLargest){
                thirdLargest = secondLargest;
                secondLargest = i;
            }
            else if(i>= thirdLargest){
                thirdLargest = i;
            }
        }
         return thirdLargest;
    }
}