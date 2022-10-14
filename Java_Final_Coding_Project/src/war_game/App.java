package war_game;

import java.util.*;

public class App {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Welcome to WAR!");
		int decision = 0;
		while (decision != 2) {
			printOptions();
			String input = scanner.next();
			try {
				decision = Integer.parseInt(input);
			} catch (NumberFormatException e) {
//				e.printStackTrace();
			}
			if (decision == 1) {
				runGame();
			} else if (decision == 2) {
				System.out.println("Goodbye.");
			} else {
				System.out.println(input + " is not a valid option.");
			}
		}
		
	}
	
	public static void printOptions() {
		System.out.println("Please choose from the following options:");
		System.out.println("1) Begin New Game");
		System.out.println("2) Exit Menu");
	}
	
	public static void runGame() {
		System.out.print("What do you wish to name Player 1? ");
		Player player1 = new Player(scanner.next());
		System.out.print("What do you wish to name Player 2? ");
		Player player2 = new Player(scanner.next());
		Deck deck = new Deck();
		System.out.println("The deck is shuffled.");
		deck.shuffle(deck.getCards());
		System.out.println("Each player is dealt 26 cards.");
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.draw(deck);
			} else {
				player2.draw(deck);
			}
		}
		for (int i = 0; i < 26; i++) {
			System.out.println("Battle " + (i + 1) + ":");
			Card flip1 = player1.flip();
			Card flip2 = player2.flip();
			System.out.println(player1.getName() + " has flipped over the " + flip1.describe() + ".");
			System.out.println(player2.getName() + " has flipped over the " + flip2.describe() + ".");
			if (flip1.getValue() > flip2.getValue()) {
				System.out.println(player1.getName() + " wins and " + player1.getName() + "'s score increments from " + player1.getScore() + " to " + (player1.getScore() + 1) + ".");
				player1.incrementScore();
			} else if (flip2.getValue() > flip1.getValue()) {
				System.out.println(player2.getName() + " wins and " + player2.getName() + "'s score increments from " + player2.getScore() + " to " + (player2.getScore() + 1) + ".");
				player2.incrementScore();
			} else {
				System.out.println("This battle was a tie and no points are awareded.");
			}
		}
		System.out.println("Results:");
		System.out.println(player1.getName() + "'s total score is " + player1.getScore() + ".");
		System.out.println(player2.getName() + "'s total score is " + player2.getScore() + ".");
		if (player1.getScore() > player2.getScore()) {
			System.out.println(player1.getName() + " has won!");
		} else if (player1.getScore() < player2.getScore()) {
			System.out.println(player2.getName() + " has won!");
		} else {
			System.out.println("The game was a tie!");
		}
		
	}
	
}
