package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int r�putation=0;
	
	public Yakuza(String nom, String boissonFavorite, int argent, String nomClan) {
		super(nom,boissonFavorite,argent);
		this.clan=nomClan;
		
	}
	@Override
	
	public void direBonjour() {
		Humain humain = new Humain(getNom(),getBoissonFavorite(),getArgent() );
		humain.direBonjour();
		parler("Mon clan est celui de "+ clan + ".");
	}
	
	public int getR�putation() {
		return r�putation;
	}

	public void extorquer(Commercant victime) {
		int gain= victime.getArgent();
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par l� ?");
		parler(victime.getNom() + ", si tu tiens � la vie donne moi ta bourse !");
		victime.seFaireExtorquer();
		gagnerArgent(gain);
		parler("J'ai piqu� " + gain + "sous de " + victime.getNom() + ", ce qui me fait " + argent + "sous dans ma bourse. Hi! Hi!");
		r�putation = r�putation + 1;
	}
	
	public void perdre() {
		r�putation -=1;
		parler("J'ai perdu mon duel et mes " + argent + "sous, snif... J'ai d�shonor� le clan de " + clan);
		perdreArgent(argent);
	}
	
	public void gagner(int gain) {
		gagnerArgent(gain);
		r�putation+=1;
		parler("Ce ronin pensait vraiment battre " + nom + "du clan "+ clan + "? Je l'ai d�pouill� de ses " + gain + "sous.");
	}
}