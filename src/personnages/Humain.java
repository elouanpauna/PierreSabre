package personnages;

public class Humain {
	public static final int MAX = 30;
	protected String nom;
	protected String boissonFavorite;
	protected int argent;
	protected int nbConnaissances = 0;
	protected Humain[] memoire = new Humain[MAX];

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

	public void direBonjour() {
		parler("Bonjour ! Je m'apelle " + nom + " et j'aime boire du " + boissonFavorite);
	}

	public void Boire() {
		parler("Mmmm, un bon verre de " + boissonFavorite + "! GLOUPS !");
	}

	public void acheter(String bien, int prix) {
		if (argent >= prix) {
			parler("J'ai " + argent + "sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous.");
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix
					+ " sous.");
		}
	}

	public void parler(String texte) {
		System.out.println("(" + nom + " ) -  " + texte);
	}

	public void gagnerArgent(int gain) {
		argent = argent + gain;
	}

	public void perdreArgent(int perte) {
		if (argent - perte < 0) {
			argent = 0;
		} else {
			argent = argent - perte;
		}
	}

	public void faireConnaissanceAvec(Humain autreHumain) {
		Humain humain = new Humain(nom, boissonFavorite, argent);
		direBonjour();
		autreHumain.repondre(humain);
		memoriser(autreHumain);
	}

	private void memoriser(Humain humain) {
		memoire[nbConnaissances] = humain;
		nbConnaissances = (nbConnaissances + 1) % MAX;
	}

	private void repondre(Humain humain) {
		direBonjour();
		memoriser(humain);
	}

	public void listerConnaissances() {
		String texte = "Je connais beaucoup de monde dont : " + memoire[0].getNom();
		for (int i=1;i<nbConnaissances;i++) {
			texte+= ", " + memoire[i].getNom();
		}
		System.out.println(texte);
	}
	
}
