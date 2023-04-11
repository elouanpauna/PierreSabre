package histoire;

import personnages.Humain;
import personnages.Commercant;
import personnages.Ronin;
import personnages.Yakuza;
import personnages.Samourai;

public class HistoireTP4 {

	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		Samourai akimoto = new Samourai("Miyamoto", "Sak�", 80, "Akimoto");
		marco.faireConnaissanceAvec(roro);
		marco.faireConnaissanceAvec(yaku);
		marco.faireConnaissanceAvec(chonin);
		marco.faireConnaissanceAvec(kumi);
		marco.listerConnaissances();
		roro.listerConnaissances();
		yaku.listerConnaissances();
		akimoto.faireConnaissanceAvec(marco);
		akimoto.listerConnaissances();
		akimoto.boire("th�");
	}

}