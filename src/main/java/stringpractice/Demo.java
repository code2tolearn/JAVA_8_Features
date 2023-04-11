package stringpractice;
//remove Word which not is Start from R And S
public class Demo {
    public static void main(String[] args) {
        String str[]=  {"ram","sham","rohit","gautam"};
        String[] ans = new String[str.length] ;
        for(int i =0 ; i<str.length ; i++)
        {
            String s = str[i] ;
            if(s.toLowerCase().startsWith("r") || s.toLowerCase().startsWith("s"))
            {
                  ans[i] = s ;
            }
        }
        for (int i=0 ; i< ans.length ; i++)
        {
             if (ans[i] != null)
             {
                 System.out.println(ans[i]);
             }
        }
    }
}
