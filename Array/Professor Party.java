// User function Template for Java

class Solution {

    public static String PartyType(int arr[]) {
        // Your code goes here
        HashMap<Integer, Boolean> map = new HashMap<>();
        
        for(int val : arr){
            if(map.get(val)==null){
                map.put(val, true);
            }
            
            else{
                return "true";
            }
            
        }
        
        return "false";
    }
}