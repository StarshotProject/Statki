//Schemat gry:
//Wygeneruj plansz� dla gracza numer
//1.Popro� gracza numer 1 o roz�o�enie statk�w na planszy
//2.Popro� gracza numer dwa o roz�o�enie statk�w na planszy
//3.Wy�wietl informacj� czyja teraz jest kolej
//4.Wy�wietl plansz� gry dla gracza, kt�rego jest kolej
//5.Zapytaj gdzie chce odda� strza�
//6.Wczytaj od niego wsp�rz�dne z walidacj�
//7.Poinformuj o rezultacie
//8.Powt�rz 1-5 dla drugiego gracza
//9.Zako�cz gr�, je�li liczba statk�w u kt�rego kolwiek z graczy spadnie do zera
//10.Poinformuj graczy kto wygra� gr�.

//Gra przeciw komputerowi

//sterowanie pomi�dzy graczami na podstawie w�tk�w?
import java.util.*;


public class Gra {
	
	public static void main(String[]args){
		Scanner skaner = new Scanner(System.in);
		
		Gracz gracz1 = new Gracz();//stworzenie obiektu gracza, tworzy od razu wszystkie stowarzyszone z nim obiekty
		
		System.out.println("Witaj! To jest gra 'Statki'");
		System.out.println("Poni�ej znajduje si� twoja plansza");
		
		
		Plansza plansza = new Plansza();
		
		plansza.rysuj_plansz�();
	
	System.out.println();
	System.out.println("Masz nast�puj�ce statki do ustawienia na planszy");
	System.out.println("(*)(*)(*)(*) - 4 jednomasztowce");
	System.out.println("(**)(**)(**)- 3 dwumasztowce");
	System.out.println("(***)(***) - 2 tr�jmasztowce");
	System.out.println("(****) - 1 czteromasztowiec");
	System.out.println("Aby umie�ci� statek na planszy, podaj wsp�rz�dne");
	System.out.println("Podawaj wsp�rzedne pokolei w postaci np.'A;1'");
	//teraz metoda musi zosta� uruchomiona 20 razy
	//walidacje po stronie metody
	//teraz powinna nast�pi� definicja wsp�rz�dnych obiekt�w typu statek
//	while(!gracz1.statek4a.umieszczony_na_planszy){//wszystkie statki umieszczone na planszy
//		statek1a:{gracz1.statek1a.liczba_maszt�w=1;
//		}
//		statek1b:{}
//		statek1c:{}
//		statek1d:{}
//		statek2a:{}
//		statek2b:{}
//		statek2c:{}
//		statek3a:{}
//		statek3b:{}
//		statek4a:{}
		
			
			
	//	plansza.umie��_statek(skaner.nextLine()(), skaner.nextInt());
	//plansza.rysuj_plansz�();
	System.out.println(gracz1.getClass());
	plansza.umie��_wszystkie_statki(gracz1);
	plansza.rysuj_plansz�();
	System.out.println(gracz1.getClass());
	
	
	


	}
}
















