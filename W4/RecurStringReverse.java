package W4;
// Homework Question 7
// total: 10 points

//===============================================
// todo: complete the following program
//===============================================

import java.util.InputMismatchException;

public class RecurStringReverse {
    public static void main (String[] args) {
        System.out.println(recurStringReverse("man ate fish"));
         
        
    }
   public static String recurStringReverse (String s)  {
       int n = s.indexOf(" ");
       if(n == -1) return s;
       else {
           return  recurStringReverse(s.substring(n+1,s.length()))+" "+s.substring(0,n);
       }

    }
}
