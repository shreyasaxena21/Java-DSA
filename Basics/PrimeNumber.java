class PrimeNumber{

    public static void main(String[] args) {
        int num = 7;

        if(num<2){
            System.out.println("Not Prime");
            return;
        }

        for(int i = 2; i*i<=num; i++){
            if(num%i==0){
                System.out.println("Not Prime");
                return;
            } 
        }
        System.out.println("Prime Number");
    }
}

