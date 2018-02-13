package W4;

public class ArrayBounds {
    public static void main (String[] args) {
        System.out.println("In Array Bounds demo. ");
        int[] a = {1,2,3};
        try {
            System.out.println(a[3]);
        }//does not solve the problem, only handles it

        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Array index out of bounds.");
            System.out.println(ex);
        }
        finally {
            System.out.println("In finally");
        }
        System.out.println("Program continues.");
    }
}