package com.prework.texasholdem;

import java.util.Arrays;
import java.util.Scanner;

public class TexasHoldemRunner {

	public static void main(String[] args) {
		System.out.println("Enter the number of players");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		if(input<2 || input> 9) {
			throw new IllegalArgumentException(" please enter valid number between 2 - 9 ");
		}
		System.out.println(" Number of players: "+ input);
		
		Player player = new Player("firstPlayer");
		Deck deck = new Deck();
		System.out.println("before deck size is: " + deck.size());
		
		player.hand.addHoleCards(Arrays.asList(deck.drawCard(),deck.drawCard()));
		player.hand.addCommunityCards((Arrays.asList(deck.drawCard(),deck.drawCard(),deck.drawCard(),deck.drawCard(),deck.drawCard())));
		
		System.out.println("after deck size is: " + deck.size());
		
		player.showHand();
	}
}
