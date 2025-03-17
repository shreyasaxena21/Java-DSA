public class ReverseDigit{
    public static void main(String[] args) {
        int num = 12345;
        int copy = num;
        int count = 0;
        int sum = 0;
        while(num!=0){
            num = num /10;
            count++;
        }
        num = copy;
        int power = (int)Math.pow(10, count-1);
        int last_digit = num % 10;
        int val = last_digit*power;
        sum = sum + val;
        num = num /10;
        power = power/10;
        
        System.out.println(sum);
    }
}