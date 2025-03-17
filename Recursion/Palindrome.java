class Palindrome{

    static int count(int num){
        int count = 0;
        while(num!=0){
            count++;
            num=num/10;

        }
        return count;
    }

    //Stack Bilding Approach
    static void is_palindrome(int num, int reversed, int copy){
        if(num==0){
            if(copy == reversed){
                System.out.println("The number is Palindrome");
            }
    
            else{
                System.out.println("The number is not Palindrome");
            }
            return;
        }

        int numCount = count(num);
        int last = num%10;
        reversed = reversed + (last * (int)Math.pow(10, numCount-1));

        is_palindrome(num/10, reversed, copy);

        
    }

    public static void main(String[] args) {
        int num = 121213;
        is_palindrome(num, 0, num);
        
    }
}