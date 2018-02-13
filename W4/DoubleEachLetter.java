package W4;
// Cohort Question 6
// total: 5 points

//===============================================
// todo: complete the following program
//==============================================6


public class DoubleEachLetter {
    public static void main (String[] args) {
        String s = "HelloWorld";

        String output = doubleEachLetter(s);
        System.out.println("output = " + output);
    }
    public static String doubleEachLetter(String s){
        // Input your codes here
        if (s.length()== 0) return s;
        else {
            char first = s.charAt(0);
            return (""+first+first+ doubleEachLetter(s.substring(1,s.length())));
        }
    }
}
