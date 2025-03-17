class RemoveConsecutiveDuplicates{

    static String removeDuplicates(String str){
        //base case
        if(str.length()<=1){
            return str;
        }
        // 0th char and 1st char
        if(str.charAt(0) == str.charAt(1)){
            return removeDuplicates(str.substring(1));

        }

        else{
            return str.charAt(0) + removeDuplicates(str.substring(1));
        }
    }
    public static void main(String[] args) {
        String s = "AAABBCCCDC";
        String a = removeDuplicates(s);
        System.out.println(a);

        
    }
}