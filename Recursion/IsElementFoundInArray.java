class IsElementFoundInArray{

    static boolean is_found(int[] arr, int index, int search){
        //base case
        if(arr.length==index){
            return false; 
        }
        
        if(arr[index]==search){
            return true;
        }
        //small problem
        return is_found(arr, index+1, search);
    }
    public static void main(String[] args) {
        int[] arr = {12,33,23,55,34};
        System.out.println(is_found(arr, 0, 4)?"Found" : "Not Found");
        
    }
}