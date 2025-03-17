class AlphabetPattern{
    public static void main(String[] args) {
        int n = 5;
        char character = 'A';

        for(int row = 1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print(character + "");
                character++;
            }
            System.out.println();
        }
    }
}