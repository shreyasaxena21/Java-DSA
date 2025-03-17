public class ArmstrongNumber{
    public static void main(String[] args) {
        int  num = 153;
        //count the digits
        int copy = num;
        int count = 0;
        int sum = 0;
        while(num!=0){
            num = num / 10;
            count++;
        }
        num = copy;

        //Individual digits
        while(num!=0){
            int last_digit = num%10;
            sum=sum+(int)Math.pow(last_digit, count);
            num=num/10;
        }

        //System.out.println(sum);

        if(sum==copy){
            System.out.println("Given number is an Armstrong Number");
        }
        else{
            System.out.println("Given number is not an Armstrong Number");
        }
    }
}