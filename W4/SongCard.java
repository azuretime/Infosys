
// Homework Question 3
// total: 15 points

//===============================================
// todo: complete the following program
//===============================================

package W4;


import java.util.*;
public class SongCard {

    private int songs;
    private boolean activated;
    public SongCard(int n) {
        songs=n;
    }
    public void activate(){
        activated=true;
}
    public void buyASong()
        throws CardNotActivatedException, CardEmptyException {

        if (!activated) throw new CardNotActivatedException();
        if (songs<=0) throw new CardEmptyException();
        songs-=1;

    }

    public int songsRemaining(){
        //Type your codes here
         return songs;
    }
    public String toString() {
        //Type your codes here
        return String.format("Card has %d songs and is %s", songs,

                (activated ? "activated" : "not activated"));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SongCard sc = new SongCard(10);
        System.out.println(sc);
        System.out.println("Trying to buy a song");
        try{
            sc.buyASong();
        } catch (CardEmptyException e1){
            System.out.println("Caught error: " +e1.getMessage() );
        } catch (CardNotActivatedException e2){
            System.out.println("Caught error: " +e2.getMessage() );
        }
        System.out.println(sc);
        System.out.println("Activating the card");
        sc.activate();
        System.out.println(sc);
        System.out.println("Buying songs");
        
        //Type your codes here
        while (true) {

            try {

                sc.buyASong();

                System.out.println("Bought a song: " + sc);

            } catch (CardEmptyException e) {

                System.out.println("Caught error: " + e.getMessage());

                break;

            } catch (CardNotActivatedException e) {

                System.out.println("Caught error: " + e.getMessage());

                break;

            }

        }

        System.out.println(sc);

    }

    public class CardNotActivatedException extends Exception{
       // Type your codes here

        @Override
        public String getMessage() {

            return "Card not activated";

        }
    }

    public class CardEmptyException extends Exception{
       // Type your codes here

        @Override
        public String getMessage() {

            return "No more songs on the card";

        }
    }
}
