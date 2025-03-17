class RopeCutProblem{

    static int maxCut(int ropelen, int a, int b, int c){
        if(ropelen==0){
            return 0;
        }

        if(ropelen<0){
            return -1;
        }

        int option1 = maxCut(ropelen-a, a, b, c);
        int option2 = maxCut(ropelen-b, a, b, c);
        int option3 = maxCut(ropelen-c, a, b, c);

        int finalResult = Math.max(Math.max(option1, option2), option3);

        if(finalResult==-1){
            return -1;

        }

        return finalResult+1;


    }

    public static void main(String[] args) {
        int r = maxCut(5, 2, 5, 1);
        System.out.println(r);
    }
}