import java.util.Random;

@SuppressWarnings("ALL")
public class Main {

    public static void main(String[] args) {
        String emailAddress = "john.doe.mis2016@ie.edu";
        String formattedEmailAddress = emailAddress.replaceAll("[^a-z0-9@]", "/"); //regex changed

        Random random = new Random();
        StringBuffer word = null;

        switch (random.nextInt(3)) {
            case 0:
                word = new StringBuffer("Y"); //stringbuffer constructor allows as input char sequences, strings or ints
                break; //lacking break
            case 1:
                word = new StringBuffer("F"); //stringbuffer constructor allows as input char sequences, strings or ints
                break; //lacking break
            case 2:
                word = new StringBuffer("T"); //stringbuffer constructor allows as input char sequences, strings or ints
                break; //lacking break
        }

        word.append('o');
        word.append('u');
        word.append('r');

        System.out.println(word + " " + formattedEmailAddress);
    }
}
