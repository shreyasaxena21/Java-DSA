class HollowTriangle{
    public static void main(String[] args) {
        int n = 4;

        for(int row = 1; row<=n; row++){
            for(int space = row; space<=n-1;space++){
                System.out.print(" ");
            }
            for(int star = 1; star<=2*row-1; star++){
                if(star==1 || row==n || star==row*2-1 ){
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