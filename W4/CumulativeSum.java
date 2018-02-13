package W4;
// Cohort Question 5
// total: 10 points

//===============================================
// todo: complete the following program
//===============================================


import java.util.Arrays;

public class CumulativeSum {
   public static void main (String[] args) {
       int d[] = {2,3,1,5,6,2,7};
       cumulativeSum(d, 1);
       // Insert your code here

       System.out.print(Arrays.toString(d));

   }

    public static void cumulativeSum(int data[], int n) {
    // Insert your code here
        int len = data.length;
        if (n==len) return;
        else {
            data[n] = data[n-1] + data[n];
            cumulativeSum(data,n+1);
        }
    }
}
