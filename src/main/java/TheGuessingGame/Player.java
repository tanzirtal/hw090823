package TheGuessingGame;

public class Player {
    int number = 0; //guess will be input here

    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("I'm guessing " + number);
    }
}
