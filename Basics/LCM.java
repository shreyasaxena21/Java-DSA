class LCM{
    public static void main(String[] args) {
        
        //LCM(a,b) = (a*b) / GCD(a,b)

        int a = 24;
        int b = 12;
        int aCopy = a;
        int bCopy = b;

        //GCD - division method

        while(a%b!=0){
            int rem = a%b;
            a = b;
            b = rem;
        }

        int lcm = (aCopy*bCopy)/b;
        System.out.println("LCM " +lcm);
    }
}