package Personnages;

public class Ronin extends Humain{
	private int honneur=1;
	public Ronin(String nom, String boissonFav, int porteMonnaie, int honneur) {
		super(nom,boissonFav,porteMonnaie);
		this.honneur=honneur;
	}
	
	public void Donner(Commerçant bénéficiaire) {
		int don=porteMonnaie/10;
		porteMonnaie-=don;
		parler(bénéficiaire.getNom()+" prend ces 6 sous.");
		bénéficiaire.recevoirArgent(don);
	}
	
	public void Provoquer(Yakuza adversaire) {
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		int forceRonin=honneur*2;
		int forceYakuza=adversaire.getReputation();
		if(forceRonin>=forceYakuza) {
			parler("Je t’ai eu petit yakusa!");
			porteMonnaie+=adversaire.perdre();
		}else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse en ont pris un coup.");
			honneur-=1;
			adversaire.gagner(porteMonnaie);
		}
	}

}
