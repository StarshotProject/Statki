package Game;

import java.util.*;

public class Validator {

	void mapMaker() {
		HashMap<String, Double> hm = new HashMap<String, Double>();
		hm.put("A", new Double(1.2));

	}

	public static int readDecision() {

		Scanner skaner = new Scanner(System.in);
		String decision = skaner.next();

		if (decision.matches("[1-6]")) {
			System.out.println(decision.charAt(0));
			int x = decision.charAt(0);
			return x;// (int)decisi on.charAt(0);
		} else {
			System.out.println("Nieznana komenda");
			Help.helpDisplay();
			return readDecision();
		}
	}

	public static int[] readCoordinates() {
		System.out.println("Podaj wspó³rzêdne");
		Scanner skaner = new Scanner(System.in);
		String coordinates = skaner.next();

		if (coordinates.matches("[a-jA-J][0-9]")) {
			System.out.println("format poprawny");
			System.out.println(coordinates);
			char[] temp = coordinates.toCharArray();
			int horizontalCoordinate = temp[0];
			int verticalCoordinate = temp[1];
			int[] Coordinates = new int[2];
			Coordinates[0] = verticalCoordinate - 48;
			Coordinates[1] = horizontalCoordinate - 97;

			for (int x : Coordinates) {
				System.out.println(x);
			}
			return Coordinates;
		} else {
			readCoordinates();
		}
		System.out.println("Niepoprawny format, jeszcze raz");
		return readCoordinates();
	}

	public static void finishTour(Player ob1, Player ob2) {
		Game.player1IsActive = !Game.player1IsActive;
		shootTheOpponentAutomatically(ob1, ob2);
		
		//Game.endOfTourFlag = !Game.endOfTourFlag;
		
	}

	public static void shootTheOpponent(Player ob1, Player ob2) {//ob1 strzela do ob2

		int [] coordinates = Validator.readCoordinates();
		if(ob2.shipDistribution.board[coordinates[0]][coordinates[1]]==0){
			ob1.previousShotsDistribution.board[coordinates[0]][coordinates[1]] = 1;
		}
		else{
			ob1.previousShotsDistribution.board[coordinates[0]][coordinates[1]] = 2;
			ob2.shipDistribution.board[coordinates[0]][coordinates[1]]=3;
			ob1.incrementhitCounter();
			System.out.println("Trafi³eœ! :)");
		}
		ob2.shipDistribution.displayBoard();
		Validator.finishTour(ob1, ob2);
	}

	public static void setShips(Player ob) {
		for (int i = 0; i < 20; i++) {
			int[] coordinates = readCoordinates();
			if (ob.shipDistribution.board[coordinates[0]][coordinates[1]] == 0) {
				ob.shipDistribution.board[coordinates[0]][coordinates[1]] = 1;
				ob.shipDistribution.displayBoard();
			} else {
				System.out.println("Tam ju¿ jest statek!:)");
				System.out.println("Spróbuj jeszcze raz");
				i--;
			}
		}

//		for (Ship x : ob.ships) {
//			for (Mast m : x.masts) {
//				m.setOnBoardFlag = true;
//			}
//		}
	}
	public static void setShipsAutomatically(Player ob){
		for (int i = 0; i < 20; i++){
			int[] coordinates = new int[2];
			coordinates[0] = (int)(10*Math.random());
			coordinates[1] = (int)(10*Math.random());
			if (ob.shipDistribution.board[coordinates[0]][coordinates[1]] == 0) {
				ob.shipDistribution.board[coordinates[0]][coordinates[1]] = 1;
			} else {
				System.out.println("UPs, Tam ju¿ jest statek!:)");
				System.out.println("Spróbujê jeszcze raz :)");
				i--;
		}
	}
		ob.shipDistribution.displayBoard();
}
	public static void shootTheOpponentAutomatically(Player ob1, Player ob2){
		int[] coordinates = new int[2];
		coordinates[0] = (int)(10*Math.random());
		coordinates[1] = (int)(10*Math.random());
		
		if(ob1.previousShotsDistribution.board[coordinates[0]][coordinates[1]] == 1){
			shootTheOpponentAutomatically(ob1, ob2);
		}
		
		if(ob2.shipDistribution.board[coordinates[0]][coordinates[1]]==0){
		   ob1.previousShotsDistribution.board[coordinates[0]][coordinates[1]] = 1;
		}
		else{
			ob1.previousShotsDistribution.board[coordinates[0]][coordinates[1]] = 2;
			ob2.shipDistribution.board[coordinates[0]][coordinates[1]]=3;
			ob1.incrementhitCounter();
		}
		ob2.shipDistribution.displayBoard();
		Game.player1IsActive = !Game.player1IsActive;
	}
	
	public static void whoIsTheWinner(Player ob1, Player ob2){
		if(ob1.getHitCounter()==30){
			System.out.println("Player 1 jest zwyciêzc¹!");
			Game.theGameIsOn = false;
		}
		if(ob2.getHitCounter()==30){
			System.out.println("Player 2 jest zwyciêzc¹!");
			Game.theGameIsOn = false;
		}
	}
}


//losowanie ze zwracaniem:
/*1. Utwórz listê elementów
 *2. Losuj liczbê z zakresu 0-rozmiar listy
 *3. Usuñ element o indeksie wylosowanym z listy (lista jest teraz mniejsza)
 * 
 * */











