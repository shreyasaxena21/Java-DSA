class ArraySortedOrNot{

    static boolean is_array_sorted(int [] arr, int index){
        if(index==arr.length){
            return true;
        }

        if(arr[index] > arr[index+1]){
            return false;
        }
        return is_array_sorted(arr, index+1);
    }
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50};
        is_array_sorted(arr, 0);
    }
}