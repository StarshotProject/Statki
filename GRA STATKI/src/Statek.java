//statek przechowuje informacjê o trafieniu
//metoda umieœc statek, wpisanie wspó³rzêdnych

import java.util.*;

public class Statek {
	
	Statek(int x){
		liczba_masztów = x;
		int[] po³o¿enie = new int[(2*x)];//liczb bêdzie 2 razy wiêcej ni¿ masztów, bo jeden maszt to dwie liczby
		boolean umieszczony_na_planszy = false;
		boolean trafiony = false;
		boolean zatopiony = false;
	}
	
	int liczba_masztów;
	int[]po³o¿enie;//po³o¿enie bêdê przechowywa³ jako ciag liczb nastepuj¹cych kolejno po sobie, ale przechowywane w p³askkiej strukturze
	boolean umieszczony_na_planszy = false;
	boolean trafiony = false;
	boolean zatopiony = false;
	
	boolean czy_zatopiony(Statek ob){
		boolean zatopiony = false;
		int licznik = 0;
		return zatopiony;
	}
	
	// x-liczba masztów,y-wspolrzedna pozioma,a-wspolrzedna pionowa
	void umieœæ_statek(int x, int y, Plansza ob) {
		
	}
}