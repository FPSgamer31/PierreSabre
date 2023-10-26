package Personnages;

public class Commerçant extends Humain {
	
	public Commerçant(String nom, String boissonFav, int porteMonnaie) {
		super(nom,boissonFav,porteMonnaie);
	}
	
	public int seFaireExtorquer() {
		int vol = porteMonnaie;
		porteMonnaie=0;
		parler("J’ai tout perdu! Le monde est trop injuste...");
		return vol;
	}
	
	public void recevoirArgent(int don) {
		porteMonnaie+=don;
		parler(don+" sous ! Je te remercie généreux donateur!");
	}

}
