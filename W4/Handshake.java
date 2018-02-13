package W4;
// Homework Question 4
// total: 10 points

//===============================================
// todo: complete the following program
//===============================================




import java.util.InputMismatchException;

public class Handshake {
    public static void main (String[] args) {
        try {
         
            System.out.println(handshake(10));
            System.out.println(handshake(3));
            System.out.println(handshake(-4));

        }
        catch (InputMismatchException ex) {
            System.out.println(ex);
        }
    }

    public static int handshake (int k) throws InputMismatchException {

        if (k<0)throw new InputMismatchException("Sorry. Number of persons cannot be negative.");
        if (k <= 1) return 0;
        else if (k == 2)
            return 1;

        return (k-1) + handshake(k-1);
    }
}
