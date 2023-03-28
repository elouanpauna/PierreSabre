package personnages;

public class Ronin extends Humain{
	private int honneur=1;
	
	public Ronin(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int don=argent/10;
		parler(beneficiaire.getNom() + "prend ces" + don + " sous");
		beneficiaire.recevoir(don);
		perdreArgent(don);
	}
	public void provoquer(Yakuza adversaire) {
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		if (honneur*2 >= adversaire.getRéputation()) {
			gagnerArgent(adversaire.getArgent());
			honneur+=1;
			parler("Je t'ai eu petit yakuza!");
			adversaire.perdre();
		}
		else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(argent);
			honneur-=1;
			perdreArgent(argent);
		}
	}
}
