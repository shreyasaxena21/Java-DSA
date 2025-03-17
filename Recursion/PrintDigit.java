class PrintDigit{

    static void printDigit(int num){
        if(num==0){
            return;
        }
       
        printDigit(num/10);
        int last = num%10;
        System.out.println(last);
        



    }
    public static void main(String[] args) {
        printDigit(12345);
    }
}