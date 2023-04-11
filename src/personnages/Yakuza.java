package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int réputation=0;
	
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
	
	public int getRéputation() {
		return réputation;
	}

	public void extorquer(Commercant victime) {
		int gain= victime.getArgent();
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		victime.seFaireExtorquer();
		gagnerArgent(gain);
		parler("J'ai piqué " + gain + "sous de " + victime.getNom() + ", ce qui me fait " + argent + "sous dans ma bourse. Hi! Hi!");
		réputation = réputation + 1;
	}
	
	public void perdre() {
		réputation -=1;
		parler("J'ai perdu mon duel et mes " + argent + "sous, snif... J'ai déshonoré le clan de " + clan);
		perdreArgent(argent);
	}
	
	public void gagner(int gain) {
		gagnerArgent(gain);
		réputation+=1;
		parler("Ce ronin pensait vraiment battre " + nom + "du clan "+ clan + "? Je l'ai dépouillé de ses " + gain + "sous.");
	}
}