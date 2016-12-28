//gra powinna opieraæ siê na graczach
//ka¿dy gracz ma swoj¹ planszê i swoje statki


public class Gracz {
	
	Plansza plansza_g³ówna;
	Plansza plansza_pomocnicza;
	Statek statek1a;
	Statek statek1b;
	Statek statek1c;
	Statek statek1d;
	Statek statek2a;
	Statek statek2b;
	Statek statek2c;
	Statek statek3a;
	Statek statek3b;
	Statek statek4a;
	//Statek [] statki;
	Statek [] statki = {statek1a,statek1b,statek1c,statek1d,statek2a,statek2b,statek2c,statek3a,statek3b,statek4a};
	//metoda strza³ powinna równie¿ za ka¿dym razem sprawdzaæ, czy gra powinna siê teraz zakoñczyæ, ale tylko wtedy kiedy trafi.
	Gracz(){
		Plansza plansza_g³ówna;
		Plansza plansza_pomocnicza;
		Statek statek1a= new Statek(1);
		Statek statek1b= new Statek(1);
		Statek statek1c= new Statek(1);
		Statek statek1d= new Statek(1);
		Statek statek2a= new Statek(2);
		Statek statek2b= new Statek(2);
		Statek statek2c= new Statek(2);
		Statek statek3a= new Statek(3);
		Statek statek3b= new Statek(3);
		Statek statek4a= new Statek(4);
		Statek [] statki = {statek1a,statek1b,statek1c,statek1d,statek2a,statek2b,statek2c,statek3a,statek3b,statek4a};
	}
	
	void strza³(){};
	boolean czy_koniec_gry(){
		boolean koniec_gry = false;
		
//		for(Statek x: this.statki){
//			this.
//		}
//		
		return koniec_gry;
	}
	void zakoñcz_kolejkê(){};
	
	
	
	
}
