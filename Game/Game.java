package Game;

import java.util.*;

public class Game {
	static boolean theGameIsOn = true;
	static boolean player1IsActive = true;
	public static void main(String[] args) {

		Scanner skaner = new Scanner(System.in);

		Player player1 = new Player();
		Player player2 = new Player();

		System.out.println("Witaj! To jest gra 'Statki'");
		System.out.println("Poni�ej znajduje si� twoja plansza");
		System.out.println();
		Board plansza = new Board();
		plansza.displayBoard();
		System.out.println();
		System.out.println("Masz nast�puj�ce statki do ustawienia na planszy");
		System.out.println("(*)(*)(*)(*) - 4 jednomasztowce");
		System.out.println("(**)(**)(**)- 3 dwumasztowce");
		System.out.println("(***)(***) - 2 tr�jmasztowce");
		System.out.println("(****) - 1 czteromasztowiec");
		System.out.println("Aby umie�ci� statek na planszy, podaj wsp�rz�dne");
		System.out.println("Podawaj wsp�rzedne pokolei w postaci np.'A1'");
		
		Validator.setShips(player1);
		System.out.println();
		Validator.setShipsAutomatically(player2);
		
		System.out.println();
		System.out.println("Statki ustawione, zaczynamy gr�! :)");
		Help.helpDisplay();

		//while (player1.getIsWinnerFlag()||player2.getIsWinnerFlag()
		// GameArbiter.endGameConditionsChecker(player2) {// od tego momentu
		// toczy si� gra
		
		while(theGameIsOn){
			while(player1IsActive){
				switch (Validator.readDecision() - 48) {
				case 1: {
					Validator.finishTour(player1,player2);
					break;
				}
				case 2: {
					System.out.println("Twoje statki");
					player1.shipDistribution.displayBoard();
					break;
				}
				case 3: {
					System.out.println("Twoja plansza trafie�");
					player1.previousShotsDistribution.displayBoard();
					break;
				}
				case 4: {
					Validator.shootTheOpponent(player1,player2);
					break;
				}
				case 5: {
					Help.helpDisplay();
					break;
				}
				case 6: {
					System.out.println("Plansza wroga:\n");
					player2.shipDistribution.displayBoard();
					System.out.println();
					System.out.println("Plansza trafie� nale��ca do wroga");
					player2.previousShotsDistribution.displayBoard();
					break;
				}
				case 7: {
					System.out.println("player1 :" + player1.getHitCounter());
					System.out.println("player2 :" + player2.getHitCounter());
				}
			// }
				}
			}
		Validator.shootTheOpponentAutomatically(player2, player1);
		Validator.whoIsTheWinner(player1, player2);
		
		}
	}
}
