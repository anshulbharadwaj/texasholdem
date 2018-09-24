package com.prework.texasholdem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Hand {

	/**
     * The cards in the hand.
     */
	private final List<Card> holeCards = new ArrayList();
	private final List<Card> communityCards = new ArrayList();
	private final List sevenCards = new ArrayList();
	
	
	public void addCard(Card card) {
		this.holeCards.add(new Card(card.suit,card.rank));
	}
	
	public List addHoleCards(List<Card> cards) {
		for(Card card:cards) {
			this.holeCards.add(new Card(card.suit,card.rank));
		}
		return holeCards;
	}
	
	public void addCommunityCards(List<Card> cards) {
		for(Card card:cards) {
			this.communityCards.add(new Card(card.suit,card.rank));
		}
	}
	
	public List mergeCards(){
		sevenCards.addAll(holeCards);
		sevenCards.addAll(communityCards);
		return sevenCards;
	}
	
	public void showHoleCards() {
		for(Card card: this.holeCards) {
			System.out.print(card.rank.getRankSymbol()+card.suit.getCardSymbol()+",");
		}
	}
	
	public void showCommunityCards() {
		for(Card card: this.communityCards) {
			System.out.print(card.rank.getRankSymbol()+card.suit.getCardSymbol()+",");
		}
	}
}
