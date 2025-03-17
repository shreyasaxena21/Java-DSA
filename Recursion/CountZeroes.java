class CountZeroes{


    //Stack Building Approach
    static int CountNoOfZeroes(int num){
        if(num==0){
            return 0;
        }

        int count = CountNoOfZeroes(num/10);
        int digit = num % 10;
        return count + (digit==0 ? 1 : 0);
    }

    public static void main(String[] args) {
        int num = 200;
        int r = CountNoOfZeroes(num);
        System.out.println(r);
        
    }
}