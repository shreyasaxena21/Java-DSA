import java.util.Scanner;

public class Grades{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER THE MARKS");
        int marks = scan.nextInt();
        if(marks<=100 && marks>=90){
            System.out.println("A");
        }
        if(marks<=89 && marks>=80){
            System.out.println("B");
        }
        if (marks<=79 && marks>=70){
            System.out.println("C");
        }
        if(marks<=69 && marks>=60){
            System.out.println("D");
        }
        if(marks<60){
            System.out.println("F");
        }
    }
}