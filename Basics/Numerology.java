//Numerology program==> this program takes input and sum all the digits of the number until we get a single digit and on the basis of that digit we get to have our result
public class Numerology{
    public static void main(String[] args) {


        int num = 355557568;
        String results[] = {"", "Leader Quality", "Emotional", "Joyful", "Cool", "Calm", "Quiet", "Angry", "Sweet", "Playful"};

        while(num>10){
            int sum = 0;
            while(num!=0){
                int singleDigit = num%10;
                sum = sum + singleDigit;
                num = num/10;
            }
            num=sum;
        }

        System.out.println(num);
        System.out.println(results[num]);

    }
}