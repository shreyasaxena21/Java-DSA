public class HollowSquarePattern{
    public static void main(String[] args) {
        int n = 5;
        for(int row=1; row<=n; row++){
            for(int col = 1; col<=n; col++){
                if(row==1 || row==5 || col ==1 || col == 5){
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