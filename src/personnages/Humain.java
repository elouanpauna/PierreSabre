package personnages;

public class Humain {
	protected String nom;
	protected String boissonFavorite;
	protected int argent;
	
	public Humain(String nom, String boissonFavorite, int argent) {
		super();
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}

	public String getBoissonFavorite() {
		return boissonFavorite;
	}

	public int getArgent() {
		return argent;
	}
	
	public void DireBonjour() {
		parler("Bonjour ! Je m'apelle " + nom+ " et j'aime boire du "+ boissonFavorite);
	}
	
	public void Boire() {parler("Mmmm, un bon verre de "+ boissonFavorite+ "! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if (argent>=prix) {
			parler("J'ai " + argent + "sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous.");
			perdreArgent(prix);
		}
		else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix + " sous.");
		}
	}
	
	public void parler(String texte) {
		System.out.println( "(" + nom + " ) -  " + texte);
		}
	
	public void gagnerArgent(int gain) {
		argent = argent + gain;
	}
	
	public void perdreArgent(int perte) {
		if (argent-perte<0) {
			argent=0;
		}
		else {
		argent = argent - perte;
		}
	}
	
}