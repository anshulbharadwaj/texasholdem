package com.prework.texasholdem;

import java.util.Collections;
import java.util.Stack;

public class Deck {

	private Stack<Card> cards;

    public Deck(){
        // construct standard deck
        this.cards = new Stack();
        for(Suit suit : Suit.values()) {
            for(Rank rank : Rank.values())
                this.cards.add(new Card(suit, rank));
        }
        System.out.println(cards);
        // shuffle deck
        Collections.shuffle(this.cards);
    }
    
    public int size(){
        return this.cards.size();
    }
    
    public boolean empty(){
        return this.cards.empty();
    }
    
    public Card drawCard(){
    	return this.cards.pop();
    }
    

	public static void main(String[] args) {
		Deck d = new Deck();

	}
}
