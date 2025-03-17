class EvenOddPlace{
    public static void main(String[] args) {
        int num = 1234;

        int evensum= 0;
        int oddsum=0;
        int copy = num;
        int count = 0;

        while(num!=0){
            
            int last = num%10;
            count++;
            if(count%2==0){
                evensum+=last;
            }
            else{
                oddsum+=last;
            }

            num=num/10;
        }

        System.out.println("Even Position Sum is "+evensum);
        System.out.println("Odd Position Sum is "+oddsum);
    }
}