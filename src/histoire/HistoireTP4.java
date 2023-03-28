package histoire;

import personnages.Humain;
import personnages.Commercant;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain("Prof","kombucha",54);
		prof.DireBonjour();
		prof.acheter("une boisson", 12);
		prof.Boire();
		prof.acheter("un jeu",2);
		prof.acheter("un kimono", 50);
		
	}

}