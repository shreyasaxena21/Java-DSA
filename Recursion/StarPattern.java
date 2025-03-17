class StarPattern{

    static void printStars(int stars){
        if(stars==0){
            return;
        }

        System.out.print("*");
        printStars(stars-1);
    }

    static void printLines(int lines){
        if(lines==0){
            return;
        }
        
        printLines(lines-1);
        printStars(lines);
        System.out.println();
    }

    public static void main(String[] args) {
        printLines(5);
        
    }
}