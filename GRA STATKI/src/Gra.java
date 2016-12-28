//Schemat gry:
//Wygeneruj planszê dla gracza numer
//1.Poproœ gracza numer 1 o roz³o¿enie statków na planszy
//2.Poproœ gracza numer dwa o roz³o¿enie statków na planszy
//3.Wyœwietl informacjê czyja teraz jest kolej
//4.Wyœwietl planszê gry dla gracza, którego jest kolej
//5.Zapytaj gdzie chce oddaæ strza³
//6.Wczytaj od niego wspó³rzêdne z walidacj¹
//7.Poinformuj o rezultacie
//8.Powtórz 1-5 dla drugiego gracza
//9.Zakoñcz grê, jeœli liczba statków u którego kolwiek z graczy spadnie do zera
//10.Poinformuj graczy kto wygra³ grê.

//Gra przeciw komputerowi

//sterowanie pomiêdzy graczami na podstawie w¹tków?
import java.util.*;


public class Gra {
	
	public static void main(String[]args){
		Scanner skaner = new Scanner(System.in);
		
		Gracz gracz1 = new Gracz();//stworzenie obiektu gracza, tworzy od razu wszystkie stowarzyszone z nim obiekty
		
		System.out.println("Witaj! To jest gra 'Statki'");
		System.out.println("Poni¿ej znajduje siê twoja plansza");
		
		
		Plansza plansza = new Plansza();
		
		plansza.rysuj_planszê();
	
	System.out.println();
	System.out.println("Masz nastêpuj¹ce statki do ustawienia na planszy");
	System.out.println("(*)(*)(*)(*) - 4 jednomasztowce");
	System.out.println("(**)(**)(**)- 3 dwumasztowce");
	System.out.println("(***)(***) - 2 trójmasztowce");
	System.out.println("(****) - 1 czteromasztowiec");
	System.out.println("Aby umieœciæ statek na planszy, podaj wspó³rzêdne");
	System.out.println("Podawaj wspó³rzedne pokolei w postaci np.'A;1'");
	//teraz metoda musi zostaæ uruchomiona 20 razy
	//walidacje po stronie metody
	//teraz powinna nast¹piæ definicja wspó³rzêdnych obiektów typu statek
//	while(!gracz1.statek4a.umieszczony_na_planszy){//wszystkie statki umieszczone na planszy
//		statek1a:{gracz1.statek1a.liczba_masztów=1;
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
		
			
			
	//	plansza.umieœæ_statek(skaner.nextLine()(), skaner.nextInt());
	//plansza.rysuj_planszê();
	System.out.println(gracz1.getClass());
	plansza.umieœæ_wszystkie_statki(gracz1);
	plansza.rysuj_planszê();
	System.out.println(gracz1.getClass());
	
	
	


	}
}
















