class ClimbStairs{
    static int climb(int n){
        if(n<=1){
            return 1;
        }

        return climb(n-1) + climb(n-2);
    }

    public static void main(String[] args) {
        int r = climb(3);
        System.out.println(r);
        
    }
    
}