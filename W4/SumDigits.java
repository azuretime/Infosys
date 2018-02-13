package W4;

public class SumDigits {
     public static void main (String[] args) {
         int number = -54321;

            // Input your codes here.
            // Suggested solution plan. Handle negative 
            // case first, then invoke sumDigits(number)
         System.out.println(sumDigits(number));
     }
        
     public static int sumDigits(int i) {
         // Input your codes here
         if (i == 0) return 0;
         else if (Math.abs(i)<10)return i;
         else return Math.abs(i) % 10 + sumDigits(i/10);

     }
}


