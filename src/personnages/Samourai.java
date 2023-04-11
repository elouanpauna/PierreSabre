package personnages;

public class Samourai extends Ronin {
	private String seigneur;
	
	public Samourai(String nom, String boissonFavorite, int argent, String nomSeigneur) {
		super(nom,boissonFavorite,argent);
		this.seigneur =nomSeigneur;
		
	}
	
	public String getSeigneur() {
		return seigneur;
	}

@Override
	
	public void direBonjour() {
		Humain humain = new Humain(nom,boissonFavorite,argent );
		humain.direBonjour();
		parler("Je suis fier de servir le seigneur "+ seigneur + ".");
	}

	public void boire(String boisson) {
		parler("Qu'est-ce que je vais choisir comme boisson ? Tiens je vais prendre du " + boisson + ".");
	}
}
