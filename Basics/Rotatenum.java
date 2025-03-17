public class Rotatenum{
    public static void main(String[] args) {
        int num = 12345;
        int copy = num;
        int rotation = 2;
        //count the digit
        int count = 0;
        while(num!=0){
            num=num/10;
            count++;
        }
        rotation = rotation % count; // to stay with inn the range
        if(rotation < 0){
            rotation = rotation+count;
        }
        num = copy;
        int power = (int)Math.pow(10, rotation);
        int right = num % power;
        int left = num / power;
        int val = right *(int) Math.pow(10, (count-rotation)) + left;
        System.out.println(val);


    }
}

// 29-01-2025