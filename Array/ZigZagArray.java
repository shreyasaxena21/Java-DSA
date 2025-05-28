
class Solution {
    public static void zigZag(int[] arr) {
        // code here
        boolean zigzagFlag = true;
        for(int i = 0; i<arr.length-1; i++){
            if(zigzagFlag){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            
            if(!zigzagFlag){
                if(arr[i]<arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            
            zigzagFlag = !zigzagFlag;
            
            
        }
    }
}
