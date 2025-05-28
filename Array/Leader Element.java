class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int leader = 0;
        ArrayList<Integer> leaders = new ArrayList<Integer>();
        for(int i = arr.length-1; i>=0; i--){
            if(arr[i]>=leader){
                leader = arr[i];
                leaders.add(leader);
            }
            
        }
        Collections.reverse(leaders);
        return leaders;
    }
}
