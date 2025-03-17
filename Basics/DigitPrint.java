class DigitPrint{
    public static void main(String[] args) {
        int num = 12345;
        int copy = num;
        int count = 0;

        while(num!=0){
            count++;
            num=num/10;
        }

        num = copy;
        

        while(num!=0){
            int power = (int)Math.pow(10, count-1);
            int first = num/power;
            System.out.println(first);
            num=num%power;
            count--;
        }

    }
}