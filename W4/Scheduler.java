package W4;
// Homework Question 2
// total: 10 points

//===============================================
// todo: complete the following program
//===============================================


import java.util.*;
public class Scheduler {

    public static void main(String[] args) {
        System.out.println("Welcome to the Appointment Scheduler.");
        System.out.println("You can schedule an appointment " +
                "at 1 or 2 pm.");
        Scanner reader = new Scanner(System.in);
        Scanner reader2 = new Scanner(System.in);
        String appointments[] = new String[3];
        int appointmentsMade = 0;
        //Type your codes here


        while (appointmentsMade < 2) {
            try {
                System.out.println("Enter a time: ");
                int k = reader.nextInt();

                if (k != 1 && k != 2) throw new InvalidTimeException();

                if ((k == 1 && appointments[1] != null) || (k == 2 && appointments[2] != null))
                    throw new TimeInUseException();

                System.out.println("Enter your name: ");
                String name = reader2.nextLine();
                appointments[k] = name;
                appointmentsMade += 1;

            } catch (InvalidTimeException ex) {
                System.out.println(ex.getMessage());

            } catch (TimeInUseException ex) {
                System.out.println(ex.getMessage());
            }

        }
    }
}
class InvalidTimeException extends Exception {

    @Override
    public String getMessage() {

        return "Please schedule appointments at either 1pm or 2pm";

    }

}

class TimeInUseException extends Exception {
    @Override
    public String getMessage() {

        return "This time slot is not available.";

    }
}

