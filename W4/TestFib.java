package W4;

public class TestFib {
    public static void main (String[] args) {
        System.out.println("In TestFib");
        int k = 5;
        System.out.println("Fibonacci of " + k + " is " + rfib(k));
    }

    public static int rfib (int n) {

        if (n==0) return 0;
        else if (n==1) return 1;
        else{
            return rfib(n-1) + rfib(n-2);
        }
    }
}
