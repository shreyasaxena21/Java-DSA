class SwapFirstLast{
    public static void main(String[] args) {
        int num = 12345;
        int count = 0;
        int copy = num;
        while(num!=0){
            count++;
            num = num /10;
        }
        num = copy;
        int pow = (int)Math.pow(10, count-1);
        int first = num / pow;
        int last = (num % 10)*pow;
        num = num % pow;
        num = (num / 10)*10;
        int val = first + last + num;
        System.out.println(val);
        
    }
}