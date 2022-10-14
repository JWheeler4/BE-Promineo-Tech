package war_game;

import java.util.*;

public class Player {
	
	private List<Card> hand = new ArrayList<>();
	private int score;
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public List<Card> getHand() {
		return hand;
	}
	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
	
	public Player(String name) {
		this.hand = new ArrayList<Card>();
		this.score = 0;
		this.name = name;
	}
	
	public void describe() {
		System.out.println("Player: " + name + ", Score: " + score);
		System.out.println("Hand:");
		for (Card card : hand) {
			System.out.println(card.describe());
		}
	}
	
	public Card flip() {
		Card flippedCard = hand.get(0);
		List<Card> newCards = new ArrayList<>();
		for (int i = 1; i < hand.size(); i++) {
			newCards.add(hand.get(i));
		}
		hand = newCards;
		return flippedCard;
	}
	
	public Card draw(Deck deck) {
		Card drawnCard = deck.draw();
		hand.add(drawnCard);
		return drawnCard;
	}
	
	public void incrementScore() {
		score++;
	}
	
}
