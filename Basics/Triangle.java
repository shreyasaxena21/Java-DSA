import java.util.Scanner;

public class Triangle{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of first rod");
        int a = scan.nextInt();
        System.out.println("Enter the length of second rod");
        int b = scan.nextInt();
        System.out.println("Enter the length of third rod");
        int c = scan.nextInt();
        
        if(a+b>c && b+c>a && c+a>b){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
    
}