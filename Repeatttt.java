package javaapplication30;

import java.io.*;
import java.util.*;
public class Repeatttt
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        
        String str=s.next();
      
        for (char ch:str.toCharArray())
        {
         if(str.indexOf(ch)==str.lastIndexOf(ch)) 
         {
             System.out.print(ch);
            
         }
        }
        
            
        
    }
    
}
