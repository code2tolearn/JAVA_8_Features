package stringpractice;

public class NumberOfChara {
    public static void main(String[] args) {
        //count no. of characters in given String
        String str="Rohit sharma is best player";
        String arr[] = str.split(" ") ;
        int length = 0 ;
         for(int i = 0 ;i<arr.length ; i++)
         {
             length+= arr[i].length() ;
         }
        System.out.println(length);

        String string ="Programming";
       String s = string.replaceAll("m","") ;
        System.out.println(s);

    }
}
