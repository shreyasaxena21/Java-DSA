public class EvenOdd{
    public static void main(String[] args) {
        int num = 9;
        if(num%2==0){ //using basic approach
            System.out.println("EVEN");
        }
        else{
            System.out.println("ODD");
        }

        if((num^1) == num+1){ //using XOR
            System.out.println("EVEN");
        }
        else{
            System.out.println("ODD");
        }

        if((num&1)==0){ //using bitwise AND
            System.out.println("EVEN");
        }
        else{
            System.out.println("ODD");
        }

        if((num|1)==num+1){//using bitwise OR
            System.out.println("EVEN");
        }
        else{
            System.out.println("ODD");
        }


    }
}