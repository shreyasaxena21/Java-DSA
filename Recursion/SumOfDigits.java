class SumOfDigits{
    // Stack Building approach
    static void DigitSum(int num, int result){
        if(num==0){
            System.out.println(result);
            return;
        }

        result = result+ num%10;
        DigitSum(num/10, result);
        
    }

    //Stack Falling approach
    static int Digitsum(int num){
        if(num==0){
            return num;
        }

        return num%10 + Digitsum(num/10);
    }
    public static void main(String[] args) {
        int num = 12345;
        DigitSum(num,0);
        System.out.println(Digitsum(num));
        
    }

}