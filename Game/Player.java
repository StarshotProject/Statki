package Game;

public class Player {

	Board shipDistribution;
	Board previousShotsDistribution;
	private int hitCounter;
	
	void incrementhitCounter(){
		hitCounter++;
	}
	
	public int getHitCounter() {
		return hitCounter;
	}
	
	private boolean isWinnerFlag = false;
	
	boolean getIsWinnerFlag(){
		return isWinnerFlag;
	}
	Ship ship1a;
	Ship ship1b;
	Ship ship1c;
	Ship ship1d;
	Ship ship2a;
	Ship ship2b;
	Ship ship2c;
	Ship ship3a;
	Ship ship3b;
	Ship ship4a;
	Ship[] ships = { ship1a, ship1b, ship1c, ship1d, ship2a, ship2b, ship2c, ship3a, ship3b, ship4a };

	Player() {
		shipDistribution = new Board();
		previousShotsDistribution = new Board();

		ship1a = new Ship(1);
		ship1b = new Ship(1);
		ship1c = new Ship(1);
		ship1d = new Ship(1);
		ship2a = new Ship(2);
		ship2b = new Ship(2);
		ship2c = new Ship(2);
		ship3a = new Ship(3);
		ship3b = new Ship(3);
		ship4a = new Ship(4);
		Ship[] ships = { ship1a, ship1b, ship1c, ship1d, ship2a, ship2b, ship2c, ship3a, ship3b, ship4a };
	}
}
