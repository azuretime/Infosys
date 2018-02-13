package W4;

/**
 * Created by Jiang Jinjing on 2017/11/9.
 */

public class Count11 {
    //count no. of 11
    public static void main (String[] args) {
        System.out.println("output = " + count11("11abc11"));
        System.out.println("output = " + count11("abc11x11x11"));
        System.out.println("output = " + count11("111"));
    }
    public static int count11(String s){

        if (s.length()<=1) return 0;
        else if (s.charAt(0)=='1'&&s.charAt(1)=='1'){
            return 1+ count11(s.substring(2));
        }else {
            return count11(s.substring(1));
        }
    }
}
