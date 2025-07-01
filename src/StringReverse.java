public class StringReverse {

    public static void main(String[] args) {

        String str="Saurabh";
        String reverse="";
        int size=str.length();

        char[] charArray=str.toCharArray();
        for(int i=size-1;i>=0;i--){
            reverse=reverse+charArray[i];
        }
        System.out.println(reverse);
    }
}
