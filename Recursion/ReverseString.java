class ReverseString{

    static String reverse(String str){
        //base case
        if(str.length()==0){
            return " ";
        }

        //small problem
        String s = reverse(str.substring(1));
        Character first = str.charAt(0);
        return  s+first;

    }



    public static void main(String[] args) {
        String name = "Amit";
        String s = reverse(name);
        System.out.println(s);

        
    }
}