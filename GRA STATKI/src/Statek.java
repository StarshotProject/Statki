//statek przechowuje informacj� o trafieniu
//metoda umie�c statek, wpisanie wsp�rz�dnych

import java.util.*;

public class Statek {
	
	Statek(int x){
		liczba_maszt�w = x;
		int[] po�o�enie = new int[(2*x)];//liczb b�dzie 2 razy wi�cej ni� maszt�w, bo jeden maszt to dwie liczby
		boolean umieszczony_na_planszy = false;
		boolean trafiony = false;
		boolean zatopiony = false;
	}
	
	int liczba_maszt�w;
	int[]po�o�enie;//po�o�enie b�d� przechowywa� jako ciag liczb nastepuj�cych kolejno po sobie, ale przechowywane w p�askkiej strukturze
	boolean umieszczony_na_planszy = false;
	boolean trafiony = false;
	boolean zatopiony = false;
	
	boolean czy_zatopiony(Statek ob){
		boolean zatopiony = false;
		int licznik = 0;
		return zatopiony;
	}
	
	// x-liczba maszt�w,y-wspolrzedna pozioma,a-wspolrzedna pionowa
	void umie��_statek(int x, int y, Plansza ob) {
		
	}
}