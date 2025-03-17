class Factorial{

    static int factorial(int num){
        //base case
        if(num==0 || num == 1){
            return 1;
        }

        //small problem
        return num*factorial(num-1);
    }

    public static void main(String[] args) {
        int num = 4;
        int r = factorial(num);
        System.out.println(r);
        
    }
}