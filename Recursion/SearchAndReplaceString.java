class SearchAndReplaceString{

    static String searchandreplace(String str, Character search, Character replace){
        //base case
        if(str.length()==0){
            return  " ";
        }
       
        //small problem
        String S = searchandreplace(str.substring(1), search, replace);
        if(str.charAt(0)==search){
            return replace + S;
        }

        else{
            return str.charAt(0) + S;
        }
    }

    public static void main(String[] args) {
        String str = "Hello";
        String s = searchandreplace(str,'l', 'x');
        System.out.println(s);
        
    }
}