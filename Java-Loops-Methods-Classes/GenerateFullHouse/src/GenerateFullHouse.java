
public class GenerateFullHouse {
	/**
	 * In most Poker games, the "full house" hand is defined as three cards of
	 * the same face + two cards of the same face, other than the first,
	 * regardless of the card's suits. The cards faces are "2", "3", "4", "5",
	 * "6", "7", "8", "9", "10", "J", "Q", "K" and "A". The card suits are "♣",
	 * "♦", "♥" and "♠". Write a program to generate and print all full houses
	 * and print their number.
	 * 
	 */

	public static void main(String[] args) {
		String[] faces = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
		char[] suits = { '\u2663', '\u2666', '\u2665', '\u2660' };
		int count = 0;
		
		for (int i = 0; i < faces.length; i++) { // номер на първите карти
			for (int j = 0; j < faces.length; j++) { // номер на вторите карти
				for (int j2 = 0; j2 < suits.length; j2++) { // boq na parvite karti
					for (int k = j2 + 1; k < suits.length; k++) {
						for (int k2 = k + 1; k2 < suits.length; k2++) {
							for (int l = 0; l < suits.length; l++) { // boq na vtorite karti
								for (int l2 = l + 1; l2 < suits.length; l2++) {
									if (i != j) {
										System.out.printf("%s%c %s%c %s%c %s%c %s%c\n", 
												faces[i], suits[j2], faces[i],
												suits[k], faces[i], suits[k2],
												faces[j], suits[l], faces[j], suits[l2]);
										count++;
									}
								}
							}
						}
					}
				}
			}
			System.out.println(count + " full houses");
		}
	}
}
