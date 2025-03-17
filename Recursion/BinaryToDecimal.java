class BinaryToDecimal{

    static int binarytoDecimal(int num, int pow, int sum){
        //base case
        if(num==0){
            return sum;
        }

        int last = num % 10;
        sum = sum + last*(int)Math.pow(2, pow);
        //small problem
        return binarytoDecimal(num/10, pow+1, sum);
        
    }
    public static void main(String[] args) {
        int num = 1010;
        int r = binarytoDecimal(num, 0, 0);
        System.out.println(r);
    }
}