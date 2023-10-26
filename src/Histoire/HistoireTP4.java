package Histoire;

import Personnages.Commerçant;
import Personnages.Humain;
import Personnages.Ronin;
import Personnages.Yakuza;

public class HistoireTP4 {
	
	public static void main(String[] args) {
		Ronin roro = new Ronin("Roro", "shochu", 54, 1);
		Yakuza yaku = new Yakuza("Yaku le Noir", "Whisky", 45,"Warsong", 10);
		roro.Provoquer(yaku);
	}

}
