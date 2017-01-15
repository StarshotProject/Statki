package Game;

import java.util.*;

public class Ship {
	int numberOfMasts;
	Mast[] masts;
	
	Ship(int x){
		numberOfMasts = x;
		Mast[] masts = new Mast[numberOfMasts];
		for(int i=0;i<numberOfMasts;i++){
			masts[i] = new Mast();
		}
		
	}
	
	public void placeShipOnBoard(Ship ob){
		for(int i=0;i<ob.numberOfMasts;i++){
			Scanner skaner = new  Scanner(System.in);
			String mastCoordinates = skaner.next();
			if(mastCoordinates.length()>2){
				placeShipOnBoard(ob);
			}
			
		}
	}
}