public class CountEvenOdd{

    //Stack Building Approach
    public static void countEvenOdd(int range, int counteven, int countodd){
        if(range==0){
            System.out.println("No of even numbers are " + counteven);
            System.out.println("No of odd numbers are " + countodd);
            return;
        }

        if(range%2==0){
            counteven++;
        }
        else{
            countodd++;
        }

        countEvenOdd(range-1, counteven, countodd);
    }

    // Stack falling Approach
    static int[] countEvenOdd(int range){
        if(range==0){
            int[] result = new int[2];
            //[0] => even count , [1] => odd count
            return result;
        }

        int[] result = countEvenOdd(range-1);

        if(range%2==0){
            result[0] = result[0] + 1;
        }

        else{
            result[1] = result[1] + 1;
        }

        return result;
    }

    public static void main(String[] args) {
        countEvenOdd(10, 0, 0);
        int[] arr = countEvenOdd(10);
        System.out.println("Even numbers are " +arr[0]);
        System.out.println("Odd numbers are " +arr[1]);
    }
}