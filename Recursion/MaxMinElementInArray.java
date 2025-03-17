class MaxMinElementInArray{

    static int[] minmax(int[] arr, int index){
        //base case
        if(arr.length == index){
            int [] result = new int[2];
           result[0]=Integer.MAX_VALUE;
           result[1]=Integer.MIN_VALUE;
            return result;
        }
        
        //small problem
        int[] res = minmax(arr, index+1);
        if(res[0]>arr[index]){
            res[0] = arr[index];
        }

        else if(res[1]<arr[index]){
            res[1]=arr[index];
        }
        return res;

    }

    public static void main(String[] args) {
        int [] a = {10,20,40,30,50};
        int [] res = minmax(a, 0);
        System.out.println("Min " + res[0] +" "+ "Max " + res[1]);
        
        
    }
}