package Pertemuan11.prak2;

public class Main {
    public static void main(String[] args) {
        ScavangerHunt game = new ScavangerHunt();
        game.addPoint("What has a head, a tail, is brown, and has no legs?", "Penny");
        game.addPoint("What has keys but can't open locks?", "Piano");
        game.addPoint("What can travel around the world while staying in a corner?", "Stamp");

        System.out.println("Welcome to the Scavenger Hunt!");
        System.out.println("Here's your first question:");
        System.out.println(game.getNextQuestion());

        // Simulate user input for answers
        System.out.println(game.checkAnswer("Penny"));
        System.out.println(game.checkAnswer("Piano"));
        System.out.println(game.checkAnswer("Stamp"));
    }
}
