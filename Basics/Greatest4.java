import java.util.*;

public class Greatest4{
    public static void main(String[] args) {

        // Nested if else for finding greatest among 4 numbers

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Strength of Arith");
        int a = scan.nextInt();
        System.out.println("Enter the Strength of Geome");
        int b = scan.nextInt();
        System.out.println("Enter the Strength of Algeb");
        int c = scan.nextInt();
        System.out.println("Enter the Strength of Stat");
        int d = scan.nextInt();

        if(a>b){
            if(a>c){
                if(a>d){
                    System.out.println("Arith has the greatest strength");
                }
                else{
                    System.out.println("Stat has the greatest strength");
                }
            }
            else{
                if(c>d){
                    System.out.println("Algeb has the greatest strength");
                }
                else{
                    System.out.println("Stat has the greatest strength");
                }
            }
        }
        else{
            if(b>c){
                if(b>d){
                    System.out.println("Geome has the greatest strength");
                }
                else{
                    System.out.println("Stat is has the greatest strength");
                }
            }
            else{
                if(c>d){
                    System.out.println("Algeb is has the greatest strength");
                }
                else{
                    System.out.println("Stat is has the greatest strength");
                }
            }
        }
  }
}
        