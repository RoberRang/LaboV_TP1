package Dominio;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//EDeporte eDepo = new EDeporte("Futbo1", "03/04/2024", "20", 3, Deporte.FUTBOL, true);
		//System.out.println( eDepo.toString());
		
		TipoMusical tm1 = new TipoMusical(1, "Musical", "Rock");
		Banda b1 = new Banda(1, "Blink 182", tm1);
		Banda b2 = new Banda (2, "Limp Bizkit", tm1);
		Banda b3 = new Banda (3, "Airbag", tm1);
		ArrayList<Banda> bs = new ArrayList<>();
		bs.add(b2);
		bs.add(b3);
		ERecital eRecital = new ERecital("Lollapalooza", 3, null, false, b1, bs);
		System.out.println(eRecital.toString());

	}

}
