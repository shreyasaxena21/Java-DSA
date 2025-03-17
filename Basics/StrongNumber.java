class StrongNumber{

    static int fact(int num){
        if(num==0 || num==1){
            return  1;
        }

        return num*fact(num-1);
    }

    public static void main(String[] args) {
        int num = 145;
        int copy = num;
        int sum = 0;
        
        while(num!=0){
            int digit = num%10;
            int fact = fact(digit);
            sum = sum + fact;
            num = num /10;

        }

        if(sum==copy){
            System.out.println("Given number is a STRONG or PETERSON'S Number");
        }

        else{
            System.out.println("Given number is not a  STRONG or PETERSON'S Number");

        }
    }

}