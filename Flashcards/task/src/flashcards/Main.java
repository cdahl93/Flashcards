package flashcards;

import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for number of cards
        System.out.println("Input the number of cards:");
        int numberOfCards = scanner.nextInt();
        scanner.nextLine();

        // Arrays
        String[] terms = new String[numberOfCards];
        String[] definitions = new String[numberOfCards];

        // read inputs
        for (int i = 0 ; i < numberOfCards ; i++) {
            System.out.println("The card #" + (i+1) + ":");
            terms[i] = scanner.nextLine();
            System.out.println("The definition of the card #" + (i+1) + ":");
            definitions[i] = scanner.nextLine();
        }

        // ask for all definitions
        String answer = null;
        for (int i = 0 ; i < numberOfCards ; i++) {
            System.out.println("Print the definition of \"" + terms[i] + "\":");
            answer = scanner.nextLine();
            if (definitions[i].equals(answer)){
                System.out.println("Correct answer");
            } else {
                System.out.println("Wrong answer. The correct one is \"" + definitions[i] + "\".");
            }
        }

    }
}
