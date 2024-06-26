public class GuessGame1 {
    Player p1;
    Player p2;
    Player p3;

    // Constructor
    public void GuessGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
    }

    public void startGame() {
        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I am thinking of a number between 0 and 9...");

        while (true) {
            System.out.println("Number to guess is " + targetNumber);
            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            System.out.println("Player one guessed " + guessp1);

            guessp2 = p2.number;
            System.out.println("Player two guessed " + guessp2);

            guessp3 = p3.number;
            System.out.println("Player three guessed " + guessp3);

            if (guessp1 == targetNumber) {
                p1isRight = true;
            }

            if (guessp2 == targetNumber) {
                p2isRight = true;
            }

            if (guessp3 == targetNumber) {
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("We have a winner!");
                System.out.println("Player one got it right? " + p1isRight);
                System.out.println("Player two got it right? " + p2isRight);
                System.out.println("Player three got it right? " + p3isRight);
                System.out.println("Game is Over.");
                break;
            } else {
                System.out.println("Players will have to try again.");
            }
        }
    }
}

class Player {
    int number = 0; // where the guess goes

    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("I'm guessing " + number);
    }
}

// Main class to run the game
public class Main {
    public static void main(String[] args) {
        // Create a GuessGame instance, which automatically initializes players
        GuessGame game = new GuessGame();
        // Start the game
        game.startGame();
    }
}

