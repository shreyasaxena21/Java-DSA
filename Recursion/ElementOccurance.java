class ElementOccurance{

    static int[] finallhelper(int[] arr, int index, int search, int count){
        //base case
        if(arr.length==index){
            int[] result = new int[count];
            return result;
        }

        if(arr[index] == search){
            count++;    
        }
        
        //small problem
        int[] result = finallhelper(arr, index+1, search, count);
        if(search==arr[index]){
            result[count-1] = index; 
        }

        return result;


    }

    static int[] findall(int[] arr, int index, int search){
        return finallhelper(arr, index, search, index);
    }
    public static void main(String[] args) {
        int[] arr = {10,50,30,40,50};
        int[] a = findall(arr, 0, 50);

        for(int i = 0; i<a.length; i++){
            System.out.print(a[i] +" ");
        }
        
    }
}