public class HollowRightTrianglePattern{
    public static void main(String[] args) {
        int n =5;
        for(int row=1; row<=n; row++){
            for(int col=1; col<=row; col++){
                if(col==1||row==5||col==row){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}