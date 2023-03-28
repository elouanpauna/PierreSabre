package personnages;

public class Commercant extends Humain{
	
	
	public Commercant(String nom, int argent){
		super(nom,"th�", argent);
		
	}
	
	public void seFaireExtorquer() {
		perdreArgent(argent);
		parler("J'ai tout perdu! Le monde est trop injuste...");
	}
	
	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler(argent + "sous ! Je te remercie g�n�reux donateur!");
	}
}