class BoardProblem{

    static void boardProblem(int currentValue, int endValue, String result){
        //basecase
        if(currentValue==endValue){
            System.out.print(result+",");
            return;
        }

        //negative case
        if(currentValue>endValue){
            return;
        }

        for(int dice = 1; dice<=6 ; dice++){
            boardProblem(currentValue+dice, endValue, result+dice);
        }

    }

    public static void main(String[] args) {
        boardProblem(0, 10, "");
        
    }
}