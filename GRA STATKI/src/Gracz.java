//gra powinna opiera� si� na graczach
//ka�dy gracz ma swoj� plansz� i swoje statki


public class Gracz {
	
	Plansza plansza_g��wna;
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
	//metoda strza� powinna r�wnie� za ka�dym razem sprawdza�, czy gra powinna si� teraz zako�czy�, ale tylko wtedy kiedy trafi.
	Gracz(){
		Plansza plansza_g��wna;
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
	
	void strza�(){};
	boolean czy_koniec_gry(){
		boolean koniec_gry = false;
		
//		for(Statek x: this.statki){
//			this.
//		}
//		
		return koniec_gry;
	}
	void zako�cz_kolejk�(){};
	
	
	
	
}
