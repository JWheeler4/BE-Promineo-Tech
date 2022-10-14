package war_game;

import java.util.*;

public class Deck {
	
	private static Card twoOfSpades = new Card(2, "Two of Spades");
	private static Card threeOfSpades = new Card(3, "Three of Spades");
	private static Card fourOfSpades = new Card(4, "Four of Spades");
	private static Card fiveOfSpades = new Card(5, "Five of Spades");
	private static Card sixOfSpades = new Card(6, "Six of Spades");
	private static Card sevenOfSpades = new Card(7, "Seven of Spades");
	private static Card eightOfSpades = new Card(8, "Eight of Spades");
	private static Card nineOfSpades = new Card(9, "Nine of Spades");
	private static Card tenOfSpades = new Card(10, "Ten of Spades");
	private static Card jackOfSpades = new Card(11, "Jack of Spades");
	private static Card queenOfSpades = new Card(12, "Queen of Spades");
	private static Card kingOfSpades = new Card(13, "King of Spades");
	private static Card aceOfSpades = new Card(14, "Ace of Spades");
	private static Card twoOfDiamonds = new Card(2, "Two of Diamonds");
	private static Card threeOfDiamonds = new Card(3, "Three of Diamonds");
	private static Card fourOfDiamonds = new Card(4, "Four of Diamonds");
	private static Card fiveOfDiamonds = new Card(5, "Five of Diamonds");
	private static Card sixOfDiamonds = new Card(6, "Six of Diamonds");
	private static Card sevenOfDiamonds = new Card(7, "Seven of Diamonds");
	private static Card eightOfDiamonds = new Card(8, "Eight of Diamonds");
	private static Card nineOfDiamonds = new Card(9, "Nine of Diamonds");
	private static Card tenOfDiamonds = new Card(10, "Ten of Diamonds");
	private static Card jackOfDiamonds = new Card(11, "Jack of Diamonds");
	private static Card queenOfDiamonds = new Card(12, "Queen of Diamonds");
	private static Card kingOfDiamonds = new Card(13, "King of Diamonds");
	private static Card aceOfDiamonds = new Card(14, "Ace of Diamonds");
	private static Card twoOfHearts = new Card(2, "Two of Hearts");
	private static Card threeOfHearts = new Card(3, "Three of Hearts");
	private static Card fourOfHearts = new Card(4, "Four of Hearts");
	private static Card fiveOfHearts = new Card(5, "Five of Hearts");
	private static Card sixOfHearts = new Card(6, "Six of Hearts");
	private static Card sevenOfHearts = new Card(7, "Seven of Hearts");
	private static Card eightOfHearts = new Card(8, "Eight of Hearts");
	private static Card nineOfHearts = new Card(9, "Nine of Hearts");
	private static Card tenOfHearts = new Card(10, "Ten of Hearts");
	private static Card jackOfHearts = new Card(11, "Jack of Hearts");
	private static Card queenOfHearts = new Card(12, "Queen of Hearts");
	private static Card kingOfHearts = new Card(13, "King of Hearts");
	private static Card aceOfHearts = new Card(14, "Ace of Hearts");
	private static Card twoOfClubs = new Card(2, "Two of Clubs");
	private static Card threeOfClubs = new Card(3, "Three of Clubs");
	private static Card fourOfClubs = new Card(4, "Four of Clubs");
	private static Card fiveOfClubs = new Card(5, "Five of Clubs");
	private static Card sixOfClubs = new Card(6, "Six of Clubs");
	private static Card sevenOfClubs = new Card(7, "Seven of Clubs");
	private static Card eightOfClubs = new Card(8, "Eight of Clubs");
	private static Card nineOfClubs = new Card(9, "Nine of Clubs");
	private static Card tenOfClubs = new Card(10, "Ten of Clubs");
	private static Card jackOfClubs = new Card(11, "Jack of Clubs");
	private static Card queenOfClubs = new Card(12, "Queen of Clubs");
	private static Card kingOfClubs = new Card(13, "King of Clubs");
	private static Card aceOfClubs = new Card(14, "Ace of Clubs");
	
	private List<Card> cards = new ArrayList<>();

	public Deck() {
		this.setCards(Arrays.asList(twoOfSpades, threeOfSpades, fourOfSpades, fiveOfSpades,
				 sixOfSpades, sevenOfSpades, eightOfSpades, nineOfSpades, tenOfSpades,
				 jackOfSpades, queenOfSpades, kingOfSpades, aceOfSpades, twoOfDiamonds,
				 threeOfDiamonds, fourOfDiamonds, fiveOfDiamonds, sixOfDiamonds,
				 sevenOfDiamonds, eightOfDiamonds, nineOfDiamonds, tenOfDiamonds,
				 jackOfDiamonds, queenOfDiamonds, kingOfDiamonds, aceOfDiamonds, twoOfHearts,
				 threeOfHearts, fourOfHearts, fiveOfHearts, sixOfHearts, sevenOfHearts,
				 eightOfHearts, nineOfHearts, tenOfHearts, jackOfHearts, queenOfHearts,
				 kingOfHearts, aceOfHearts, twoOfClubs, threeOfClubs, fourOfClubs,
				 fiveOfClubs, sixOfClubs, sevenOfClubs, eightOfClubs, nineOfClubs, tenOfClubs,
				 jackOfClubs, queenOfClubs, kingOfClubs, aceOfClubs));
	}
	
	public List<Card> shuffle(List<Card> cards) {
		Collections.shuffle(cards);
		return cards;
	}
	
	public Card draw() {
		Card topCard = cards.get(0);
		List<Card> newCards = new ArrayList<>();
		for (int i = 1; i < cards.size(); i++) {
			newCards.add(cards.get(i));
		}
		cards = newCards;
		return topCard;
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	
}
