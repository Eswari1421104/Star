import java.io.*;
import java.util.*;
public class Star
{
    public static void main(String args[])
            {
                int i,n,a;
         
         Scanner s=new Scanner(System.in);
         n=s.nextInt();
         for(i=n;i>=1;i--)
         {
             for(a=0;a<i;a++)
             {
                 System.out.print("*");
             }
             System.out.print(" ");
             for(a=1;a<=i;a++)
             {
                 
                 System.out.print("*");
             }

         System.out.println("\n");

}

 
            }
}
