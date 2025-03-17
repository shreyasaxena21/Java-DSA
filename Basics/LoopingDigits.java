class LoopingDigits{
    public static void main(String[] args) {
        int num = 12345;
        int copy = num;
        int count = 0;
        // step1 : count the digits
        while(num!=0){
            num = num/10; // make a number smaller
        count++;

        }
        num = copy;
        int pow = (int) Math.pow(10, count-1);
        while(num!=0){
            System.out.println(num/pow);

            num = num % pow; //make the number smaller
            pow = pow/10; //make the power small
            
        }
      
    }
}

// 29-01-2025