class PrintTable{

    //Stack Falling Approach
    static String printTable2(int num, int count){
        if(count==0){
            return "";
        }

        String result = printTable2(num, count-1);
        String expression = num+"*"+count+"="+num*count+"\n";
        return result+expression;


    }


    //Stack Building Approach
    static void printTable(int num, int count){
        if(count==11){
            return;
        }
        System.out.println(num +"*"+count+"="+num*count);
        printTable(num, count+1);
    }

    public static void main(String[] args) {
        printTable(5, 1);     
        System.out.println(printTable2(5, 10));   
    }
}