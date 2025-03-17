class GCD{
    public static void main(String[] args) {
        int a  = 36;
        int b = 24;

        while(a%b!=0){
            int rem = a%b;
            a = b;
            b = rem;

        }

        System.out.println("GCD " + b);
    }
}