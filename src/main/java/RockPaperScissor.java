import java.util.Random;

public class RockPaperScissor {

    public static void main(String[] args) {
        Random rand = new Random();
        int chance = rand.nextInt(3);
        if (chance == 0) {
            System.out.println("Rock");
        }
        if (chance == 1) {
            System.out.println("Paper");
        }
        if (chance == 2) {
            System.out.println("Scissors");
        }
    }
}