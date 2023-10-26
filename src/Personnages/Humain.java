package Personnages;

public class Humain {
	public String nom;
	private String boissonFavorite;
	protected int porteMonnaie;
	
	public Humain(String nom, String boissonFavorite, int porteMonnaie) {
		this.nom=nom;
		this.boissonFavorite=boissonFavorite;
		this.porteMonnaie=porteMonnaie;
	}
	
	public String getNom() {
		return nom;
	}
	
	public String getBoissonFavorite( ) {
		return boissonFavorite;
	}
	
	public int getPorteMonnaie( ) {
		return porteMonnaie;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
		}
	
	private String prendreParole() {
		return nom + " : ";
		}
	
	public void direBonjour() {
		parler("Bonjour, je m'appelle "+ nom +" et j'aime boire du "+ boissonFavorite +".");
	}
	
	public void boire() {
		parler("Mmmmm, un bon verre de "+ boissonFavorite +" ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if (porteMonnaie>=prix) {
			parler("J'ai "+ porteMonnaie +" sous en poche. Je vais pouvoir m\'offrir une "+ bien +" à "+ prix +" sous.");
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que "+ porteMonnaie +" sous en poche. Je ne peux même pas m'offrir un "+ bien +" à "+ prix +" sous.");
		}
		
	}
	
	public void gagnerArgent(int gain) {
		porteMonnaie+=gain;
	}
	
	public void perdreArgent(int perte) {
		porteMonnaie-=perte;
	}

}
