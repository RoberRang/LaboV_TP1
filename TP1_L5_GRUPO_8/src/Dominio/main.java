package Dominio;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		FechaHora fechaHora = new FechaHora(1,4,2024,10,30);
		
		//Add polimorfismo en ENTRADA
		
		Entrada eDepo1 = new EDeporte("Fulbo 1",1,fechaHora,Deporte.FUTBOL, true);
		Entrada eDepo2 = new EDeporte("Fulbo 2",1,fechaHora,Deporte.FUTBOL, false);
		Entrada eDepo3 = new EDeporte("RUGBY",1,fechaHora,Deporte.RUGBY, false);
		Entrada eDepo4 = new EDeporte("HOCKEY",1,fechaHora,Deporte.HOCKEY, false);

		System.out.println( eDepo1.toString() + " , " + eDepo1.DarFechaHora());
		System.out.println( eDepo2.toString()+ " , " + eDepo2.DarFechaHora());
		System.out.println( eDepo3.toString()+ " , " + eDepo3.DarFechaHora());
		System.out.println( eDepo4.toString()+ " , " + eDepo4.DarFechaHora());
		

		//Inicio - Instancia de Teatro 	
		Actor act = new Actor(1,"Jose Morales");
		Actor act2 = new Actor(2,"Roberto");
		Actor act3 = new Actor(3,"Estefania");
		Actor act4 = new Actor(4,"Gabriel");
		Actor act5 = new Actor(5,"Andrea");

		Obra obra = new Obra("Jaimito", 40);
		
		/*System.out.println(obra.addActorPrincipal(act));
		System.out.println(obra.addActorPrincipal(act2));
		System.out.println(obra.addActorPrincipal(act3));
		System.out.println(obra.addActorReparto(act4));
		System.out.println(obra.addActorPrincipal(act5));*/
		
		TipoTeatro tipoteatro = new TipoTeatro(1, "Teatro a la gorra", "Comedia");
		Teatro teatro =new Teatro("Teatro UTN", tipoteatro, obra);
		
		
		Entrada entradaT = new ETeatro("Show UTN",100,fechaHora,teatro);
		Entrada entradaT2 = new ETeatro("White Teatro",100,fechaHora,teatro);
		
		System.out.println(entradaT.toString()+ " , " + entradaT.DarFechaHora());
		System.out.println(entradaT2.toString()+ " , " + entradaT2.DarFechaHora());
		
	// Fin - Instancia de Teatro 
	
	// Instancia ERecital
		
		TipoMusical tm1 = new TipoMusical(1, "Musical", "Rock");
		Banda b1 = new Banda(1, "Blink 182", tm1);
		Banda b2 = new Banda (2, "Limp Bizkit", tm1);
		Banda b3 = new Banda (3, "Airbag", tm1);
		ArrayList<Banda> bs = new ArrayList<>();
		bs.add(b2);
		bs.add(b3);
		ERecital eRecital = new ERecital("Lollapalooza", 3, fechaHora, false, b1, bs);
		ERecital eRecital2 = new ERecital("Lollapalooza", 3, fechaHora, true, b1, bs);
		
		System.out.println(eRecital.toString()+ " , " + eRecital.DarFechaHora());
		System.out.println(eRecital2.toString()+ " , " + eRecital2.DarFechaHora());
		
	// Instancia EInfantil
		
		EInfantil einfantil = new EInfantil("Infantil 1", 30, fechaHora, 7, false);
		EInfantil einfantil2 = new EInfantil("Infantil 1", 30, fechaHora, 9, true);
		
		System.out.println(einfantil.toString()+ " , " + einfantil.DarFechaHora());
		System.out.println(einfantil2.toString()+ " , " + einfantil2.DarFechaHora());

		
		

	}

}
