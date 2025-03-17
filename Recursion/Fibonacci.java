class Fibonacci{

    static int fibo(int num){
        if(num<=1){
            return num;
        }

        return fibo(num-1) + fibo(num-2);
    }
    public static void main(String[] args) {
        int r = fibo(8);
        System.out.println(r);
        
    }
}