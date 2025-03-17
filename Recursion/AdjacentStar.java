class AdjacentStar{

    static String adjStar(String str){
        //base case
        if(str.length() <= 1){
            return str;
        }

        if(str.charAt(0) == str.charAt(1)){
            return str.charAt(0) + "*" + adjStar(str.substring(1));
        }

        else{
            return str.charAt(0) + adjStar(str.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println(adjStar("AABBABC"));
        
    }
}