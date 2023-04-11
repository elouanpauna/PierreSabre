package personnages;
import java.util.Random;

public class Traitre extends Samourai {
	private int niveauTraitrise=0;
	
	public Traitre(String nom, String boissonFavorite, int argent, String nomSeigneur) {
		super(nom,boissonFavorite,argent,nomSeigneur);
	}
@Override
	
	public void direBonjour() {
		Samourai samourai = new Samourai(nom,boissonFavorite,argent, getSeigneur());
		samourai.direBonjour();
		parler("Mais je suis un traître et mon niveau de traîtrise est : " + niveauTraitrise + ". Chut !");
	}
	
	public void ranconner(Commercant victime) {
		if (niveauTraitrise<3) {
		int argentRanconner= victime.getArgent()*2/10;
		victime.perdreArgent(argentRanconner);
		gagnerArgent(argentRanconner);
		niveauTraitrise++;
		parler("Si tu veux ma protection contre les Yakuza, il va falloir Payer! Donne moi " + argentRanconner + " sous ou gare à toi!");
		victime.parler("Tout de suite grand " + nom + ".");
		}
		else {
			parler("Mince je ne peux plus ranconner personne sinon un samourai risque de me demasquer !");
		}
	}
	
	public void faireLeGentil() {
		if (nbConnaissances<1) {
			parler("Je ne peux faire ami ami avec personne car je ne connais personne ! Snif.");
		}
		else {
			Random rand = new Random();
			int ami= rand.nextInt(nbConnaissances);
			int don=argent*1/20;
			String nomAmi = memoire[ami].getNom();
			parler("Il faut absolument remonter ma cote de confiance. Je vais faire ami ami avec " + nomAmi + ".");
			parler("Bonjour l'ami ! " + "Je voudrais vous aider en vous donnant " + don + " sous.");
			memoire[ami].gagnerArgent(don);
			perdreArgent(don);
			memoire[ami].parler("Merci "+ nom + ". Vous êtes quelqu'un de bien.");
			if (niveauTraitrise>=1) {
				niveauTraitrise--;
			}
		}
	}
}
