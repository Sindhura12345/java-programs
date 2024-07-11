import java.util.*;
public class stringRev {
   public static void main(String[] args) {
    String ss="123456";
    int num=Integer.parseInt(ss);
    System.out.println(num);
    int n=12213;
    String s=Integer.toString(n);
    System.out.println(rev(s));
    String str="satya";
    System.out.println(rev(str));
    if(rev(str)==str)
    {
        System.out.println("true");
    }
    else{
        System.out.println("false");
    }
   
  
   }
   public static String rev(String str)
   {
    StringBuilder string=new StringBuilder(str);
    
    return string.reverse().toString();

   }

}
