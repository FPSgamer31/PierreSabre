package Personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;
	public Yakuza(String nom, String boissonFav, int porteMonnaie, String clan, int reputation) {
		super(nom,boissonFav,porteMonnaie);
		this.clan=clan;
		this.reputation=reputation;
	}
	
	public int getReputation() {
		return reputation;
	}
	public String getClan() {
		return clan;
	}
	
	public void extorquer(Commerçant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() +", si tu tiens à la vie donne moi ta bourse !");
		int vol = victime.seFaireExtorquer();
		reputation+=1;
		parler("J’ai piqué les "+ vol + " sous de "+ victime.getNom() +", ce qui me fait "+ porteMonnaie +" sous dans ma poche. Hi ! Hi !");
	}
	
	public int perdre() {
		parler("J’ai perdu mon duel et mes "+porteMonnaie+" sous, snif... J'ai déshonoré le clan de "+ clan +".");
		int perte=porteMonnaie;
		porteMonnaie=0;
		reputation-=1;
		return perte;
	}
	
	public void gagner(int gain) {
		parler("Ce ronin pensait vraiment battre "+ getNom() +" du clan de "+ clan +" ? Je l'ai dépouillé de ses "+ gain +" sous.");
	}
}
