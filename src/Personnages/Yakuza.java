package Personnages;

public class Yakuza extends Humain {
	private String clan;
	private int réputation = 0;
	public Yakuza(String nom, String boissonFav, int porteMonnaie, String Clan) {
		super(nom,boissonFav,porteMonnaie);
		this.clan=Clan;
	}
	
	public int getReputation() {
		return réputation;
	}
	public String getClan() {
		return clan;
	}
	
	public void extorquer(Commerçant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() +", si tu tiens à la vie donne moi ta bourse !");
		int vol = victime.seFaireExtorquer();
		réputation+=1;
		parler("J’ai piqué les "+ vol + " sous de "+ victime.getNom() +", ce qui me fait "+ porteMonnaie +" sous dans ma poche. Hi ! Hi !");
	}
}
