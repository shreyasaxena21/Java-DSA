import java.util.Scanner;

public class Password{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your password");
        String pass = scan.nextLine();
        int Ucount=0;
        int Dcount =0;
        for (char c : pass.toCharArray()){
            if(Character.isUpperCase(c)){
                Ucount++;
            }

            if(Character.isDigit(c)){
                Dcount++;
            }
        }
        if(pass.length()>8 && Ucount>=1 && Dcount>=1){
            System.out.println("Valid");

        }
        else{
            System.out.println("Invalid");
        }
    }
}