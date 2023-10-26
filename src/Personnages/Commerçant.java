package Personnages;

public class Commerçant extends Humain {
	
	public Commerçant(String nom, String boissonFav, int porteMonnaie) {
		super(nom,boissonFav,porteMonnaie);
	}
	
	public int seFaireExtorquer() {
		int vol = porteMonnaie;
		porteMonnaie=0;
		parler(" J’ai tout perdu! Le monde est trop injuste...");
		return vol;
	}
	
	public void recevoirArgent(int don) {
		porteMonnaie+=don;
		parler(don+" sous ! Je te remercie généreux donateur!");
	}

	public static void main(String[] args) {
		Commerçant Marco = new Commerçant("Marco", "Thé", 50);
		Marco.direBonjour();
		Marco.seFaireExtorquer();
		Marco.recevoirArgent(15);
        Marco.boire();
	}

}
