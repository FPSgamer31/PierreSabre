package Histoire;

import Personnages.Commerçant;
import Personnages.Humain;
import Personnages.Ronin;

public class HistoireTP4 {
	
	public static void main(String[] args) {
		Ronin roro = new Ronin("Roro", "shochu", 60);
		Commerçant marco = new Commerçant("Marco", "Thé", 50);
		roro.direBonjour();
		roro.Donner(marco);
	}

}
