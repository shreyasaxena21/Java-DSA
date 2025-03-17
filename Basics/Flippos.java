public class Flippos{
    public static void main(String[] args) {
        int pos = 0; // count
        int num = 32145;
        int sum = 0;
        //get the last digit
        while(num!=0){
        
            int last_digit = num%10;
            pos++;
            

            int val = pos * (int)Math.pow(10, last_digit-1);
            sum = sum + val;
            num = num / 10; //make the number smaller
        }
        System.out.println(sum);

    }
}

// 29-01-2025