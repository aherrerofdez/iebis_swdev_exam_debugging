import java.util.Random;

@SuppressWarnings("ALL")
public class Main {

    public static void main(String[] args) {
        String emailAddress = "john.doe.mis2016@ie.edu";
        String formattedEmailAddress = emailAddress.replaceAll("[^a-z0-9@]", "/"); //regex changed

        Random random = new Random();
        StringBuffer word = null;

        switch (random.nextInt(3)) { //bound of random (always counts one less so bound = 3, goes from 0 to 2
            case 0:
                word = new StringBuffer("Y"); //stringbuffer constructor allows as input char sequences, strings or ints
            case 1:
                word = new StringBuffer("F"); //stringbuffer constructor allows as input char sequences, strings or ints
            case 2:
                word = new StringBuffer("T"); //stringbuffer constructor allows as input char sequences, strings or ints
        }

        word.append('o');
        word.append('u');
        word.append('r');

        System.out.println(word + " " + formattedEmailAddress);
    }
}
