//plansza gry sk³ada siê z wierszy i kolumn
//kolumny chyba nie musza istnieæ? Plansza jest tak 
//naprawdê sum¹ wierszy

//Czym jest plansze? Kolekc¹ obiektów typu wiersz

//Co robi obiekt plansza? 
//1. Wyœwietla siê
//2. aktualizuje siê po ka¿dej rundzie

//pola planszy pomocniczej przyjmuj¹ nastêpuj¹ce wartoœci:
//--niestrzelone
//--strzelony nietrafiony
//--strzelony trafiony
//Plansza powinna zostaæ wygenerowana na pocz¹tku gry
//z obiektów typu wiersz. Ka¿dy Wiersz powinien mieæ przyznawany 
//z sekwencji/generatora ID

//plansza mo¿e mieæ metodê przeniesienia pobierania wspó³rzêdnych z obiektu statek i na tej podstawie rysowania pozycji.

public class Plansza {


	int [][] plansza = new int[10][10];
	char[] oœ_pionowa = {'A','B','C','D','E','F','G','H','I','J'};
	int[]oœ_pozioma = {1,2,3,4,5,6,7,8,9,10};
	private int[] po³o¿enie;
	
	void rysuj_planszê(){
		int licznik=1;
		System.out.print("  ");
		
		for(int i=0;i<10;i++){//wspó³rzêdne poziome
			System.out.print(oœ_pozioma[i]+" ");

		}
		for(int i=0;i<10;i++){//plansza
			
			System.out.println();
			System.out.print(oœ_pionowa[i]+" ");
			for(int j=0;j<10;j++){
				System.out.print(plansza[i][j]+" ");
				
			}
		}
	}
	//metoda "umieœæ statek" powinna siê wykonaæ po dla wszystkich kolejnych obiektów typu statek gracza
	void umieœæ_statek(Statek ob){
		plansza[this.po³o¿enie[0]][this.po³o¿enie[1]]=1;
	}
	//przejœcie po wszystkic statkach danego gracza, zczytanie z ka¿dego po³o¿enia i modyfikacja odpowiedniego pola na planszy.
	void umieœæ_wszystkie_statki(Gracz ob){
		for(Statek x: ob.statki){
			//jak uzyskaæ dostêp do wszystkich statków w kolekcji po kolei
			//poni¿sza instrukcja jest wykonywana dla ka¿dego obiektu kolekcji statki
			try{
			plansza[po³o¿enie[0]][po³o¿enie[1]]=1;
			plansza[po³o¿enie[2]][po³o¿enie[3]]=1;
			plansza[po³o¿enie[4]][po³o¿enie[5]]=1;
			plansza[po³o¿enie[6]][po³o¿enie[7]]=1;
			}
			catch (ArrayIndexOutOfBoundsException poza_po³o¿eniem) {
			continue;
			}
		}
	} 
}















