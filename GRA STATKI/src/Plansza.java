//plansza gry sk�ada si� z wierszy i kolumn
//kolumny chyba nie musza istnie�? Plansza jest tak 
//naprawd� sum� wierszy

//Czym jest plansze? Kolekc� obiekt�w typu wiersz

//Co robi obiekt plansza? 
//1. Wy�wietla si�
//2. aktualizuje si� po ka�dej rundzie

//pola planszy pomocniczej przyjmuj� nast�puj�ce warto�ci:
//--niestrzelone
//--strzelony nietrafiony
//--strzelony trafiony
//Plansza powinna zosta� wygenerowana na pocz�tku gry
//z obiekt�w typu wiersz. Ka�dy Wiersz powinien mie� przyznawany 
//z sekwencji/generatora ID

//plansza mo�e mie� metod� przeniesienia pobierania wsp�rz�dnych z obiektu statek i na tej podstawie rysowania pozycji.

public class Plansza {


	int [][] plansza = new int[10][10];
	char[] o�_pionowa = {'A','B','C','D','E','F','G','H','I','J'};
	int[]o�_pozioma = {1,2,3,4,5,6,7,8,9,10};
	private int[] po�o�enie;
	
	void rysuj_plansz�(){
		int licznik=1;
		System.out.print("  ");
		
		for(int i=0;i<10;i++){//wsp�rz�dne poziome
			System.out.print(o�_pozioma[i]+" ");

		}
		for(int i=0;i<10;i++){//plansza
			
			System.out.println();
			System.out.print(o�_pionowa[i]+" ");
			for(int j=0;j<10;j++){
				System.out.print(plansza[i][j]+" ");
				
			}
		}
	}
	//metoda "umie�� statek" powinna si� wykona� po dla wszystkich kolejnych obiekt�w typu statek gracza
	void umie��_statek(Statek ob){
		plansza[this.po�o�enie[0]][this.po�o�enie[1]]=1;
	}
	//przej�cie po wszystkic statkach danego gracza, zczytanie z ka�dego po�o�enia i modyfikacja odpowiedniego pola na planszy.
	void umie��_wszystkie_statki(Gracz ob){
		for(Statek x: ob.statki){
			//jak uzyska� dost�p do wszystkich statk�w w kolekcji po kolei
			//poni�sza instrukcja jest wykonywana dla ka�dego obiektu kolekcji statki
			try{
			plansza[po�o�enie[0]][po�o�enie[1]]=1;
			plansza[po�o�enie[2]][po�o�enie[3]]=1;
			plansza[po�o�enie[4]][po�o�enie[5]]=1;
			plansza[po�o�enie[6]][po�o�enie[7]]=1;
			}
			catch (ArrayIndexOutOfBoundsException poza_po�o�eniem) {
			continue;
			}
		}
	} 
}















