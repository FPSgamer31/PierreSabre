package Personnages;

public class Ronin extends Humain{
	private int honneur=1;
	public Ronin(String nom, String boissonFav, int porteMonnaie) {
		super(nom,boissonFav,porteMonnaie);
	}
	
	public void Donner(Commerçant bénéficiaire) {
		int don=porteMonnaie/10;
		porteMonnaie-=don;
		parler(bénéficiaire.getNom()+" prend ces 6 sous.");
		bénéficiaire.recevoirArgent(don);
	}

}
