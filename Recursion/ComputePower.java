class ComputePower{

    //Stack Falling
    static int compute(int num, int power){
        if(power==0){
            return 1;
        }

        int result = compute(num, power-1);
        return num*result;
    }



    // Stack Building Approach
    static void compute(int num, int power, int result){
        if(power==0){
            System.out.println(result);
            return;
        }

        result = result * num;
        compute(num, power-1, result);


    }
    public static void main(String[] args) {
        compute(2, 3, 1);
        System.out.println(compute(2, 3));
        
    }

}