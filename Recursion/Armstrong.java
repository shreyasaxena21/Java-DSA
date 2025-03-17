class Armstrong{

    static int count(int num){
        int count=0;
        while(num!=0){
            count++;
            num=num/10;
        }
        return count;
    }

    static void checkArmstrong(int num, int sum, int copy){
        if(num==0){
            if(sum == copy){
                System.out.println("It ia an Armstrong number");
            }
            else{
                System.out.println("It is not an Armstrong number");
            }
            return;
        }
        int numCount = count(num);
        int last_digit = num%10;
        sum = sum + (int)Math.pow(last_digit,numCount);

        checkArmstrong(num/10, sum, copy);


    }

    public static void main(String[] args) {
        int num = 153;
        int copy = num;
        checkArmstrong(num, 0, copy);
        System.out.println(count(num));
        
    }
}