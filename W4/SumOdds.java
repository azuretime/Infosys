package W4;
// Homework Question 5
// total: 15 points

//===============================================
// todo: complete the following program
//===============================================




   public class SumOdds {
        public static void main (String[] args) {
            int number = 54320;

           /* Suggested solution plan:  
            * Input your codes to deal with negative number
            * and deal with even number. Invoke sumOdd(number)
            * Print result.
            */
            if (number<0) System.out.println(-1);
            else System.out.println(sumOdd(number));
            }
        
        public static int sumOdd(int i) {

            if (i==0) return 0;
            if(i%2 == 1) //if n is odd
                //returns last digit of n + sumOddDigits(n/10) => n/10 removes the last digit of n
                return i % 10 + sumOdd(i/10);
                //Integer divison by ten "cuts off" the last digit
            else
                return sumOdd(i/10);

        }
    }
