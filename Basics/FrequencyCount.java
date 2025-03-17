
import java.util.HashMap;

class FrequencyCount{
    public static void main(String[] args) {
        int num = 7274722;
        HashMap<Integer, Integer> map = new HashMap<>();
        while(num!=0){
            int digit = num % 10;
            if(map.get(digit)==null){
                map.put(digit, 1);
            }

            else{
                int count = map.get(digit);
                count++;
                map.put(digit, count);
            }
            num = num /10;

        }

        System.out.println(map);
    }
}